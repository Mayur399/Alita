import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.LoginPage;

public class LoginPageSteps {

    WebDriver driver;
    LoginPage loginPage;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.example.com/login");
        loginPage = new LoginPage(driver);
    }

    @When("I enter a {int} digits numeric value in the Credit Card Number field")
    public void i_enter_a_digits_numeric_value_in_the_credit_card_number_field(int num) {
        loginPage.enterCreditCardNumber("1234567890123456");
    }

    @Then("the Credit Card Number field should accept the input")
    public void the_credit_card_number_field_should_accept_the_input() {
        Assert.assertTrue(loginPage.isCreditCardNumberAccepted());
    }

    // Similar steps for other scenarios

    @After
    public void tearDown() {
        driver.quit();
    }
}