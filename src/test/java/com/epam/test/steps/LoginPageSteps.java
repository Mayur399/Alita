package com.epam.test.steps;

import com.epam.test.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageSteps {

  private LoginPage loginPage;
  private WebDriver driver;

  @Given("I am on the login page")
  public void i_am_on_the_login_page() {
    driver = new ChromeDriver();
    driver.get("http://localhost:8080/login");
    loginPage = new LoginPage(driver);
  }

  @When("I enter a {string} in the Credit Card Number field")
  public void i_enter_a_in_the_Credit_Card_Number_field(String number) {
    loginPage.enterCreditCardNumber(number);
  }

  @When("I enter a {string} in the Credit Card Expiry Date field")
  public void i_enter_a_in_the_Credit_Card_Expiry_Date_field(String date) {
    loginPage.enterExpiryDate(date);
  }

  @When("I enter a {string} in the Card Verification Number field")
  public void i_enter_a_in_the_Card_Verification_Number_field(String cvv) {
    loginPage.enterCVV(cvv);
  }

  @When("I enter a {string} in the Cardholder Name field")
  public void i_enter_a_in_the_Cardholder_Name_field(String name) {
    loginPage.enterCardHolderName(name);
  }

  @When("I agree to the terms and condition")
  public void i_agree_to_the_terms_and_condition() {
    loginPage.agreeToTermsAndConditions();
  }

  @Then("the Submit button should be enabled")
  public void the_Submit_button_should_be_enabled() {
    Assert.assertTrue(loginPage.isSubmitButtonEnabled());
  }

  @Then("the Submit button should be disabled")
  public void the_Submit_button_should_be_disabled() {
    Assert.assertFalse(loginPage.isSubmitButtonEnabled());
  }

  @Then("the Checkbox for Terms and Condition should be disabled by default")
  public void the_Checkbox_for_Terms_and_Condition_should_be_disabled_by_default() {
    Assert.assertFalse(loginPage.isTermsAndConditionsChecked());
  }

  @Then("the system should accept the input")
  public void the_system_should_accept_the_input() {
    // This step is validated by the fact that no exception is thrown when entering the data
  }
}