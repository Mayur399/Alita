package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageFactory.Actions;

public class Steps {

    Actions actions = new Actions();

    @Given("User is on login page")
    public void user_is_on_login_page() {
        actions.launchLoginPage();
    }

    @When("User enters valid Credit Card Number")
    public void user_enters_valid_credit_card_number() {
        actions.enterCreditCardNumber("1234567812345678");
    }

    @When("User enters valid Credit Card Expiry Date")
    public void user_enters_valid_credit_card_expiry_date() {
        actions.enterCreditCardExpiryDate("12/23");
    }

    @When("User enters valid Card Verification Number")
    public void user_enters_valid_card_verification_number() {
        actions.enterCardVerificationNumber("123");
    }

    @When("User enters valid Cardholder Name")
    public void user_enters_valid_cardholder_name() {
        actions.enterCardholderName("John Doe");
    }

    @When("User agrees the terms and condition")
    public void user_agrees_the_terms_and_condition() {
        actions.clickOnTermsAndConditionCheckbox();
    }

    @Then("Submit button should be enabled")
    public void submit_button_should_be_enabled() {
        Assert.assertTrue(actions.isSubmitButtonEnabled());
    }
}