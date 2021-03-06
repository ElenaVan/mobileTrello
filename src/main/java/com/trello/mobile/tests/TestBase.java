package com.trello.mobile.tests;


import com.trello.mobile.manager.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    protected ApplicationManager app = new ApplicationManager();

    @BeforeSuite

    public void setUp() {
        app.init();
    }


    @AfterSuite
    public void tearDown() {
          app.stop();
      }


}