Feature: Check login feature for Orange HRM
  Scenario: Valid login credentials
    Given user is in login page
    When user gives valid credentials
    And clicks login button
    Then user should be logged in and navigated to home page