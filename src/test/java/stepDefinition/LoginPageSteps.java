package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;

public class LoginPageSteps {

	WebDriver driver;
	LoginPage loginPage;

	@Given("^I am on the Login Page$")
	public void i_am_on_the_Login_Page() throws Throwable {
		driver = new ChromeDriver();
		driver.get("http://www.example.com");
		loginPage = new LoginPage(driver);
	}

	@When("^I enter a (\d+) digits numeric value in the Credit Card Number field$")
	public void i_enter_a_digits_numeric_value_in_the_Credit_Card_Number_field(int arg1) throws Throwable {
		loginPage.enterCreditCardNumber("1234567890123456");
	}

	@Then("^the system should accept the input$")
	public void the_system_should_accept_the_input() throws Throwable {
		Assert.assertTrue(loginPage.isInputAccepted());
	}

	@When("^I enter a Date format in the Credit Card Expiry Date field$")
	public void i_enter_a_Date_format_in_the_Credit_Card_Expiry_Date_field() throws Throwable {
		loginPage.enterExpiryDate("12/2022");
	}

	@When("^I enter a (\d+) digits numeric value in the Card Verification Number field$")
	public void i_enter_a_digits_numeric_value_in_the_Card_Verification_Number_field(int arg1) throws Throwable {
		loginPage.enterCVV("123");
	}

	@When("^I enter a (\d+) digits alphabets in the Cardholder Name field$")
	public void i_enter_a_digits_alphabets_in_the_Cardholder_Name_field(int arg1) throws Throwable {
		loginPage.enterCardHolderName("John Doe");
	}

	@Then("^the Checkbox for Terms and Condition should be disabled by default$")
	public void the_Checkbox_for_Terms_and_Condition_should_be_disabled_by_default() throws Throwable {
		Assert.assertFalse(loginPage.isCheckboxChecked());
	}

	@Then("^the Submit button should be disabled by default$")
	public void the_Submit_button_should_be_disabled_by_default() throws Throwable {
		Assert.assertFalse(loginPage.isSubmitButtonEnabled());
	}

	@When("^I enter all the correct details and agree to the terms and condition$")
	public void i_enter_all_the_correct_details_and_agree_to_the_terms_and_condition() throws Throwable {
		loginPage.enterCreditCardNumber("1234567890123456");
		loginPage.enterExpiryDate("12/2022");
		loginPage.enterCVV("123");
		loginPage.enterCardHolderName("John Doe");
		loginPage.checkTermsAndCondition();
	}

	@Then("^the Submit button should be enabled$")
	public void the_Submit_button_should_be_enabled() throws Throwable {
		Assert.assertTrue(loginPage.isSubmitButtonEnabled());
	}
}