package com.projectname.steps;

import com.projectname.pages.LoginPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageSteps {

  WebDriver driver;
  LoginPage loginPage;

  @Given("User is on login page")
  public void user_is_on_login_page() {
    driver = new ChromeDriver();
    driver.get("https://www.example.com/login");
    loginPage = new LoginPage(driver);
  }

  @When("User enters valid credit card details")
  public void user_enters_valid_credit_card_details() {
    loginPage.setCCNumber("4111111111111111");
    loginPage.setCCExpiry("12/22");
    loginPage.setCCCVV("123");
    loginPage.setCCName("Test User");
  }

  @And("User agrees to terms")
  public void user_agrees_to_terms() {
    loginPage.agreeTerms();
  }

  @Then("Submit button is enabled")
  public void submit_button_is_enabled() {
    Assert.assertTrue(loginPage.submit.isEnabled());
  }

  @And("User clicks on submit")
  public void user_clicks_on_submit() {
    loginPage.submit();
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}