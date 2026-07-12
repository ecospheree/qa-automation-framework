Feature: Tag API

  @api
  Scenario: Get all tags
    When User requests tag list
    Then Response status code should be 200