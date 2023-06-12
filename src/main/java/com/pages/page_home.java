package com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static java.lang.System.in;

public class page_home {
    //Locatig page elements:
    private By loginButton = By.cssSelector("[type=submit]");
    private By inputUsername = By.id("username");
    private By inputPassword = By.id("password");
    private By errorMessage = By.className("alert alert-warning");
    private By logoutButton = By.id("logout");
    private By form = By.className("form-group");

    private String baseUrl = "https://robotsparebinindustries.com/";


    public String getUrl() {
        return baseUrl;
    }

    //Methods for login
    public WebDriver enterUsername(WebDriver driver, String username) {
        driver.findElement(inputUsername).sendKeys(username);
        return driver;
    }

    public WebDriver enterPassword(WebDriver driver, String password) {
        driver.findElement(inputPassword).sendKeys(password);
        return driver;
    }

    public WebDriver clickloginButton(WebDriver driver) {
        driver.findElement(loginButton).click();
        return driver;
    }

    public WebDriver errorMessageIsDisplayed(WebDriver driver) {
        driver.findElement(errorMessage).isDisplayed();
        return driver;
    }

    public WebDriver logoutButtonIsDisplayed(WebDriver driver) {
        driver.findElement(loginButton).isDisplayed();
        return driver;
    }
    public WebDriver clearInput(WebDriver driver){
        driver.findElement(inputUsername).click();
        driver.findElement(inputUsername).clear();
        driver.findElement(inputPassword).click();
        driver.findElement(inputPassword).clear();
        return driver;
    }
}
