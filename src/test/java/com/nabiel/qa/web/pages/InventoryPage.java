package com.nabiel.qa.web.pages;

import com.nabiel.qa.utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {

    WebDriver driver = DriverFactory.getDriver();

    private final By backpackButton = By.id("add-to-cart-sauce-labs-backpack");
    private final By cartBadge = By.className("shopping_cart_badge");

    public void addBackpackToCart() {
        driver.findElement(backpackButton).click();
    }

    public String getCartBadgeCount() {
        return driver.findElement(cartBadge).getText();
    }
}