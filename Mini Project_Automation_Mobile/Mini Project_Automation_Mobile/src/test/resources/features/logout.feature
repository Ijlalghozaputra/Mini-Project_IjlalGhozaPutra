@BuyDanLogout
Feature: As a new user, i want to be able to log out of my account

  Scenario: As a new user, i want to log out of my account
    Given new user on the home page
    And user click login page to log in
    When new user input "ijlalghoza@gmail.com" on email field
    And new user input "123456" on password field
    And new user click login button
    When user clicks the logout button
    Then user should be logged out of their account