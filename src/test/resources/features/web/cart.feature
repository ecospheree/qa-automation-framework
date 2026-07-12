Feature: Shopping Cart

  @web
  Scenario: Add product to cart
    Given User is on login page
    When User enters username "standard_user"
    And User enters password "secret_sauce"
    And User clicks login button
    And User adds backpack to cart
    Then Cart badge should display "1"