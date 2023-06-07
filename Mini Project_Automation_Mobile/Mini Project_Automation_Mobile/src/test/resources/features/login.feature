@LoginDanRegister
Feature: As an User, I want to success login, So that i can see my home page

  @valid-user
  Scenario: As an user, i want to login with email or password
    Given user on the home page
    And user click login page
    When user input "ijlalghoza@gmail.com" on email field
    And user input "123456" on password field
    And user click login button

  @invalid-user
  Scenario: As an user, i cannot login because wrong email or password
    Given user on the home page
    And user click login page
    When user input "ijlalghoza@gmail.com" on email field
    And user input "passwordSalah!@#1231" on password field
    And user click login button
    Then user see error message "Email atau password tidak valid."

  @invalid-user
  Scenario: As an user, i cannot login because empty password
    Given user on the home page
    And user click login page
    When user input "ijlalghoza@gmail.com" on email field
    And user input "" on password field
    And user click login button
    Then user see error message "password can not empty" in password

  @invalid-user
  Scenario: As an user, i cannot login because empty email
    Given user on the home page
    And user click login page
    When user input "" on email field
    And user input "123456" on password field
    And user click login button
    Then user see error message "email can not empty" in email

  @invalid-user
  Scenario: As an user, i cannot login because empty data
    Given user on the home page
    And user click login page
    When user input "" on email field
    And user input "" on password field
    And user click login button
    Then user see error message "email can not empty" in field email
    Then user see error message "password can not empty" in field password