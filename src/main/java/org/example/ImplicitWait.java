package org.example;

import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ImplicitWait {

    private WebDriver driver;

    public ImplicitWait (WebDriver driver) {
        this.driver = driver;
    }

    public String impWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://reqres.in/api/users?delay=9");
        return driver.getPageSource();
    }
}
