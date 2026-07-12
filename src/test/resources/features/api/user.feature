Feature: User API

  @api
  Scenario: CRUD User

    When User creates new user
    Then Response status code should be 200

    When User gets created user
    Then Response status code should be 200

    When User updates created user
    Then Response status code should be 200

    When User deletes created user
    Then Response status code should be 200