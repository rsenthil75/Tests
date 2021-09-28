package com.tests;


import com.sample.practice.Pages;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HomePageTest {
    @Test
    public void checkHomePage() {
        String url="https://www.selenium.dev";
        String title ="Selenium";
        Pages.homePage().goTo(url);
        assertEquals(Pages.homePage().getTitle(),title);
        Pages.homePage().close();
    }

}
