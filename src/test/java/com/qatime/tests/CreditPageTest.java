package com.qatime.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by sergey on 5/17/18.
 */
public class CreditPageTest extends TestBase {

    @Test
    public void test1() {
        app.getNavigationHelper().navigateToCreditPage();
        Assert.assertEquals(app.getNavigationHelper().getTtitleOfPage(), "Интернет-магазин ROZETKA™: фототехника, видеотехника, аудиотехника, компьютеры и компьютерные комплектующие");

    }

}
