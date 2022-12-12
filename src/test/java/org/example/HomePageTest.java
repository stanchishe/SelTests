package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomePageTest {

    static WebDriver webDriver;

    @BeforeAll
    public static void initiate() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("Start-Maximized");
        webDriver = new ChromeDriver(options);
    }

    @AfterAll
    public static void close() {
        webDriver.close();
        webDriver.quit();
    }

    @Test
    @DisplayName("should check if home page is open correctly")
    public void shouldOpenHomePage() throws InterruptedException {
        HomePage homePage = new HomePage(webDriver);
        webDriver.get("https://www.seleniumeasy.com");
        Assertions.assertEquals("Selenium Easy!", homePage.checkOpenHomePage());
    }

}
