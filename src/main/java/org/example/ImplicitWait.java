package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ImplicitWait {

    private WebDriver webDriver;
    private long timeToWait;

    public ImplicitWait (WebDriver webDriver, long timeToWait) {
        this.webDriver = webDriver;
        this.timeToWait = timeToWait;
    }

    public String impWait() {
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeToWait));
        webDriver.get("https://reqres.in/api/users?delay=9");
        WebElement pageContent = webDriver.findElement(By.xpath("/html/body/pre"));
        return pageContent.getText();
    }
}
