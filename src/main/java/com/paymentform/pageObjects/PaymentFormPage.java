package com.paymentform.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class PaymentFormPage {

    WebDriver ldriver;

    public PaymentFormPage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(name="creditCardNumber")
    WebElement txtCreditCardNumber;

    @FindBy(name="expiryDate")
    WebElement txtExpiryDate;

    @FindBy(name="cvv")
    WebElement txtCVV;

    @FindBy(name="cardHolderName")
    WebElement txtCardHolderName;

    @FindBy(name="termsAndConditions")
    WebElement chkTermsAndConditions;

    @FindBy(name="submit")
    WebElement btnSubmit;

    public void setCreditCardNumber(String ccn) {
        txtCreditCardNumber.sendKeys(ccn);
    }

    public void setExpiryDate(String expDate) {
        txtExpiryDate.sendKeys(expDate);
    }

    public void setCVV(String cvv) {
        txtCVV.sendKeys(cvv);
    }

    public void setCardHolderName(String chn) {
        txtCardHolderName.sendKeys(chn);
    }

    public void clickTermsAndConditions() {
        chkTermsAndConditions.click();
    }

    public boolean isSubmitEnabled() {
        return btnSubmit.isEnabled();
    }
}