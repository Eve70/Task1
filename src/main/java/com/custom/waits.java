package com.custom;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class waits {

    public void customWait(WebDriver driver,long timeout, @NotNull String condition, By locator) {
        switch (condition) {
            case "presenceOfElement":
                new WebDriverWait(driver, timeout).until(ExpectedConditions.presenceOfElementLocated(locator));
            case "elementToBeClickable":
                new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(locator));
        }
    }
    //public void justWait(WebDriver driver) throws InterruptedException {
    //    new WebDriverWait(driver).wait(2000);
    //}
}
