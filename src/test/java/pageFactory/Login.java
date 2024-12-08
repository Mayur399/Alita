package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver driver;
	@FindBy(name="login")
	WebElement userName;

	@FindBy(name="password")
	WebElement password;

	@FindBy(name="submit")
	WebElement submit;

	public Login(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setUserName(String strUserName){
		userName.sendKeys(strUserName);
	}

	public void setPassword(String strPassword){
		password.sendKeys(strPassword);
	}

	public void clickLogin(){
		submit.click();
	}

	public void loginToApp(String strUserName,String strPasword){
		this.setUserName(strUserName);
		this.setPassword(strPasword);
		this.clickLogin();
	}
}