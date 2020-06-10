package com.training.application;

import com.training.framework.BaseScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;

public class MainScreen extends BaseScreen {
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"\")")
    private MobileElement createAccBtn;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"\")")
    private MobileElement loginBtn;


    public MainScreen validatePageElements() {
        String createAccBtnName = createAccBtn.getText();
        String loginBtnName = loginBtn.getText();

        System.out.println("Assert to see if the name of create account button and login button are correct");
        Assert.assertTrue("The name of create account button " + createAccBtnName + " was not correct", createAccBtnName.equals("CREATE ACCOUNT"));
        Assert.assertTrue("The name of create account button " + loginBtnName + " was not correct", loginBtnName.equals("LOG IN"));
        return this;
    }


    public CreateAccountScreen clickCreateAcc() {
        System.out.println("Click on create accoutn button");
        createAccBtn.click();
        return new CreateAccountScreen();
    }


}
