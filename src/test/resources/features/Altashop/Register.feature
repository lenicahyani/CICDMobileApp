Feature: Register
  @valid-register
  Scenario: Android user want to Register
    Given android user on Page
    When android user tap Icon login
    And android user tap link Register
    And android user input "cah" on name field
    And android user input "cahya@gmail.com" on email field
    And android user input "123" on password field
    And android user input tab button Register
    Then android user On products page
