Feature: Login
  @valid-login
  Scenario: Android user want to Login
    Given android user on Landing Page
    When android user tap icon login
    And android user input "alex@gmail.com" on email field
    And android user input "123" on password field
    And android user input tab button login
    Then android user on products page

  @invalid-login
  Scenario: Android user want to Login
    Given android user on page
    When android user Tap icon login
    And android user Input "al@gmail.com" on email field
    And android user input "123" On password field
    And android user input Tab button login
    Then warning massage
