package Test_pkg;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Actions.Actions_ADMIN_Job;
import Test_Base.testBase_OrangeHRM;
import UI_elements.UI_ADMIN_JobPageHRM;

public class Test_ADMIN_JobPageHRM extends testBase_OrangeHRM {

	Actions_ADMIN_Job actions_Job;
	UI_ADMIN_JobPageHRM ui_Job;

	@BeforeClass
	public void navigateToJobPage() throws Exception {
		Test_ADMIN_userManagementPageHRM test_Admin=new Test_ADMIN_userManagementPageHRM();
		test_Admin.navigateToAdminModule();		
		actions_Job=new Actions_ADMIN_Job();
		ui_Job=new UI_ADMIN_JobPageHRM();		
		actions_Job.a_ClickJobTitles();
	}
	
	@Test(priority=0)
	public void checkVisiblity() {
		boolean actual=ui_Job.JobButton_DropDown().isDisplayed();
		assertTrue(actual);
	}

	@Test(priority=0)
	public void Validate_JobTitlePageLoadsSuccessfully() {
		boolean actual=ui_Job.jobTitles_Text().isDisplayed();
		assertTrue(actual);
	}

	@Test(priority=1)
	public void Validate_UserableToSelectAllRecords() throws InterruptedException {
		actions_Job.a_ClickJobTitlesCheckbox();
		boolean actual=ui_Job.deleteSelectedButton_JobTitles().isDisplayed();
		assertTrue(actual);
	}

	@Test(priority=2,dependsOnMethods ="Validate_UserableToSelectAllRecords")
	public void Validate_UserableToDeSelectAllRecords() throws InterruptedException {
		actions_Job.a_ClickJobTitlesCheckbox();
		String actual=ui_Job.recordsFoundText_JobTitles().getText();
		assertTrue(actual.contains("Found"));
	}

	@Test(priority=3)
	public void Validate_AddButtonJobTitles_Functionality() {
		actions_Job.a_ClickAddButtonJobTitles();
		boolean actual=ui_Job.addJobTitlesPage_Text().isDisplayed();
		assertTrue(actual);
	}
	
	@Test(priority=4,dependsOnMethods = "Validate_AddButtonJobTitles_Functionality")
	public void Validate_CancelButtonAddJobTitle_functionality() {
		actions_Job.a_CancelButtonAddJobTitle();
		boolean actual=ui_Job.jobTitles_Text().isDisplayed();
		assertTrue(actual);
	}
	
	@Test(priority=5)
	public void Validate_UserAbleToAddJobTitle() throws InterruptedException {
		actions_Job.a_ClickAddButtonJobTitles();
		actions_Job.a_addjobTitle();
		
	}
	
	@Test(priority=6)
	public void deleteJobTitle() throws InterruptedException {
		actions_Job.a_deleteJobTitle();
		String actual=ui_Job.toastMessage().getText();
		assertFalse(actual.contains("Failed"));
		
	}
	
	@Test(priority=7)
	public void Validate_DeleteFunctionalityWithTrashIcon() {
		actions_Job.a_deletewithTrashIcon();
		String actual=ui_Job.toastMessage().getText();
		assertFalse(actual.contains("Failed"));
	}
	
	@Test(priority=8)
	public void Validate_PayGradesPageLoadsSuccessfully() {
		actions_Job.a_clickPayGradesButton();
		boolean actual=ui_Job.payGradesText_PayGradesSection().isDisplayed();
		assertTrue(actual);
	}
	
	@Test(priority=9,dependsOnMethods = "Validate_PayGradesPageLoadsSuccessfully")
	public void Validate_nameCheckbox_Functionality() {
		actions_Job.a_clickNameCheckbox_PayGradesSection();
		boolean actual=ui_Job.deleteSelectedButton_JobTitles().isDisplayed();
		assertTrue(actual);
	}
	
	
	@AfterClass
	public void shut() throws InterruptedException {
		terminate();
	}


}
