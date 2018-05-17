package com.qatime.applogic;

import com.qatime.applogic2.NavigationHelper;
import org.openqa.selenium.WebDriver;

/**
 * Created by sergey on 5/17/18.
 */
public interface IApplicationManager {

    NavigationHelper getNavigationHelper();
    WebDriver getWebdriver();


    void stop();
    void close();
}
