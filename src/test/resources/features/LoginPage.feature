Feature: Login Page

  Scenario: Successful login with Credit Card
    Given User is on login page
    When User enters valid credit card details
    And User agrees to terms
    Then Submit button is enabled
    And User clicks on submit