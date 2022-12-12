package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RegisterUserTest {

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
    @DisplayName("should register a new user")
    public void shouldRegisterUser() throws InterruptedException {

        String userName = "UserOne_Progress2022_02";
        String userEmail = userName + "@yandex.com";
        String passwordToSet = "PasswordOneSUPERSTRONGPLSSTOP123@!#";
        String expectedResult = "Hello ".concat(userName);
        RegisterUser registerUser = new RegisterUser(webDriver);
        webDriver.get("https://practice.automationtesting.in/my-account");
        Assertions.assertTrue(registerUser.registerCall(userEmail, passwordToSet).contains(expectedResult));
    }
}
