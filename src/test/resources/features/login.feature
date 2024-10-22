Feature: Login Page Validation

  Scenario: Validate Credit Card Number field
    Given I am on the login page
    When I enter a 16 digits numeric value in the Credit Card Number field
    Then the Credit Card Number field should accept the input

  Scenario: Validate Credit Card Expiry Date field
    Given I am on the login page
    When I enter a date in the Credit Card Expiry Date field
    Then the Credit Card Expiry Date field should accept the input

  Scenario: Validate Card Verification Number field
    Given I am on the login page
    When I enter a 3 digits numeric value in the Card Verification Number field
    Then the Card Verification Number field should accept the input

  Scenario: Validate Cardholder Name field
    Given I am on the login page
    When I enter a 30 digits alphabets in the Cardholder Name field
    Then the Cardholder Name field should accept the input

  Scenario: Validate Checkbox field
    Given I am on the login page
    Then the Checkbox field should be disabled by default

  Scenario: Validate Submit button field
    Given I am on the login page
    Then the Submit button should be disabled by default

  Scenario: Enable Submit button
    Given I am on the login page
    When I enter all the correct details and agree the terms and condition
    Then the Submit button should be enabled