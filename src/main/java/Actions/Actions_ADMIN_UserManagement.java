package Actions;

import org.openqa.selenium.interactions.Actions;

import UI_elements.UI_ADMIN_UserManagementPageHRM;

public class Actions_ADMIN_UserManagement extends UI_ADMIN_UserManagementPageHRM {

	UI_ADMIN_UserManagementPageHRM ui_userMgmt=new UI_ADMIN_UserManagementPageHRM();
	Actions action=new Actions(driver);

	public void a_clickAdd() {
		ui_userMgmt.addButton().click();
	}

	public void a_EnterDetailsThenCancel() throws InterruptedException {
		ui_userMgmt.userRole_AddUserSection().click();
		ui_userMgmt.admin_dropDownList_role().click();
		ui_userMgmt.empName_AddUserSection().click();
		ui_userMgmt.empName_AddUserSection().sendKeys("s");
		Thread.sleep(2000);
		ui_userMgmt.firstOption().click();
		ui_userMgmt.status_AddUserSection().click();
		ui_userMgmt.enabled_Status().click();
		ui_userMgmt.username_AddUserSection().sendKeys("sahil akkal");
		ui_userMgmt.password_AddUserSection().sendKeys("#Sahil123");
		ui_userMgmt.confrimPassword_AddUserSection().sendKeys("#Sahil123");
		Thread.sleep(800);
		ui_userMgmt.cancelButton_AddUserSection().click();
		
	}
	
	public void a_enterDetailsThenSave() throws InterruptedException {
		ui_userMgmt.userRole_AddUserSection().click();
		ui_userMgmt.admin_dropDownList_role().click();
		ui_userMgmt.empName_AddUserSection().click();
		ui_userMgmt.empName_AddUserSection().sendKeys("s");
		Thread.sleep(2000);
		ui_userMgmt.firstOption().click();
		ui_userMgmt.status_AddUserSection().click();
		ui_userMgmt.enabled_Status().click();
		ui_userMgmt.username_AddUserSection().sendKeys("sahil akkal");
		ui_userMgmt.password_AddUserSection().sendKeys("#Sahil123");
		ui_userMgmt.confrimPassword_AddUserSection().sendKeys("#Sahil123");
		Thread.sleep(800);
		ui_userMgmt.submitButton_AddUserSection().click();
		Thread.sleep(1000);
		
	}
	
	public void a_searchButton() {
		ui_userMgmt.userRole_AddUserSection().click();
		ui_userMgmt.admin_dropDownList_role().click();
		
		ui_userMgmt.status_AddUserSection().click();
		ui_userMgmt.enabled_Status().click();
		
		ui_userMgmt.searchButton_SystemUserSection().click();
	}
	
	public void a_clickResetButton() {
		ui_userMgmt.resetButton_SystemUserSection().click();
		
	}
	
	public void a_clickEditIcon() {
		ui_userMgmt.edit_Admin().click();
	}
	
	public void a_edit_Record() {
		ui_userMgmt.uName_EditUserAction().clear();
		ui_userMgmt.uName_EditUserAction().sendKeys("admin1");
		ui_userMgmt.submitButton_EditRecordSection().click();;
		
	}
	
	public void  a_deleterecord() {
		ui_userMgmt.delete_Icon().click();
		ui_userMgmt.yesDeleteButton().click();
	}
}
