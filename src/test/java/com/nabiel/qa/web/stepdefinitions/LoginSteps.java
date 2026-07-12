package com.nabiel.qa.web.stepdefinitions;

import com.nabiel.qa.utils.DriverFactory;
import com.nabiel.qa.web.pages.InventoryPage;
import com.nabiel.qa.web.pages.LoginPage;
import io.cucumber.java.en.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();

    @Given("User is on login page")
    public void userIsOnLoginPage() {
        loginPage.openWebsite();
    }

    @When("User enters username {string}")
    public void userEntersUsername(String username) {
        loginPage.inputUsername(username);
    }

    @And("User enters password {string}")
    public void userEntersPassword(String password) {
        loginPage.inputPassword(password);
    }

    @And("User clicks login button")
    public void userClicksLoginButton() {
        loginPage.clickLogin();
    }

    @Then("User should be redirected to inventory page")
    public void userShouldBeRedirectedToInventoryPage() {
        assertTrue(
                DriverFactory.getDriver().getCurrentUrl().contains("inventory")
        );
    }

    @And("User adds backpack to cart")
    public void userAddsBackpackToCart() {
        inventoryPage.addBackpackToCart();
    }

    @Then("Cart badge should display {string}")
    public void cartBadgeShouldDisplay(String total) {
        assertEquals(total, inventoryPage.getCartBadgeCount());
    }
}