package com.training.tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Runner {

    static AndroidDriver driver;

    @BeforeClass
    public static void beforeClassTestData(){
        System.out.println("BEFORE CLASS");

    }

    @Before
    public void setup() throws MalformedURLException {
        System.out.println("ENTERING IN BEFORE EXECUTION");

        /**
         * dependencies in order to communicate with your phone
         */
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "S10");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("udid", "");
        capabilities.setCapability("newCommandTimeout", "600");
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("app", "/Users/Shared/Appium/yourApk.apk");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("appPackage", "");
        capabilities.setCapability("appActivity", "");


        /**
         * your driver setup creationß
         */
        driver = new

                AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().

                timeouts().

                implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test001() {
        System.out.println("ENTERING IN TEST EXECUTION");

        MobileElement createAccBtn = (MobileElement) driver.findElement(By.id(""));
        MobileElement loginBtn = (MobileElement) driver.findElement(By.id(""));
        String createAccBtnName = createAccBtn.getText();
        String loginBtnName = loginBtn.getText();

        System.out.println("Assert to see if the name of create account button and login button are correct");
        Assert.assertTrue("The name of create account button " + createAccBtnName + " was not correct", createAccBtnName.equals("CREATE ACCOUNT"));
        Assert.assertTrue("The name of create account button " + loginBtnName + " was not correct", loginBtnName.equals("LOG IN"));


        System.out.println("Click on create accoutn button");
        createAccBtn.click();


        MobileElement createAccPageTitle = (MobileElement) driver.findElement(By.id(""));
        MobileElement emailAddresslabel = (MobileElement) driver.findElement(By.id(""));
        MobileElement emailAddressDescription = (MobileElement) driver.findElement(By.id(""));


        System.out.println("Verify that elements from create account page are displayed");
        Assert.assertTrue(createAccPageTitle.isDisplayed());
        Assert.assertTrue(emailAddresslabel.isDisplayed());
        Assert.assertTrue(emailAddressDescription.isDisplayed());

        //we need to add asserts
        MobileElement emailAddressInput = (MobileElement) driver.findElement(By.id(""));
        System.out.println("Sending keys to e-mail address input");
        emailAddressInput.sendKeys("test@gmail.com");
    }

    @Test
    public void test002() {
        System.out.println("ENTERING IN TEST EXECUTION");

        MobileElement createAccBtn = (MobileElement) driver.findElement(By.id(""));
        MobileElement loginBtn = (MobileElement) driver.findElement(By.id(""));
        String createAccBtnName = createAccBtn.getText();
        String loginBtnName = loginBtn.getText();

        System.out.println("Assert to see if the name of create account button and login button are correct");
        Assert.assertTrue("The name of create account button " + createAccBtnName + " was not correct", createAccBtnName.equals("CREATE ACCOUNT"));
        Assert.assertTrue("The name of create account button " + loginBtnName + " was not correct", loginBtnName.equals("LOG IN"));


        System.out.println("Click on create accoutn button");
        createAccBtn.click();


        MobileElement createAccPageTitle = (MobileElement) driver.findElement(By.id(""));
        MobileElement emailAddresslabel = (MobileElement) driver.findElement(By.id(""));
        MobileElement emailAddressDescription = (MobileElement) driver.findElement(By.id(""));


        System.out.println("Verify that elements from create account page are displayed");
        Assert.assertTrue(createAccPageTitle.isDisplayed());
        Assert.assertTrue(emailAddresslabel.isDisplayed());
        Assert.assertTrue(emailAddressDescription.isDisplayed());

        //we need to add asserts
        MobileElement emailAddressInput = (MobileElement) driver.findElement(By.id(""));
        System.out.println("Sending keys to e-mail address input");
        emailAddressInput.sendKeys("test@gmail.com");
    }

    @After
    public void tearDown(){
        System.out.println("ENTERING IN CLOSING PART = AFTER");

        /**
         * closing driver session
         */
        System.out.println("Closing the driver");
        driver.quit();
    }

    @AfterClass
    public static void clearTestData(){
        System.out.println("ENTERING IN AFTER CLASS");
    }

}
