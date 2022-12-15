package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwitchToTests {
    static WebDriver webDriver;
    @BeforeAll
    public static void initiate() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("Start-Maximized");
        webDriver = new ChromeDriver(options);
    }

    @AfterAll
    public static void closeEnv(){
        webDriver.close();
        webDriver.quit();
    }

    @Test
    @DisplayName("should check if alert is created")
    public void checkForAlert() throws InterruptedException {
        SwtichToExp swtichToExp = new SwtichToExp(webDriver);
        Assertions.assertEquals("Hello! I am an alert box!", swtichToExp.createAlert());
    }
}
