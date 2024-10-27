import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "creditCardNumber")
    WebElement creditCardNumber;

    @FindBy(id = "expiryDate")
    WebElement expiryDate;

    @FindBy(id = "cvv")
    WebElement cvv;

    @FindBy(id = "cardholderName")
    WebElement cardholderName;

    @FindBy(id = "termsAndCondition")
    WebElement termsAndCondition;

    @FindBy(id = "submit")
    WebElement submit;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterCreditCardNumber(String ccNumber) {
        creditCardNumber.sendKeys(ccNumber);
    }

    public boolean isCreditCardNumberAccepted() {
        return creditCardNumber.getAttribute("value").length() == 16;
    }

    // Similar methods for other fields
}