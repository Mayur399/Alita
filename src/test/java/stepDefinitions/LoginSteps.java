package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Assert.assertTrue(loginPage.isLoginPageDisplayed());
    }

    @When("I enter a 16 digits numeric value in the Credit Card Number field")
    public void i_enter_a_16_digits_numeric_value_in_the_credit_card_number_field() {
        loginPage.enterCreditCardNumber("1234567890123456");
    }

    @When("I enter a date in the Credit Card Expiry Date field")
    public void i_enter_a_date_in_the_credit_card_expiry_date_field() {
        loginPage.enterExpiryDate("12/24");
    }

    @When("I enter a 3 digits numeric value in the Card Verification Number field")
    public void i_enter_a_3_digits_numeric_value_in_the_card_verification_number_field() {
        loginPage.enterCVV("123");
    }

    @When("I enter a 30 digits alphabets in the Cardholder Name field")
    public void i_enter_a_30_digits_alphabets_in_the_cardholder_name_field() {
        loginPage.enterCardholderName("John Doe");
    }

    @Then("the Credit Card Number field should accept the input")
    public void the_credit_card_number_field_should_accept_the_input() {
        Assert.assertTrue(loginPage.isCreditCardNumberAccepted());
    }

    @Then("the Credit Card Expiry Date field should accept the input")
    public void the_credit_card_expiry_date_field_should_accept_the_input() {
        Assert.assertTrue(loginPage.isExpiryDateAccepted());
    }

    @Then("the Card Verification Number field should accept the input")
    public void the_card_verification_number_field_should_accept_the_input() {
        Assert.assertTrue(loginPage.isCVVAccepted());
    }

    @Then("the Cardholder Name field should accept the input")
    public void the_cardholder_name_field_should_accept_the_input() {
        Assert.assertTrue(loginPage.isCardholderNameAccepted());
    }

    @Then("the Checkbox field should be disabled by default")
    public void the_checkbox_field_should_be_disabled_by_default() {
        Assert.assertFalse(loginPage.isCheckboxEnabled());
    }

    @Then("the Submit button should be disabled by default")
    public void the_submit_button_should_be_disabled_by_default() {
        Assert.assertFalse(loginPage.isSubmitButtonEnabled());
    }

    @When("I enter all the correct details and agree the terms and condition")
    public void i_enter_all_the_correct_details_and_agree_the_terms_and_condition() {
        loginPage.enterCreditCardNumber("1234567890123456");
        loginPage.enterExpiryDate("12/24");
        loginPage.enterCVV("123");
        loginPage.enterCardholderName("John Doe");
        loginPage.checkTermsAndCondition();
    }

    @Then("the Submit button should be enabled")
    public void the_submit_button_should_be_enabled() {
        Assert.assertTrue(loginPage.isSubmitButtonEnabled());
    }
}