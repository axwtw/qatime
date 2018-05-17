package com.qatime.applogic;

/**
 * Created by sergey on 5/17/18.
 */
public interface INavigationHelper {

    void openMainPage();
    void openRelativeUrl(String url);
    void switchToNewTab();
    void refreshPage();
    void navigateToHomePage();
    void navigateToCreditPage();
}
