package com.qatime.applogic2;

import com.qatime.applogic.IApplicationManager;
import com.qatime.util.Browser;
import com.qatime.util.PropertyLoader;
import com.qatime.webdriver.WebDriverFactory;
import org.openqa.selenium.WebDriver;

/**
 * Created by sergey on 5/17/18.
 */
public class ApplicationManager implements IApplicationManager {
    private NavigationHelper navHelper;
    private WebDriver driver;
    private String baseUrl;
    private String devUrl;
    private String browserName;

    public ApplicationManager() {
        baseUrl = PropertyLoader.loadProperty("site.url");
        browserName = PropertyLoader.loadProperty("browser.name");
        String gridHubUrl = PropertyLoader.loadProperty("grid2.hub");

        Browser browser = new Browser();
        browser.setName(PropertyLoader.loadProperty("browser.name"));
        browser.setVersion(PropertyLoader.loadProperty("browser.version"));
        browser.setPlatform(PropertyLoader.loadProperty("browser.platform"));

        String username = PropertyLoader.loadProperty("user.username");
        String password = PropertyLoader.loadProperty("user.password");


        driver = WebDriverFactory.getInstance(gridHubUrl, browser, username, password);
//        driver = WebDriverFactory.getInstance(browserName, username, password);


        navHelper = new NavigationHelper (this);

    }

    protected WebDriver getWebDriver() { return driver; }
    protected String getBaseUrl() { return baseUrl; }

    @Override
    public NavigationHelper getNavigationHelper() {
        return navHelper;
    }

    @Override
    public WebDriver getWebdriver() {
        return driver;
    }

    @Override
    public void stop() {
        if (driver != null) {
            driver.close();
            System.out.println("driver close");
            driver.quit();
            System.out.println("driver quit");
        }
    }

    @Override
    public void close() {
//        if (driver != null) {
        driver.manage().deleteAllCookies();
//            driver.close();
//        }
    }

}
