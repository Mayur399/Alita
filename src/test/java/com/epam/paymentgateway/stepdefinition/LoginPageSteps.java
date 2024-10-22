package com.epam.paymentgateway.stepdefinition;

import com.epam.paymentgateway.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginPageSteps {

    LoginPage loginPage = new LoginPage();

    @Given("^User is on Login Page$")
    public void user_is_on_login_page() {
        Assert.assertTrue(loginPage.isLoginPageDisplayed());
    }

    @When("^User enters Credit Card Number$")
    public void user_enters_credit_card_number() {
        loginPage.enterCreditCardNumber("1234567812345678");
    }

    @When("^User enters Credit Card Expiry Date$")
    public void user_enters_credit_card_expiry_date() {
        loginPage.enterCreditCardExpiryDate("12/24");
    }

    @When("^User enters Card Verification Value$")
    public void user_enters_card_verification_value() {
        loginPage.enterCardVerificationValue("123");
    }

    @When("^User enters Cardholder Name$")
    public void user_enters_cardholder_name() {
        loginPage.enterCardholderName("John Doe");
    }

    @When("^User checks the Terms and Condition checkbox$")
    public void user_checks_the_terms_and_condition_checkbox() {
        loginPage.checkTermsAndConditionCheckbox();
    }

    @Then("^Submit button should be enabled$")
    public void submit_button_should_be_enabled() {
        Assert.assertTrue(loginPage.isSubmitButtonEnabled());
    }
}