package Test_pkg;



import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Actions.Actions_ADMIN_UserManagement;
import Test_Base.testBase_OrangeHRM;
import UI_elements.UI_ADMIN_UserManagementPageHRM;

public class Test_ADMIN_userManagementPageHRM extends testBase_OrangeHRM {

	Actions_ADMIN_UserManagement actions_userMgmt;
	UI_ADMIN_UserManagementPageHRM ui_userMgmt;

	@BeforeClass
	public void navigateToAdminModule() throws Exception {
		Test_LoginPageHRM testLogin=new Test_LoginPageHRM();
		testLogin.navigateLoginPage();
		testLogin.validate_Loginfunctionality_validUname_validPass();

		actions_userMgmt=new Actions_ADMIN_UserManagement();
		ui_userMgmt=new UI_ADMIN_UserManagementPageHRM();
		ui_userMgmt.adminButton().click();

	}
	
	@Test(priority=0)
	public void checkVisiblity() {
		boolean actual=ui_userMgmt.SystemUser_section().isDisplayed();
		assertTrue(actual);
	}

	@Test(priority=0)
	public void navigateToUserManagement() {
		String actual=driver.getCurrentUrl();
		String expected=prop.getProperty("admin_URL");

		assertEquals(actual,expected);

	}

	@Test(priority=1)
	public void Validate_AddUsersButton_functionality() {
		actions_userMgmt.a_clickAdd();
		boolean actual=ui_userMgmt.AddUser_Section().isDisplayed();
		assertTrue(actual);

	}

	@Test(priority =2)
	public void Validate_CancelButton_Functionality() throws InterruptedException {
		actions_userMgmt.a_EnterDetailsThenCancel();
		Thread.sleep(900);
		boolean actual= ui_userMgmt.SystemUser_section().isDisplayed();
		assertTrue(actual);

	}
	
	@Test(priority=3)
	public void Validate_SaveButtonFunctionality() throws InterruptedException {
		actions_userMgmt.a_clickAdd();
		actions_userMgmt.a_enterDetailsThenSave();		
		
		boolean actual=ui_userMgmt.myName().isDisplayed();
		assertTrue(actual);
		
	}
	
	@Test(priority=4)
	public void Validate_searchButton_Functionality() {
		actions_userMgmt.a_searchButton();
		boolean actual=ui_userMgmt.adminList().isEmpty();
		assertFalse(actual);
	}
	
	@Test(priority=5)
	public void Validate_resetButton_functionality() {
		actions_userMgmt.a_clickResetButton();
		
		String actual=ui_userMgmt.userRole_AddUserSection().getText();
		String expected="-- Select --";
		assertEquals(actual,expected);		
	}
	
	@Test(priority=6)
	public void Validate_DeleteRecordFunctionality() {
		actions_userMgmt.a_deleterecord();
	}
	
	@Test(priority=7)
	public void Validate_editIcon_Functionality() {
		actions_userMgmt.a_clickEditIcon();
		boolean actual=ui_userMgmt.editUserSection().isDisplayed();
		assertTrue(actual);
	}
	
	@Test(priority=8)
	public void Validate_UserEdit_Functionality() {
		actions_userMgmt.a_edit_Record();
		driver.navigate().back();
	}
	
	@AfterClass
	public void shut() throws InterruptedException {
		terminate();
	}

}
