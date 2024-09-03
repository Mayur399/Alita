package com.projectname.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

  WebDriver driver;

  @FindBy(id="cc_number")
  WebElement ccNumber;

  @FindBy(id="cc_expiry")
  WebElement ccExpiry;

  @FindBy(id="cc_cvv")
  WebElement ccCVV;

  @FindBy(id="cc_name")
  WebElement ccName;

  @FindBy(id="terms")
  WebElement terms;

  @FindBy(id="submit")
  WebElement submit;

  public LoginPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public void setCCNumber(String num) {
    ccNumber.sendKeys(num);
  }

  public void setCCExpiry(String date) {
    ccExpiry.sendKeys(date);
  }

  public void setCCCVV(String cvv) {
    ccCVV.sendKeys(cvv);
  }

  public void setCCName(String name) {
    ccName.sendKeys(name);
  }

  public void agreeTerms() {
    terms.click();
  }

  public void submit() {
    submit.click();
  }
}