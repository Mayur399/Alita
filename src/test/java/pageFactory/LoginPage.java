package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

  @FindBy(id="cardNumber")
  WebElement cardNumber;

  @FindBy(id="expiryDate")
  WebElement expiryDate;

  @FindBy(id="cvv")
  WebElement cvv;

  @FindBy(id="cardholderName")
  WebElement cardholderName;

  @FindBy(id="termsCondition")
  WebElement termsCondition;

  @FindBy(id="submit")
  WebElement submit;

  public LoginPage() {
    PageFactory.initElements(driver, this);
  }

  public void enterCardNumber(String cardNumber) {
    this.cardNumber.sendKeys(cardNumber);
  }

  public void enterExpiryDate(String expiryDate) {
    this.expiryDate.sendKeys(expiryDate);
  }

  public void enterCVV(String cvv) {
    this.cvv.sendKeys(cvv);
  }

  public void enterCardholderName(String cardholderName) {
    this.cardholderName.sendKeys(cardholderName);
  }

  public void agreeTermsCondition() {
    this.termsCondition.click();
  }

  public boolean isSubmitEnabled() {
    return this.submit.isEnabled();
  }
}