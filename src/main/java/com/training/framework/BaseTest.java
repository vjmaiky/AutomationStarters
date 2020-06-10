package com.training.framework;

import org.junit.After;
import org.junit.Before;

public class BaseTest {

    /**
     * On future we can add the part with test data creation
     * @AfterClass, @BeforeClass, etc
     */

    @Before
    public void setUp() {
        DriverManager.createDriver();
    }

    @After
    public void clearSetup() {
        DriverManager.tearDown();
    }

}
