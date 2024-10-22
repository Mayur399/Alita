package com.epam.paymentgateway.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id = "creditCardNumber")
    private WebElement creditCardNumber;

    @FindBy(id = "creditCardExpiryDate")
    private WebElement creditCardExpiryDate;

    @FindBy(id = "cardVerificationValue")
    private WebElement cardVerificationValue;

    @FindBy(id = "cardholderName")
    private WebElement cardholderName;

    @FindBy(id = "termsAndConditionCheckbox")
    private WebElement termsAndConditionCheckbox;

    @FindBy(id = "submitButton")
    private WebElement submitButton;

    public void enterCreditCardNumber(String number) {
        creditCardNumber.sendKeys(number);
    }

    public void enterCreditCardExpiryDate(String date) {
        creditCardExpiryDate.sendKeys(date);
    }

    public void enterCardVerificationValue(String value) {
        cardVerificationValue.sendKeys(value);
    }

    public void enterCardholderName(String name) {
        cardholderName.sendKeys(name);
    }

    public void checkTermsAndConditionCheckbox() {
        termsAndConditionCheckbox.click();
    }

    public boolean isSubmitButtonEnabled() {
        return submitButton.isEnabled();
    }

    public boolean isLoginPageDisplayed() {
        return creditCardNumber.isDisplayed();
    }
}