package com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class page_home {
    //Locatig page elements:
    private By loginButton = By.linkText("Log in");
    private By inputUsername = By.id("username");
    private By inputPassword = By.id("password");
    private By errorMessage = By.className("alert alert-warning");
    private By logoutButton = By.id("logout");

    private String baseUrl = "https://robotsparebinindustries.com/";



    public String getUrl() {
        return baseUrl;
    }
    //Methods for login
    public WebDriver enterUsername(WebDriver driver, String username){
        driver.findElement(inputUsername).sendKeys(username);
        return driver;
    }
    public WebDriver enterPassword(WebDriver driver, String password){
        driver.findElement(inputPassword).sendKeys(password);
        return driver;
    }

    public WebDriver clickloginButton(WebDriver driver) {
        driver.findElement(loginButton).click();
        return driver;
    }
    public WebDriver errorMessageIsDisplayed(WebDriver driver){
        driver.findElement(errorMessage).isDisplayed();
        return driver;
    }
    public WebDriver logoutButtonIsDisplayed(WebDriver driver){
        driver.findElement(loginButton).isDisplayed();
        return driver;
    }
}
