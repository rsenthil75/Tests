package com.tests;


import com.sample.practice.Pages;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HomePageTest {
    @Test
    public void testCheckHomePage() {
        String url="https://www.selenium.dev";
        String title ="Selenium";
        Pages.homePage().open(url);
        assertEquals(Pages.homePage().getTitle(),title);
    }

    @Test
    public void testCheckDownloadPage() {
        String url="https://www.selenium.dev/downloads/";
        String title ="Downloads | Selenium";
        Pages.downloadPage().open(url);
        assertEquals(Pages.downloadPage().getTitle(),title);
        Pages.close();
    }


}
