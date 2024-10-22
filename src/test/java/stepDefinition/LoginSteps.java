package stepDefinition;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

  @Given("^User is on Login Page$")
  public void user_is_on_Login_Page() {
    // Write code here to navigate to login page
  }

  @When("^User enters Credit Card Number as '(.*)'")
  public void user_enters_Credit_Card_Number_as(String cardNumber) {
    // Write code here to enter card number
    Assert.assertEquals(cardNumber.length(), 16);
  }

  @When("^User enters Credit Card Expiry Date as '(.*)'")
  public void user_enters_Credit_Card_Expiry_Date_as(String expiryDate) {
    // Write code here to enter expiry date
    Assert.assertTrue(expiryDate.matches("^(0[1-9]|1[0-2])/[0-9]{2}$"));
  }

  @When("^User enters Card Verification Number as '(.*)'")
  public void user_enters_Card_Verification_Number_as(String cvv) {
    // Write code here to enter CVV
    Assert.assertEquals(cvv.length(), 3);
  }

  @When("^User enters Cardholder Name as '(.*)'")
  public void user_enters_Cardholder_Name_as(String cardholderName) {
    // Write code here to enter cardholder name
    Assert.assertEquals(cardholderName.length(), 30);
  }

  @When("^User agrees to the terms and condition$")
  public void user_agrees_to_the_terms_and_condition() {
    // Write code here to check terms and condition checkbox
  }

  @Then("^Submit button should be enabled$")
  public void submit_button_should_be_enabled() {
    // Write code here to verify submit button is enabled
  }
}