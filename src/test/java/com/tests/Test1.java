package com.tests;


import com.sample.practice.Pages;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test1 {
    @Test
    public void checkHomePage() {
        String url="https://www.selenium.dev";
        String title ="Selenium";
        Pages.homePage().goTo(url);
        Assertions.assertEquals(Pages.homePage().getTitle(),title);
        Pages.homePage().close();
    }
}
