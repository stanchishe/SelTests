package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver webDriver;

    public HomePage(WebDriver driver) {
        this.webDriver = driver;
    }

    public String checkOpenHomePage() throws InterruptedException {

        Thread.sleep(3000);
        WebElement welcomePage = webDriver.findElement(By.xpath(
                "//strong[contains(text(), 'Selenium Easy!')]"
        ));
        String returnHome = String.valueOf(welcomePage.getText());
        return returnHome;
    }
}
