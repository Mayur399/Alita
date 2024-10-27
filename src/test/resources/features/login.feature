Feature: Validate login page

  Scenario: Validate login with valid credentials
    Given User is on login page
    When User enters valid Credit Card Number
    And User enters valid Credit Card Expiry Date
    And User enters valid Card Verification Number
    And User enters valid Cardholder Name
    And User agrees the terms and condition
    Then Submit button should be enabled