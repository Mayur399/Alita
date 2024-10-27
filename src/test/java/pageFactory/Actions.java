package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Actions {

    @FindBy(id = "creditCardNumber")
    private WebElement creditCardNumber;

    @FindBy(id = "creditCardExpiryDate")
    private WebElement creditCardExpiryDate;

    @FindBy(id = "cardVerificationNumber")
    private WebElement cardVerificationNumber;

    @FindBy(id = "cardholderName")
    private WebElement cardholderName;

    @FindBy(id = "termsAndConditionCheckbox")
    private WebElement termsAndConditionCheckbox;

    @FindBy(id = "submitButton")
    private WebElement submitButton;

    public void launchLoginPage() {
        // code to launch login page
    }

    public void enterCreditCardNumber(String number) {
        creditCardNumber.sendKeys(number);
    }

    public void enterCreditCardExpiryDate(String date) {
        creditCardExpiryDate.sendKeys(date);
    }

    public void enterCardVerificationNumber(String number) {
        cardVerificationNumber.sendKeys(number);
    }

    public void enterCardholderName(String name) {
        cardholderName.sendKeys(name);
    }

    public void clickOnTermsAndConditionCheckbox() {
        termsAndConditionCheckbox.click();
    }

    public boolean isSubmitButtonEnabled() {
        return submitButton.isEnabled();
    }
}