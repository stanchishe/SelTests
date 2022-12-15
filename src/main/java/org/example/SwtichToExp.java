package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwtichToExp {
    private WebDriver webDriver;

    public SwtichToExp(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String createAlert() throws InterruptedException {
        //Open page
        webDriver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        webDriver.findElement(By.id("accept-choices")).click();

        //Switch frame
        WebElement frameOne = webDriver.findElement(By.id("iframeResult"));
        webDriver.switchTo().frame(frameOne);

        //Create alert
        webDriver.findElement(By.xpath("/html/body/button")).click();

        //Handle alert
        String alertText = webDriver.switchTo().alert().getText();
        Thread.sleep(2000);
        webDriver.switchTo().alert().accept();

        //Another Alert
//        Thread.sleep(2000);
//        Alert alertOnScreen = webDriver.switchTo().alert();
//        alertOnScreen.sendKeys("Progress alert");
//        alertOnScreen.accept();

        //Return to parent
        webDriver.switchTo().parentFrame();

        //Homework: Find element in the parent Frame to prove we have switched to it!

        //Return
        return alertText;
    }
}
