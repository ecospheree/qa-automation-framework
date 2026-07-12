Feature: Login

  @web
  Scenario: Login with valid credentials
    Given User is on login page
    When User enters username "standard_user"
    And User enters password "secret_sauce"
    And User clicks login button
    Then User should be redirected to inventory page