package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterUser {

    private WebDriver webDriver;

    public RegisterUser(WebDriver driver) {
        this.webDriver = driver;
    }


    public String registerCall(String userEmail, String userPass) throws InterruptedException {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement userEmailBox = webDriver.findElement(By.xpath(
                "//input[@id='reg_email']"));
        userEmailBox.sendKeys(userEmail);

        WebElement userPassBox = webDriver.findElement(By.xpath(
                "//input[@id='reg_password']"));
        userPassBox.sendKeys(userPass);

        WebElement regButton = webDriver.findElement(By.xpath(
                "//input[@value='Register']"));
        regButton.click();

        String welcomeUser = webDriver.findElement(By.className("woocommerce-MyAccount-content")).getText();
        return welcomeUser;
    }
}
