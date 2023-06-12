package com.custom;

import org.openqa.selenium.WebDriver;

public class page_frames {

    String pageUrl = "https://robotsparebinindustries.com/";

    public WebDriver goToElementsPage(WebDriver driver, String url) {
        driver.get(url);
        return driver;
    };

}
