package com.training.tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TrainingClass {

    static AndroidDriver driver;

    public static void main (String args[]) throws MalformedURLException {
        System.out.println("Hello world");

        /**
         * dependencies in order to communicate with your phone
         */
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel2");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("udid", "yourUDID");
        capabilities.setCapability("newCommandTimeout", "600");
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("app", "/path/to/your/application.apk");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("appPackage", "com.your.app.package.id");
        capabilities.setCapability("appActivity", "com.your.app.main.MainActivity");


        /**
         * your driver setup creation
         */
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        /**
         * interaction with elements
         */

        //we need to add asserts
        MobileElement pageTitle = (MobileElement) driver.findElement(By.id("resourceIdOfPageTitle"));
        Assert.assertTrue("Title of our page was not the desired one", pageTitle.getText().equals("Create Account"));


        MobileElement creatAccount = (MobileElement) driver.findElement(By.id("resourceIdOfCreateAccountBtn"));
        creatAccount.click();


        //we need to add asserts
        MobileElement emailAddressInput = (MobileElement) driver.findElement(By.id("resourceIdOfEmailInputField"));
        emailAddressInput.sendKeys("test@gmail.com");

        //we need to add asserts


        //dummy thread sleep to observe that action was made
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        /**
         * closing driver session
         */
        driver.quit();

    }
}
