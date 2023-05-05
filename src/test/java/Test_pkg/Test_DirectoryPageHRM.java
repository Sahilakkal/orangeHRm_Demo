package Test_pkg;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Actions.Actions_Directory;
import Test_Base.testBase_OrangeHRM;
import UI_elements.UI_DirectoryPageHRM;

public class Test_DirectoryPageHRM extends testBase_OrangeHRM {
	
	UI_DirectoryPageHRM ui_dirPage;
	Actions_Directory actions_dirPage;
	SoftAssert soft;

	@BeforeClass
	public void navigateToDirectoryPage() throws InterruptedException, IOException {
	Test_LoginPageHRM testLogin=new Test_LoginPageHRM();
	testLogin.navigateLoginPage();
	testLogin.validate_Loginfunctionality_validUname_validPass();
	
	ui_dirPage=new UI_DirectoryPageHRM();
	actions_dirPage=new Actions_Directory();
	soft=new SoftAssert();
	actions_dirPage.a_clickDirectory_DirPage();
	}
	
	@Test(priority=0)
	public void validate_dirPageLoadsSuccessfully() {
		
		soft.assertEquals(driver.getCurrentUrl(),prop.getProperty("directory_URL"));
	}
	
	@Test(priority=1)
	public void empName_checkVisiblity_dirPage() {
		soft.assertTrue(ui_dirPage.empName_DirectoryPage().isDisplayed());
	}
	
	@Test(priority=1)
	public void JobTitleDropdown_checkVisiblity_dirPage() {
		soft.assertTrue(ui_dirPage.JobTitleDropDown_DirPage().isDisplayed());
	}
	
	@Test(priority=1)
	public void locationDropDown_checkVisiblity_dirPage() {
		soft.assertTrue(ui_dirPage.LocationDropDown_DirPage().isDisplayed());
	}
	
	@Test(priority=1)
	public void searchButton_checkVisiblity_dirPage() {
		soft.assertTrue(ui_dirPage.searchButton_DirPage().isDisplayed());
	}
	
	@Test(priority=1)
	public void resetButton_checkVisiblity_dirPage() {
		soft.assertTrue(ui_dirPage.resetButton_DirPage().isDisplayed());
	}
	
	@Test(priority=1)
	public void hideCollapseButton_checkVisiblity_dirPage() {
		soft.assertTrue(ui_dirPage.hideCollapseButton().isDisplayed());
	}
	
	@Test(priority=2)
	public void validate_FilterSearch_functionality() throws InterruptedException {
		actions_dirPage.a_enterDetails_DirPage();
		
		if(ui_dirPage.ToastMessage_DirPage().getText().contains("No")) {
			soft.assertTrue(true);
		}
		
		else {
			soft.assertTrue(ui_dirPage.recordsFound_DirPage().getText().contains("Records Found"));
		}
		Thread.sleep(4000);
	}
	
	@Test(priority=3)
	public void resetbutton_Functionality_DirPage() throws InterruptedException {
		actions_dirPage.a_resetclick();
		Thread.sleep(5000);
		System.out.println(ui_dirPage.JobTitleDropDown_DirPage().getText());
		soft.assertEquals(ui_dirPage.JobTitleDropDown_DirPage().getText(), "-- Select --");
	}
	
	@Test(priority=4)
	public void validate_recordinfo() {
		actions_dirPage.a_getrecordinfo();
		soft.assertTrue(ui_dirPage.firstRecordFoundName_DirPage().isDisplayed());
	}
	
	@Test(priority=5)
	public void validate_arrowButton() throws InterruptedException {
		Thread.sleep(2000);
		actions_dirPage.a_clickarrowbutton();
		
		soft.assertFalse(ui_dirPage.firstRecordFoundName_DirPage().isDisplayed());
	}
	
	@AfterClass
	public void shut_DirPage() throws InterruptedException {
		terminate();
	}
	
}
