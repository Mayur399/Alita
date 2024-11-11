Feature: Login Validation

Scenario: Validate Login Page

Given I am on the login page
When I enter valid credit card number
And I enter valid credit card expiry date
And I enter valid card verification number
And I enter valid cardholder name
And I agree to the terms and conditions
Then the submit button should be enabled