package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageFactory.LoginPage;

public class LoginSteps {

	WebDriver driver;
	LoginPage loginPage;

	@Given("^I am on the login page$")
	public void i_am_on_the_login_page() throws Throwable {
		driver = new ChromeDriver();
		driver.get("http://www.example.com");
		loginPage = new LoginPage(driver);
	}

	@When("^I enter valid credit card number$")
	public void i_enter_valid_credit_card_number() throws Throwable {
		loginPage.enterCreditCardNumber("1234567812345678");
	}

	@When("^I enter valid credit card expiry date$")
	public void i_enter_valid_credit_card_expiry_date() throws Throwable {
		loginPage.enterExpiryDate("12/23");
	}

	@When("^I enter valid card verification number$")
	public void i_enter_valid_card_verification_number() throws Throwable {
		loginPage.enterCVV("123");
	}

	@When("^I enter valid cardholder name$")
	public void i_enter_valid_cardholder_name() throws Throwable {
		loginPage.enterCardHolderName("John Doe");
	}

	@When("^I agree to the terms and conditions$")
	public void i_agree_to_the_terms_and_conditions() throws Throwable {
		loginPage.clickAgreeTerms();
	}

	@Then("^the submit button should be enabled$")
	public void the_submit_button_should_be_enabled() throws Throwable {
		Assert.assertTrue(loginPage.isSubmitEnabled());
	}
}