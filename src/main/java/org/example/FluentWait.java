package org.example;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;


import java.time.Duration;

public class FluentWait {
    private WebDriver webDriver;
    private long timeToWait;

    public FluentWait (WebDriver webDriver, long timeToWait) {
        this.webDriver = webDriver;
        this.timeToWait = timeToWait;
    }

    public String fluWait () {
        Wait<WebDriver> waitDriver = new org.openqa.selenium.support.ui.FluentWait<>(webDriver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        return "Hello";
    }
}
