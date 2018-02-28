import com.frameworkium.core.ui.tests.BaseTest;
import com.google.common.annotations.VisibleForTesting;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.Console;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class FirstTest
{
    private CalculatorMain calculatorMain;
    public static void main(String [] args) throws MalformedURLException, InterruptedException
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("avd","tomEmulator");
        capabilities.setCapability("deviceName", "tomEmulator");
        capabilities.setCapability("platformVersion", "8.0.0");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

       AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        Thread.sleep(10000);

        driver.launchApp();

        WebElement number7 = driver.findElement(By.id("com.android.calculator2:id/digit_7"));
        WebElement plusButton = driver.findElement(By.id("com.android.calculator2:id/op_add"));
        WebElement equalButton = driver.findElement(By.id("com.android.calculator2:id/eq"));

        number7.click();
        plusButton.click();
        number7.click();
        equalButton.click();
        Thread.sleep(10000);
        driver.quit();
    }
}
