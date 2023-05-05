package UI_elements;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test_Base.testBase_OrangeHRM;

public class UI_DirectoryPageHRM extends testBase_OrangeHRM {

	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][text()='Directory']")
	WebElement directoryButton_DirPage;

	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	WebElement empName_DirPage;

	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[1]")
	WebElement JobTitledropdown_DirPage;

	@FindBy(xpath="//div[@class='oxd-select-text-input'][text()='QA Engineer']")
	WebElement QAEngineer_JobTitledropdown_DirPage;

	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[2]")
	WebElement Locationdropdown_DirPage;

	@FindBy(xpath="//div[@class='oxd-select-text-input'][text()='Canadian Regional HQ']")
	WebElement Canadian_LocationDropDown_DirPage;

	@FindBy(xpath="//button[@type='submit']")
	WebElement searchButton_DirPage;

	@FindBy(xpath="//button[@type='reset']")
	WebElement resetButton_DirPage;

	@FindBy(xpath="//i[@class='oxd-icon bi-caret-up-fill']")
	WebElement hideCollapseButton;

	@FindBy(xpath="//span[@class='oxd-text oxd-text--span']")
	WebElement recordsFound_DirPage;

	@FindBy(xpath="(//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white orangehrm-directory-card'])[1]")
	WebElement firstRecordFound_DirPage;

	@FindBy(xpath="(//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white orangehrm-directory-card'])[1]/p")
	WebElement firstRecordFoundName_DirPage;
	
	@FindBy(xpath="//div[@id='oxd-toaster_1']")
	WebElement toastMessage_DirPage;
	
	@FindBy(xpath="//div[@class='orangehrm-corporate-directory-sidebar']//i[@class='oxd-icon bi-arrow-right']")
	WebElement arrowButton_DirPage;



	public UI_DirectoryPageHRM() {
		PageFactory.initElements(driver, this);
	}
	


	public WebElement directoryButton_DirPage() {
		return directoryButton_DirPage;
	}

	public WebElement empName_DirectoryPage() {
		return empName_DirPage;
	}

	public WebElement JobTitleDropDown_DirPage() {
		return JobTitledropdown_DirPage;
	}
	public WebElement QAdropdown_DirPage() {
		return QAEngineer_JobTitledropdown_DirPage;
	}

	public WebElement LocationDropDown_DirPage() {
		return Locationdropdown_DirPage;
	}

	public WebElement Canada_LocationdropDown_DirPage() {
		return Canadian_LocationDropDown_DirPage;
	}

	public WebElement searchButton_DirPage() {
		return searchButton_DirPage;
	}

	public WebElement resetButton_DirPage() {
		return resetButton_DirPage;
	}

	public WebElement hideCollapseButton() {
		return hideCollapseButton;
	}

	public WebElement recordsFound_DirPage() {
		return recordsFound_DirPage;
	}

	public WebElement firstRecordFound_DirPage() {
		return firstRecordFound_DirPage;
	}

	public WebElement firstRecordFoundName_DirPage() {
		return firstRecordFoundName_DirPage;
	}
	
	public WebElement ToastMessage_DirPage() {
		return toastMessage_DirPage;
	}
	
	public WebElement arrowButton_DirPage() {
		return arrowButton_DirPage;
	}


}
