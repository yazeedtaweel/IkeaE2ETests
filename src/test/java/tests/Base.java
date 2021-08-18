package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.net.URL;

import static config.Config.*;


class Base {

    static AppiumDriver<MobileElement> appiumDriver;

    @BeforeTest
    public void setup(){

        try {
            // Define the capabilities
            DesiredCapabilities capabilities =  new DesiredCapabilities();
            capabilities.setCapability(CapabilityType.PLATFORM_NAME, platformName);
            capabilities.setCapability("appPackage", appPackage);
            capabilities.setCapability("appActivity", appActivity);

            // Define the appium server url
            URL url = new URL(URL);

            appiumDriver = new AppiumDriver<MobileElement>(url, capabilities);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    @AfterTest
    public void teardown()
    {
        appiumDriver.quit();
    }
}
