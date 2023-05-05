package UI_elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test_Base.testBase_OrangeHRM;

public class UI_ReviewModule_PerformancePageHRM extends testBase_OrangeHRM {

	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][text()='Performance']")
	WebElement performanceButton;
	
	@FindBy(xpath="//span[@class='oxd-topbar-body-nav-tab-item'][text()='Manage Reviews ']")
	WebElement manageReviewButton;
	
	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-link'][text()='Manage Reviews']")
	WebElement  manageReview_listDropDown;
	
	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-link'][text()='My Reviews']")
	WebElement  myReview_listDropDown;
	
	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-link'][text()='Employee Reviews']")
	WebElement employeeReview_listDropDown;
	
	@FindBy(xpath="(//input[@placeholder='Type for hints...'])[1]")
	WebElement empNameTextArea;
	
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[1]")
	WebElement jobTitleDropDown;
	
	@FindBy(xpath="//div[@role='listbox']/div[2]/span")
	WebElement firstField_listDropdown;
	
	@FindBy(xpath="//div[@class='oxd-select-text-input'][text()='-- Select --']")
	WebElement verifyreset_dropDown;
	
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[2]")
	WebElement reviewStatus_dropDown;
	
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[3]")
	WebElement include_dropDown;
	
	@FindBy(xpath="(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[1]")
	WebElement fromDate_Calendar;
	
	@FindBy(xpath="(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[2]")
	WebElement toDate_Calendar;
	
	@FindBy(xpath="//div[@class='oxd-date-input-link --today']")
	WebElement todayDateButton_Calendar;
	
	@FindBy(xpath="//div[@class='oxd-date-input-link --clear']")
	WebElement clearDateButton_Calendar;
	
	@FindBy(xpath="//button[@type='reset']")
	WebElement resetButton;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement searchButton;
	
	@FindBy(xpath="//div[@class='oxd-table-filter-header-options']/div[3]/button")
	WebElement toggleButton;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-sort-alpha-down oxd-icon-button__icon oxd-table-header-sort-icon']")
	WebElement sort_employee;
	
	@FindBy(xpath="//div[@id='oxd-toaster_1']")
	WebElement toastMessage;
	
	@FindBy(xpath="//button[@class='oxd-icon-button oxd-table-cell-action-space']")
	WebElement actionsButton_myreviews;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement formalManagement_rating_myreviews;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[3]")
	WebElement personalCapabilties_rating_myreviews;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[4]")
	WebElement credible_rating_myreviews;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[5]")
	WebElement commitment_rating_myreviews;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[6]")
	WebElement plans_rating_myreviews;
	
	@FindBy(xpath="(//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical orangehrm-evaluation-grid-comment'])[1]")
	WebElement formalManagement_comment_myreviews;
	
	@FindBy(xpath="(//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical orangehrm-evaluation-grid-comment'])[2]")
	WebElement personalCapabilties_comment_myreviews;
	
	@FindBy(xpath="(//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical orangehrm-evaluation-grid-comment'])[3]")
	WebElement credible_comment_myreviews;
	
	@FindBy(xpath="(//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical orangehrm-evaluation-grid-comment'])[4]")
	WebElement commitment_comment_myreviews;
	
	@FindBy(xpath="(//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical orangehrm-evaluation-grid-comment'])[5]")
	WebElement plans_comment_myreviews;
	
	@FindBy(xpath="(//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical orangehrm-evaluation-grid-comment'])[6]")
	WebElement generalComment_myreviews;
	
	@FindBy(xpath="(//span[text()='Decending'])[1]")
	WebElement descedning_sort;

	
	public UI_ReviewModule_PerformancePageHRM() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement performanceButton() {
		return performanceButton;
	}
	
	public WebElement manageReviewButton() {
		return manageReviewButton;
	}
	
	public WebElement manageReview_listDropDown() {
		return manageReview_listDropDown;
	}
	
	public WebElement myReview_listDropDown() {
		return myReview_listDropDown;
	}
	
	public WebElement employeeReview_listDropDown() {
		return employeeReview_listDropDown;
	}
	
	public WebElement empNameTextAreax() {
		return empNameTextArea;
	}
	
	public WebElement jobTitleDropDown() {
		return jobTitleDropDown;
	}
	
	public WebElement firstField_listDropdown() {
		return firstField_listDropdown;
	}
	
	public WebElement verifyReset_DropDown() {
		return verifyreset_dropDown;
	}
	
	public WebElement reviewStatus_DropDown(){
		return reviewStatus_dropDown;
	}
	
	public WebElement include_dropDown() {
		return include_dropDown;
	}
	
	public WebElement fromDate_Calendar() {
		return fromDate_Calendar;
	}
	
	public WebElement toDate_Calendar() {
		return toDate_Calendar;
	}
	
	public WebElement todayDateButton_Calendar() {
		return todayDateButton_Calendar;
	}
	
	public WebElement clearDateButton_Calendar() {
		return clearDateButton_Calendar;
	}
	
	public WebElement resetButton() {
		return resetButton;
	}
	
	public WebElement submitButton() {
		return searchButton;
	}
	
	public WebElement toggleButton() {
		return toggleButton;
	}
	
	public WebElement sort_employee() {
		return sort_employee;
	}
	
	public WebElement toastMessage() {
		return toastMessage;
	}
	
	public WebElement actionsButton_myreviews() {
		return actionsButton_myreviews;
	}
	
	public WebElement formalManagement_rating_myreviews() {
		return formalManagement_rating_myreviews;
	}
	
	public WebElement personalCapabilties_rating_myreviews() {
		return personalCapabilties_rating_myreviews;
	}
	public WebElement credible_rating_myreviews() {
		return credible_rating_myreviews;
	}
	public WebElement commitment_rating_myreviewsx() {
		return commitment_rating_myreviews;
	}
	public WebElement plans_rating_myreviews() {
		return plans_rating_myreviews;
	}
	public WebElement formalManagement_comment_myreviews() {
		return formalManagement_comment_myreviews;
	}
	
	public WebElement personalCapabilties_comment_myreviews() {
		return personalCapabilties_comment_myreviews;
	}
	
	public WebElement credible_comment_myreviews() {
		return credible_comment_myreviews;
	}
	
	public WebElement commitment_comment_myreviews() {
		return commitment_comment_myreviews;
	}
	
	public WebElement plans_comment_myreviews() {
		return plans_comment_myreviews;
	}
	
	public WebElement generalComment_myreviews() {
		return generalComment_myreviews;
	}
	
	public WebElement sort_desceding() {
		return sort_desceding();
	}
	
	
	
	
	
	
	
	
	


}
