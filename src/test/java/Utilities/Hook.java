/**
 * This is a Hook class used by the Cucumber in AppiumScenario
 *
 * Structure:
 * 1. Open Webdriver
 * 2. Set up Appium
 * 3. Start Driver
 * 4. Tear Down
 *
 * Author: Arkaan Quanunga
 *
 * Date: 28/01/2022
 *
 */

package Utilities;

import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class Hook {

    private static WebDriver driver;
    constants constants = new constants();

    @Before
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", constants.chrome_driver_path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Before
    public void setUpAppium(){

        DesiredCapabilities cap= new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, constants.platform_name);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, constants.device_name);
        cap.setCapability(MobileCapabilityType.APP,constants.app_name);

    }

    @After
    public void tearDown(){
        driver.quit();
    }

    public static WebDriver getDriver(){

        return driver;

    }
}
