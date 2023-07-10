package com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.custom.waits;

public class page_home {
    waits waits;

    //Locatig page elements:
    private By loginButton = By.cssSelector("[type=submit]");
    private By inputUsername = By.id("username");
    private By inputPassword = By.id("password");
    private By errorMessage = By.className("alert alert-warning");
    private By logoutButton = By.id("logout");

    private String baseUrl = "https://robotsparebinindustries.com/";


    public String getUrl() {
        return baseUrl;
    }

    //Methods for login
    public WebDriver enterUsername(WebDriver driver, String username) {
        driver.findElement(inputUsername).sendKeys(username);
        assert inputUsername.equals(username);
        return driver;
    }

    public WebDriver enterPassword(WebDriver driver, String password) {
        driver.findElement(inputPassword).sendKeys(password);
        assert inputPassword.equals(password);
        return driver;
    }

    public WebDriver clickloginButton(WebDriver driver) {
        driver.findElement(loginButton).click();
        return driver;
    }
    public WebDriver waitUntilErrorMessageIsDisplayed(WebDriver driver){
        waits.customWait(driver, 2000, "presenceOfElement", errorMessage);
        return driver;
    }
    public WebDriver errorMessageIsDisplayed(WebDriver driver) {
        driver.findElement(errorMessage).isDisplayed();
        assert errorMessage.equals("Invalid username or password.");
        return driver;
    }

    public WebDriver logoutButtonIsDisplayed(WebDriver driver) {
        waits.customWait(driver, 2000, "elementToBeClickable", logoutButton);
        driver.findElement(logoutButton).isDisplayed();
        return driver;
    }

    public WebDriver clearInput(WebDriver driver) {
        driver.findElement(inputUsername).click();
        driver.findElement(inputUsername).clear();
        driver.findElement(inputPassword).click();
        driver.findElement(inputPassword).clear();
        return driver;
    }

}
