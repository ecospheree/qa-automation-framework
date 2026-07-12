package com.nabiel.qa.web.pages;

import com.nabiel.qa.utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.nabiel.qa.utils.ConfigReader;

public class LoginPage {

    WebDriver driver = DriverFactory.getDriver();

    private final By usernameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login-button");

    public void openWebsite() {
        driver.get(ConfigReader.getProperty("base.url"));
    }

    public void inputUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void inputPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}