package UI_elements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test_Base.testBase_OrangeHRM;

public class UI_ADMIN_UserManagementPageHRM extends testBase_OrangeHRM {

	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement username;

	@FindBy(xpath="(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
	WebElement role;

	@FindBy(xpath="//div[@role='option']/span[text()='Admin']")
	WebElement admin_dropDownList_role;

	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][text()='Admin']")
	WebElement adminButton;

	@FindBy(xpath ="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement addButton;

	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[1]")
	WebElement userRole_AddUserSection;

	@FindBy(xpath="(//div[@role='option'])[1]")
	WebElement firstOption;

	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[2]")
	WebElement status_AddUserSection;

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	WebElement empName_AddUserSection;

	@FindBy(xpath = "//div[@role='option']/span[text()='Enabled']")
	WebElement enabled_Status;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement username_AddUserSection;

	@FindBy(xpath = "(//input[@type='password'])[1]")
	WebElement password_AddUserSection;

	@FindBy(xpath = "(//input[@type='password'])[2]")
	WebElement confrimPassword_AddUserSection;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")
	WebElement submitButton_AddUserSection;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitButton_EditRecordSection;
	
	@FindBy(xpath = "//h5[text()='System Users']")
	WebElement SystemUser_section;
	
	@FindBy(xpath = "//button[@type='button'][text()=' Cancel ']")
	WebElement cancelButton_AddUserSection;
	
	@FindBy(xpath="//div[@id='oxd-toaster_1']")
	WebElement toastMessage;
	
	@FindBy(xpath = "//h6[text()='Add User']")
	WebElement AddUser_Section;
	
	@FindBy(xpath = "//div[text()='sahil akkal']")
	WebElement myName;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchButton_SystemUserSection;
	
	@FindBy(xpath = "//div[text()='Admin']")
	List<WebElement> adminList;
	
	@FindBy(xpath = "//button[text()=' Reset ']")
	WebElement resetButton_SystemUserSection;
	
	@FindBy(xpath = "(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[2]")
	WebElement edit_Admin;
	
	@FindBy(xpath = "//h6[text()='Edit User']")
	WebElement editUserSection;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement uName_EditUserAction;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[2]/div/div[6]/div/button[1]")
    WebElement delete_Icon;	
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]")
	WebElement yesDeleteButton;
	
	

	public UI_ADMIN_UserManagementPageHRM() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement yesDeleteButton() {
		return yesDeleteButton;
		
	}
	
	public WebElement uName_EditUserAction() {
		return uName_EditUserAction;
	}
	
	public WebElement delete_Icon() {
		return delete_Icon;
	}
	
	public WebElement searchButton_SystemUserSection() {
		return searchButton_SystemUserSection;
		
	}
	
	public WebElement edit_Admin() {
		return edit_Admin;
	}
	
	public WebElement submitButton_EditRecordSection() {
		return submitButton_EditRecordSection;
		
	}
	
	public WebElement editUserSection() {
		return editUserSection;
	}
	
	public List<WebElement> adminList() {
		return adminList;
		
	}
	
	public WebElement resetButton_SystemUserSection() {
		return resetButton_SystemUserSection;
		
	}

	public WebElement username() {
		return username;
	}
	
	public WebElement AddUser_Section() {
		return AddUser_Section;
	}
	
    public WebElement myName() {
    	return myName;
		
	}
	public WebElement toastMessage() {
		return toastMessage;
	}
	
	public WebElement cancelButton_AddUserSection() {
		return cancelButton_AddUserSection;
	}

	public WebElement SystemUser_section() {
		return SystemUser_section;

	} 

	public WebElement submitButton_AddUserSection() {
		return submitButton_AddUserSection;

	}
	public WebElement username_AddUserSection() {
		return username_AddUserSection;
	}

	public WebElement password_AddUserSection() {
		return password_AddUserSection;
	}

	public WebElement confrimPassword_AddUserSection() {
		return confrimPassword_AddUserSection;
	}

	public WebElement enabled_Status() {
		return enabled_Status;
	}

	public WebElement empName_AddUserSection() {
		return empName_AddUserSection;
	}

	public WebElement firstOption() {
		return firstOption;
	}

	public WebElement status_AddUserSection() {
		return status_AddUserSection;

	}
	public WebElement addButton() {
		return addButton;
	}


	public WebElement role() {
		return role;
	}

	public WebElement admin_dropDownList_role() {
		return admin_dropDownList_role;
	}

	public WebElement adminButton() {
		return adminButton;
	}

	public WebElement userRole_AddUserSection() {
		return userRole_AddUserSection;
	}
}
