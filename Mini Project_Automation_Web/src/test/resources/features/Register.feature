Feature: Register
  As a user
  I want to see list of product
  So that I can buy new product

  Scenario: I want register Altashop account
    Given I open home page
    When I input new username
    When I input new email
    When I input new password
    When I click register button
    Then I should be redirected to login page