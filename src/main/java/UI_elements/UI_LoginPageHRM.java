package UI_elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test_Base.testBase_OrangeHRM;

public class UI_LoginPageHRM extends testBase_OrangeHRM {

	//UI Elements

	@FindBy(xpath="//input[@name='username']")
	WebElement uName; 

	@FindBy(xpath="//input[@name='password']")
	WebElement password;

	@FindBy(xpath="//button[@type='submit']")
	WebElement loginButton;

	@FindBy(xpath="//img[@alt='company-branding']")
	WebElement logo;
	
	@FindBy(xpath="//p[text()='Forgot your password? ']")
	WebElement forgotPass;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement forgotPassUName;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement resetPassword;
	
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	WebElement errorMessageLoginPage;
	
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	WebElement errorMessage_blankField;


	public UI_LoginPageHRM() {

		PageFactory.initElements(driver, this);  
	}

	//Returning WebElements

	public WebElement setUserName() {
		return uName;
	}

	public WebElement setPassword() {
		return password;
	}

	public WebElement clickLogin() {
		return loginButton;
	}

	public WebElement checkLogo() {
		return  logo;
	}
	

	public WebElement forgotPass() {
		return  forgotPass;
	}
	

	public WebElement forgotPassUNAme() {
		return  forgotPassUName;
	}
	
	public WebElement resetPassword() {
		return resetPassword;
	}
//
	public WebElement errorMessageLogin() {
		return errorMessageLoginPage;
	}

	public WebElement errorMessageBlankLogin() {
		return errorMessage_blankField;
	}




}
