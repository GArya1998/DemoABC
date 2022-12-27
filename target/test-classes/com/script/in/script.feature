Feature: Verifying the Adactin hotel booking application.

  Scenario: Verify the login functionality using Username and Password.
    Given page should be launched
    When user enters the username in the Username field
    And user enters password in the Password field
    Then click on the Login button.
