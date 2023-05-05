package UI_elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test_Base.testBase_OrangeHRM;

public class UI_HomePageHRM extends testBase_OrangeHRM {
	
	@FindBy(className="oxd-userdropdown-tab")
	WebElement userDropDown;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logoutButton;
	
	@FindBy(xpath="//a[@href='/web/index.php/pim/viewMyDetails']")
	WebElement myInfo_HomePage;
	
	public UI_HomePageHRM() {

		PageFactory.initElements(driver, this);  
	}
	
	public WebElement dropDown() {
		return userDropDown;
	}
	
	public WebElement logoutButton() {
		return logoutButton;
	}
	
	public WebElement MyInfoButton() {
		return myInfo_HomePage;
	}


}
