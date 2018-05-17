package com.qatime.tests;

import com.qatime.applogic2.ApplicationManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

/**
 * Created by sergey on 5/17/18.
 */
public class TestBase {

    protected static ApplicationManager app;
//    private static final Object lock = new Object();
//    private static boolean initialised = false;
//    public static Logger log = LogManager.getLogger(com.slumberland.tests.TestBase.class.getName());

    @BeforeTest()
    public void init() {

        if (app == null) {
            app = new ApplicationManager();
        }

        app.getNavigationHelper().openMainPage();

    }


    @AfterSuite
    public void tearDown() {
        app.stop();
    }
}

