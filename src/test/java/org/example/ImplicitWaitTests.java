package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImplicitWaitTests {

    static WebDriver webDriver;
    @BeforeAll
    public static void initiate() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("Start-Maximized");
        webDriver = new ChromeDriver(options);
    }

    @Test
    @DisplayName("should check if page values are fetched")
    public void shouldOpenHomePage(){
        ImplicitWait implicitWait = new ImplicitWait(webDriver, 10);
        Assertions.assertTrue(implicitWait.impWait().contains("george.bluth"));
    }

}
