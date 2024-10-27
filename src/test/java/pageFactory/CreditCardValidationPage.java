package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreditCardValidationPage {

    @FindBy(id = "creditCardNumber")
    private WebElement creditCardNumberField;

    @FindBy(id = "expiryDate")
    private WebElement expiryDateField;

    public void navigateToLoginPage() {
        // code to navigate to login page
    }

    public void enterCreditCardNumber(String creditCardNumber) {
        creditCardNumberField.sendKeys(creditCardNumber);
    }

    public void enterExpiryDate(String expiryDate) {
        expiryDateField.sendKeys(expiryDate);
    }

    public boolean isInputAccepted() {
        // code to check if input is accepted
        return true;
    }
}