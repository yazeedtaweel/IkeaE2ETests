package tests;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.URL;

import static config.Config.*;


class Base {

    static AppiumDriver<MobileElement> appiumDriver;
    static ExtentReports extent;
    ExtentTest test;
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

            String extentReportFile = System.getProperty("user.dir")
                    + "\\extentReportFile.html";
            String extentReportImage = System.getProperty("user.dir")
                    + "\\extentReportImage.png";

            // Create object of extent report and specify the report file path.
            extent = new ExtentReports(extentReportFile, true);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }


    @AfterTest
    public void teardown()
    {

        extent.endTest(test);
        extent.flush();

        appiumDriver.quit();
    }
}
