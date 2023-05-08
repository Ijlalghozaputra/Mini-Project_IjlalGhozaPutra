Feature: Product
  As a admin
  I want to see list of product
  So that I can create new product

  Scenario: GET - As admin I have be able to get all products
    Given I set GET api endpoint
    When I send GET HTTP request
    Then I receive valid HTTP response code 200

  Scenario: POST - As admin I have be able to create a new product
    Given I set POST api endpoint
    When I send POST HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for new product

  Scenario: GET - As admin I have be able to get products by ID
    Given I set GET api endpoint for get product by ID
    When I send GET HTTP request for get product by ID
    Then I receive valid HTTP response code 200