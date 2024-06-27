package com.automation_exercise.tests;

import com.automation_exercise.utilities.BrowserManager;
import com.automation_exercise.utilities.PropertiesLoader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class TestBasic {
    protected static ThreadLocal<WebDriver> tdriver = new ThreadLocal<>();

    public static synchronized WebDriver getDriver() {
        return tdriver.get();
    }

    @BeforeMethod
    public void setup() throws IOException {
        String url = PropertiesLoader.loadProperty("url");
        WebDriver driver = BrowserManager.doBrowserSetup();
        tdriver.set(driver);
        getDriver().manage().window().maximize();
        getDriver().get(url);
    }

    @AfterMethod
    public void tearDown() {
        getDriver().quit();
        tdriver.remove();
    }
}
