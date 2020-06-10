package com.training.tests;

import com.training.application.MainScreen;
import com.training.framework.BaseTest;
import org.junit.Test;

public class NewTests extends BaseTest {

    @Test
    public void test001() {
        MainScreen mainScreen = new MainScreen();
        mainScreen.validatePageElements()
                .clickCreateAcc()
                .validateCreateAccountElements()
                .sendTextEmailAddress();
    }

    @Test
    public void test002() {
        MainScreen mainScreen = new MainScreen();
        mainScreen.validatePageElements()
                .clickCreateAcc()
                .validateCreateAccountElements()
                .sendTextEmailAddress();
    }

    @Test
    public void test003() {
        MainScreen mainScreen = new MainScreen();
        mainScreen.validatePageElements()
                .clickCreateAcc()
                .validateCreateAccountElements()
                .sendTextEmailAddress();
    }
}
