package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	WebDriver driver;
	
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="input-firstname") WebElement txtFirstName;
	@FindBy(id="input-lastname") WebElement txtLastName;
	@FindBy(id="input-email") WebElement txtEmail;
	@FindBy(id="input-telephone") WebElement txtPhoneNo;
	@FindBy(xpath="//input[@name='password']") WebElement txtPassword;
	@FindBy(xpath="//input[@name='confirm']") WebElement txtConfirmPassword;
	@FindBy(name="agree") WebElement checkBoxPolicy;
	@FindBy(xpath="//input[@value='Continue']") WebElement btnContinue;
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']") WebElement msgConfirmation;
	
	public void setFirstName(String FName) {
		txtFirstName.sendKeys(FName);
	}
	
	public void setLastName(String LName) {
		txtLastName.sendKeys(LName);
	}
	
	public void setEmail(String Email) {
		txtEmail.sendKeys(Email);
	}
	
	public void setPhoneNo(String PhoneNo) {
		txtPhoneNo.sendKeys(PhoneNo);
	}
	
	public void setPassword(String Password) {
		txtPassword.sendKeys(Password);
	}
	
	public void setConfirmPassword(String CPassword) {
		txtConfirmPassword.sendKeys(CPassword);
	}
	
	public void setPolicyBox() {
		checkBoxPolicy.click();
	}
	
	public void clickContinue() {
		btnContinue.click();
	}
	
	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		}
		catch (Exception e) {
			return (e.getMessage());
		}
	}
}
