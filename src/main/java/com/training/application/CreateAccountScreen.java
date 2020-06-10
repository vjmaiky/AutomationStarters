package com.training.application;

import com.training.framework.BaseScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;

public class CreateAccountScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"\")")
    private MobileElement createAccPageTitle;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"\")")
    private MobileElement emailAddresslabel;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"\")")
    private MobileElement emailAddressDescription;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"\")")
    private MobileElement emailAddressInput;

    public CreateAccountScreen validateCreateAccountElements() {
        System.out.println("Verify that elements from create account page are displayed");
        Assert.assertTrue(createAccPageTitle.isDisplayed());
        Assert.assertTrue(emailAddresslabel.isDisplayed());
        Assert.assertTrue(emailAddressDescription.isDisplayed());
        return this;
    }

    public CreateAccountScreen sendTextEmailAddress() {
        System.out.println("Sending keys to e-mail address input");
        emailAddressInput.sendKeys("test@gmail.com");
        return this;
    }

}
