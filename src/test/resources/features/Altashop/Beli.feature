Feature: Beli
  Scenario: Android user want to Beli Products
    Given android user on Landing page
    When android user tab button buy in one product
    And android user tab button beli in two product
    Then added to cart
