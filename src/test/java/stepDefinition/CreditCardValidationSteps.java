package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageFactory.CreditCardValidationPage;

public class CreditCardValidationSteps {

    CreditCardValidationPage page = new CreditCardValidationPage();

    @Given("^the user is on the login page$")
    public void the_user_is_on_the_login_page() {
        page.navigateToLoginPage();
    }

    @When("^the user enters a 16 digits numeric value in the Credit Card Number field$")
    public void the_user_enters_a_16_digits_numeric_value_in_the_Credit_Card_Number_field() {
        page.enterCreditCardNumber("1234567812345678");
    }

    @Then("^the system should accept the input$")
    public void the_system_should_accept_the_input() {
        Assert.assertTrue(page.isInputAccepted());
    }

    @When("^the user enters a date in the Credit Card Expiry Date field$")
    public void the_user_enters_a_date_in_the_Credit_Card_Expiry_Date_field() {
        page.enterExpiryDate("12/24");
    }
}