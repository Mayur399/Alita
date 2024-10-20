Feature: Login Page Functionality

  Scenario: Credit Card Number Input
    Given I am on the login page
    When I enter a 16 digits numeric value in the Credit Card Number field
    Then the system should accept the input

  Scenario: Credit Card Expiry Date Input
    Given I am on the login page
    When I enter a date in the Credit Card Expiry Date field
    Then the system should accept the input

  Scenario: Card Verification Number Input
    Given I am on the login page
    When I enter a 3 digits numeric value in the Card Verification Number field
    Then the system should accept the input

  Scenario: Cardholder Name Input
    Given I am on the login page
    When I enter a 30 digits alphabets in the Cardholder Name field
    Then the system should accept the input

  Scenario: Terms and Condition Checkbox
    Given I am on the login page
    Then the Checkbox for Terms and Condition should be disabled by default

  Scenario: Submit Button
    Given I am on the login page
    Then the Submit button should be disabled by default

  Scenario: Enable Submit Button
    Given I am on the login page
    When I enter all the correct details and agree to the terms and condition
    Then the Submit button should be enabled