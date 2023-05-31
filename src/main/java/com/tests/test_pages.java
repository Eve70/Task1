package com.tests;

import com.pages.page_home;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test_pages {

    WebDriver driver;
    //page_elements pageElements;
    page_home pageHome;


    @BeforeTest
    public void loadTheHomePage() throws InterruptedException {
        // Will be run once before all other tests i.e. they will then inherit the driver
        pageHome = new page_home();
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C://Users//Evi//Desktop//Selenium//Chromedriver//chromedriver.exe");
        driver.manage().window().maximize();
        driver.get(pageHome.getUrl());
        Thread.sleep(1000);
    }

    // Note that priority value is set as otherwise the tests will be run by name which will break the inheritance chain

    @Test(priority = 0)
    public void testInvalidLogin() {
        // Launch the home page, generate expected and actual URLs and compare them
        pageHome.enterUsername(driver,"1");
        pageHome.enterPassword(driver, "1");
        pageHome.clickloginButton(driver);
        pageHome.errorMessageIsDisplayed(driver);

    }

    @Test(priority =1)
    public void testValidLogin() {
        pageHome.enterUsername(driver,"maria");
        pageHome.enterPassword(driver, "thoushallnotpass");
        pageHome.clickloginButton(driver);
        pageHome.logoutButtonIsDisplayed(driver);
    }

    @AfterTest
    public void cleanup() {
        driver.quit();
    }
}
