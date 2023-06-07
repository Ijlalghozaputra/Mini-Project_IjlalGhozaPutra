@LoginDanRegister
Feature: As a new user, i want to register in mobile app

  @register-berhasil(valid)
  Scenario: As a new user, i have be able to create new account
    Given new user on the home page
    And new user click login page
    And login page
    When user click register link
    And user input name on name field
    And user input email on email field
    And user input password on password field
    And user click register button

  @register-gagal(invalid)
  Scenario: As a new user, i have be able to create new account using existing account
    Given new user on the home page
    And new user click login page
    And login page
    When user click register link
    And user click register button
    Then user get error message "Gagal :("