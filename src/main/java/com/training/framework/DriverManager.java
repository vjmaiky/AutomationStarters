package com.training.framework;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverManager {

    static AndroidDriver driver;

    public static DesiredCapabilities getCaps() {
        /**
         * dependencies in order to communicate with your phone
         */
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "S10");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("udid", "yourUDID");
        capabilities.setCapability("newCommandTimeout", "600");
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("app", "/path/to/your/application.apk");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("appPackage", "com.your.app.package.id");
        capabilities.setCapability("appActivity", "com.your.app.main.MainActivity");
        return capabilities;
    }

    public static void createDriver() {
        /**
         * your driver setup creationß
         */
        try {
            driver = new

                    AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), getCaps());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().

                timeouts().

                implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void tearDown() {
        /**
         * closing driver session
         */
        System.out.println("Closing the driver");
        driver.quit();
    }

    public static AppiumDriver getDriver() {
        if(driver == null){
            createDriver();
        }
        return driver;
    }

}
