package com.tests;

import com.pages.page_home;
import com.pages.user_home;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class test_pages {

    WebDriver driver;
    page_home pageHome;
    user_home userHome;


    @BeforeTest
    public void loadTheHomePage() throws InterruptedException {
        pageHome = new page_home();
        userHome = new user_home();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(pageHome.getUrl());
        wait(2000);
    }

    // Note that priority value is set as otherwise the tests will be run by name which will break the inheritance chain

    @Test(priority = 0)
    public void testInvalidLogin() throws InterruptedException {
        // Launch the home page, generate expected and actual URLs and compare them
        pageHome.enterUsername(driver,"1");
        pageHome.enterPassword(driver, "1");
        pageHome.clickloginButton(driver);
        pageHome.waitUntilErrorMessageIsDisplayed(driver);
        pageHome.errorMessageIsDisplayed(driver);
        pageHome.clearInput(driver);
        wait(2000);
    }

    @Test(priority =1)
    public void testValidLogin() throws InterruptedException {
        pageHome.enterUsername(driver,"maria");
        pageHome.enterPassword(driver, "thoushallnotpass");
        pageHome.clickloginButton(driver);
        wait(2000);
        pageHome.logoutButtonIsDisplayed(driver);
        wait(2000);
            }
    @Test(priority = 2)
    public void cannotSubmitEmptySalesForm(){
        userHome.formIsDisplayed(driver);
        userHome.submitSaleForm(driver);
        userHome.formIsDisplayed(driver);
    }
    @Test(priority = 2)
    public void canSubmitPositiveSalesForm(){
        userHome.formIsDisplayed(driver);
        userHome.enterFirstName(driver, "Maria");
        userHome.enterLastName(driver, "Ivanova");
        userHome.selectSalesTarget(driver, "40000");
        userHome.enterSalesResult(driver, "50000");
        userHome.submitSaleForm(driver);
    }
    @Test(priority = 2)
    public void canSubmitNegativeSalesForm(){
        userHome.formIsDisplayed(driver);
        userHome.enterFirstName(driver, "Maria");
        userHome.enterLastName(driver, "Ivanova");
        userHome.selectSalesTarget(driver, "60000");
        userHome.enterSalesResult(driver, "50000");
        userHome.submitSaleForm(driver);
    }
    @Test(priority = 2)
    public void canSubmitEqualSalesForm(){
        userHome.formIsDisplayed(driver);
        userHome.enterFirstName(driver, "Maria");
        userHome.enterLastName(driver, "Ivanova");
        userHome.selectSalesTarget(driver, "5000");
        userHome.enterSalesResult(driver, "5000");
        userHome.submitSaleForm(driver);
    }
    @Test(priority = 2)
    public void viewPerformance(){
        userHome.formIsDisplayed(driver);
        userHome.showPerformance(driver);
    }
    @Test(priority = 2)
    public void deleteAllEntries(){
        userHome.formIsDisplayed(driver);
        userHome.deleteAllEntries(driver);
    }

    @AfterTest
    public void cleanup() {
        driver.quit();
    }

}
