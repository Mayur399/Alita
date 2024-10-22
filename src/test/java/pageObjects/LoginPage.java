package pageObjects;

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

	@FindBy(id = "cardHolderName")
	WebElement cardHolderName;

	@FindBy(id = "termsAndCondition")
	WebElement termsAndCondition;

	@FindBy(id = "submit")
	WebElement submit;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

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

	public void checkTermsAndCondition() {
		if (!termsAndCondition.isSelected()) {
			termsAndCondition.click();
		}
	}

	public boolean isCheckboxChecked() {
		return termsAndCondition.isSelected();
	}

	public boolean isSubmitButtonEnabled() {
		return submit.isEnabled();
	}

	public boolean isInputAccepted() {
		// Add logic to check if input is accepted
		return true;
	}
}