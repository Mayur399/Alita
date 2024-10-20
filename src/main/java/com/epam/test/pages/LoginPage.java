package com.epam.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

  @FindBy(id = 'creditCardNumber')
  private WebElement creditCardNumber;

  @FindBy(id = 'expiryDate')
  private WebElement expiryDate;

  @FindBy(id = 'cvv')
  private WebElement cvv;

  @FindBy(id = 'cardHolderName')
  private WebElement cardHolderName;

  @FindBy(id = 'termsAndConditions')
  private WebElement termsAndConditions;

  @FindBy(id = 'submitButton')
  private WebElement submitButton;

  public void enterCreditCardNumber(String number) {
    creditCardNumber.sendKeys(number);
  }

  public void enterExpiryDate(String date) {
    expiryDate.sendKeys(date);
  }

  public void enterCVV(String cvvNumber) {
    cvv.sendKeys(cvvNumber);
  }

  public void enterCardHolderName(String name) {
    cardHolderName.sendKeys(name);
  }

  public void agreeToTermsAndConditions() {
    termsAndConditions.click();
  }

  public void clickSubmitButton() {
    submitButton.click();
  }

}