Feature: Login Page

	Scenario: Credit Card Number Validation
		Given I am on the Login Page
		When I enter a 16 digits numeric value in the Credit Card Number field
		Then the system should accept the input

	Scenario: Credit Card Expiry Date Validation
		Given I am on the Login Page
		When I enter a Date format in the Credit Card Expiry Date field
		Then the system should accept the input

	Scenario: Card Verification Number Validation
		Given I am on the Login Page
		When I enter a 3 digits numeric value in the Card Verification Number field
		Then the system should accept the input

	Scenario: Cardholder Name Validation
		Given I am on the Login Page
		When I enter a 30 digits alphabets in the Cardholder Name field
		Then the system should accept the input

	Scenario: Checkbox Validation
		Given I am on the Login Page
		Then the Checkbox for Terms and Condition should be disabled by default

	Scenario: Submit Button Validation
		Given I am on the Login Page
		Then the Submit button should be disabled by default

	Scenario: Submit Button Enablement
		Given I am on the Login Page
		When I enter all the correct details and agree to the terms and condition
		Then the Submit button should be enabled