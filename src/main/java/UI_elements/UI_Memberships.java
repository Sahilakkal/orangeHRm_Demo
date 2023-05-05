package UI_elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test_Base.testBase_OrangeHRM;

public class UI_Memberships extends testBase_OrangeHRM {

	@FindBy(xpath="(//button[@class='oxd-button oxd-button--medium oxd-button--text'][text()=' Add '])[1]")
	WebElement addMemberships_button;

	@FindBy(xpath="(//button[@class='oxd-button oxd-button--medium oxd-button--text'][text()=' Add '])[1]")
	WebElement addAttachments_button;

	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[1]")
	WebElement memberships_DropDown;

	@FindBy(xpath="(//div[@class='oxd-select-option'])[2]")
	WebElement firstField_dropDown;
	
	@FindBy(xpath="//span[text()='Afghanistan Afghani']")
	WebElement lang;

	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[2]")
	WebElement subscription_dropDown;

	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[3]")
	WebElement currency_dropDown;

	@FindBy(xpath="(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[1]")
	WebElement commenceDate;

	@FindBy(xpath="(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[2]")
	WebElement renewalDate;

	@FindBy(xpath="//div[@class='oxd-date-input-link --today'][text()='Today']")
	WebElement todayButton;

	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/button[2]")
	WebElement saveButton;
	
	@FindBy(xpath="//span[text()='Renewal date should be after the commencing date']")
	WebElement errorMessage_RenewalDate;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
	WebElement cancelButton;
    
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div/input")
	WebElement date;
	
	@FindBy(xpath="//button[@class='oxd-icon-button oxd-table-cell-action-space']/i[@class='oxd-icon bi-pencil-fill']")
	WebElement edit_pencilIcon;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input")
	WebElement subscriptionAmount;
	
	@FindBy(xpath="//div[@id='oxd-toaster_1']")
	WebElement toastMessage;
	
	public UI_Memberships() {
		PageFactory.initElements(driver,this);
	}
   
	public WebElement addMemberships_button() {
		return addMemberships_button;
	}
	
	public WebElement toastMessage() {
		return toastMessage;
	}
	
	public WebElement subscriptionAmount() {
		return subscriptionAmount;
	}
	
	public WebElement cancelButton() {
		return cancelButton;
	}
	
	public WebElement date_31() {
		return date;
	}
	
	public WebElement pencilIcon() {
		return edit_pencilIcon;
	}
	
	public WebElement error_renewalDate() {
		return errorMessage_RenewalDate;
	}
	public WebElement lang() {
		return lang;
	}
	public WebElement addAttachments_button() {
		return addAttachments_button;
	}
	
	public WebElement memberships_DropDown() {
		return memberships_DropDown;
	}
	
	public WebElement firstField_dropDown() {
		return firstField_dropDown;
	}
	
	public WebElement subscription_dropDown() {
		return subscription_dropDown;
	}
	
	public WebElement currency_dropDown() {
		return currency_dropDown;
	}
	
	public WebElement commenceDate() {
		return commenceDate;
	}
	
	public WebElement renewalDate() {
		return renewalDate;
	}
	
	public WebElement todayButton() {
		return todayButton;
	}
	
	public WebElement saveButton() {
		return saveButton;
	}
	
//	public WebElement x() {
//		return x;
//	}
//	
	





}
