import com.frameworkium.core.ui.tests.BaseTest;
import com.google.common.annotations.VisibleForTesting;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.io.Console;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.id;

public class FirstTest extends BaseTest
{
    private CalculatorMain calculatorMain;

    @Test
    public void main()
    {

    }
}
