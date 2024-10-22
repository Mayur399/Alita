Feature: Login Page Feature

Scenario: Validate Login Page

Given User is on Login Page
When User enters Credit Card Number
And User enters Credit Card Expiry Date
And User enters Card Verification Value
And User enters Cardholder Name
And User checks the Terms and Condition checkbox
Then Submit button should be enabled