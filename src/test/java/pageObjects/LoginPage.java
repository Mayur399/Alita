package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id = "creditCardNumber")
    private WebElement creditCardNumberField;

    @FindBy(id = "expiryDate")
    private WebElement expiryDateField;

    @FindBy(id = "cvv")
    private WebElement cvvField;

    @FindBy(id = "cardholderName")
    private WebElement cardholderNameField;

    @FindBy(id = "termsAndCondition")
    private WebElement termsAndConditionCheckbox;

    @FindBy(id = "submit")
    private WebElement submitButton;

    public void enterCreditCardNumber(String creditCardNumber) {
        creditCardNumberField.sendKeys(creditCardNumber);
    }

    public void enterExpiryDate(String expiryDate) {
        expiryDateField.sendKeys(expiryDate);
    }

    public void enterCVV(String cvv) {
        cvvField.sendKeys(cvv);
    }

    public void enterCardholderName(String cardholderName) {
        cardholderNameField.sendKeys(cardholderName);
    }

    public void checkTermsAndCondition() {
        termsAndConditionCheckbox.click();
    }

    public boolean isLoginPageDisplayed() {
        return creditCardNumberField.isDisplayed();
    }

    public boolean isCreditCardNumberAccepted() {
        return creditCardNumberField.getAttribute("value").length() == 16;
    }

    public boolean isExpiryDateAccepted() {
        return expiryDateField.getAttribute("value").matches("\\d{2}/\\d{2}");
    }

    public boolean isCVVAccepted() {
        return cvvField.getAttribute("value").length() == 3;
    }

    public boolean isCardholderNameAccepted() {
        return cardholderNameField.getAttribute("value").length() <= 30;
    }

    public boolean isCheckboxEnabled() {
        return termsAndConditionCheckbox.isSelected();
    }

    public boolean isSubmitButtonEnabled() {
        return submitButton.isEnabled();
    }
}