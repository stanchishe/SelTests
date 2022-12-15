package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExplicitWait {
    private WebDriver webDriver;
    private long timeToWait;

    public ExplicitWait (WebDriver webDriver, long timeToWait) {
        this.webDriver = webDriver;
        this.timeToWait = timeToWait;
    }

    public String expWait () {
        webDriver.get("https://google.com/");
        webDriver.findElement(By.id("L2AGLb")).click();
        webDriver.findElement(By.name("q")).sendKeys("yahoo" + Keys.ENTER);

        WebElement firstResul = new WebDriverWait(webDriver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));


        String firstResultText = firstResul.getText();
        System.out.println(firstResultText);

        return firstResultText;
    }
}
