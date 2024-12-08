package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageFactory.Login;

public class LoginSteps {

	WebDriver driver;
	Login objLogin;

	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
		driver = new ChromeDriver();
		driver.get("http://www.store.demoqa.com");
	}

	@When("User Navigate to LogIn Page")
	public void user_Navigate_to_LogIn_Page() {
		objLogin = new Login(driver);
		objLogin.loginToApp("testuser_1", "Test@123");
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {
		Assert.assertTrue(objLogin.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
	}
}