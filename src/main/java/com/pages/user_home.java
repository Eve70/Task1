package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class user_home {
    private By submitButton = By.linkText("Submit");
    private By showPerformanceButton = By.linkText("Show performance");
    private By deleteAllEntriesButton = By.linkText("Delete all sales entries");
    private By inputFirstName = By.id("firstname");
    private By inputLastName = By.id("lastname");
    private By selectSalesTarget = By.id("salestarget");
    private By inputSalesResult= By.id("salesresult");
    private By formSales = By.id("sales-form");

    public WebDriver formIsDisplayed(WebDriver driver){
        driver.findElement(formSales).isDisplayed();
        return driver;
    }
    public WebDriver submitSaleForm(WebDriver driver){
        driver.findElement(submitButton).click();
        return driver;
    }
    public WebDriver enterFirstName(WebDriver driver, String firstName){
        driver.findElement(inputFirstName).sendKeys(firstName);
        return driver;
    }
    public WebDriver enterLastName(WebDriver driver, String lastName){
        driver.findElement(inputLastName).sendKeys(lastName);
        return driver;
    }
    public WebDriver selectSalesTarget(WebDriver driver, String salesTarget){
        Select selectTarget = new Select(driver.findElement(selectSalesTarget));
        selectTarget.selectByValue(salesTarget);
        return driver;
    }
    public WebDriver enterSalesResult(WebDriver driver, String salesResult){
        driver.findElement(inputSalesResult).sendKeys(salesResult);
        return driver;
    }

    public WebDriver showPerformance(WebDriver driver){
        driver.findElement(showPerformanceButton).click();
        return driver;
    }
    public WebDriver deleteAllEntries(WebDriver driver){
        driver.findElement(deleteAllEntriesButton).click();
        return driver;
    }
}
