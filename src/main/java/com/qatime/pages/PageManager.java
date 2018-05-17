package com.qatime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sergey on 5/17/18.
 */
public class PageManager {

    private WebDriver driver;

    public HomePage homePage;
    public CreditPage creditPage;


    public PageManager(WebDriver driver) {
        this.driver = driver;
        homePage = initElements(new HomePage(this));
        creditPage = initElements(new CreditPage(this));

    }

    private <T extends Page> T initElements(T page) {
        PageFactory.initElements(driver, page);
        return page;
    }

    public WebDriver getWebDriver() {
        return driver;
    }

}
