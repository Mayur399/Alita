Feature: Login Functionality

  Scenario: Successful Login with Valid Credentials
    Given User is on Login Page
    When User enters Credit Card Number as '1234567812345678'
    And User enters Credit Card Expiry Date as '12/24'
    And User enters Card Verification Number as '123'
    And User enters Cardholder Name as 'John Doe'
    And User agrees to the terms and condition
    Then Submit button should be enabled