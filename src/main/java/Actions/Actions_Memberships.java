package Actions;

import org.openqa.selenium.interactions.Actions;

import UI_elements.UI_Memberships;
import UI_elements.UI_PersonalDetailsPageHRM;

public class Actions_Memberships extends UI_Memberships{
	
	UI_Memberships ui_memberships=new UI_Memberships();
	UI_PersonalDetailsPageHRM ui_pDetails=new UI_PersonalDetailsPageHRM();
	
	Actions action=new Actions(driver);
	
	
	public void a_navigateToMembershipSection() {
		ui_pDetails.MyInfoButton().click();
		ui_pDetails.memberships_Button().click();
		
	}
	
	public void a_clickAddMembershipsButton() {
		ui_memberships.addMemberships_button().click();
	}
	
	public void a_enterDetails_addMemberships_samedate() throws InterruptedException {
		ui_memberships.memberships_DropDown().click();
		ui_memberships.firstField_dropDown().click();
		ui_memberships.subscription_dropDown().click();
		ui_memberships.firstField_dropDown().click();
		ui_memberships.currency_dropDown().click();
		ui_memberships.lang().click();
		
		action.moveToElement(ui_memberships.commenceDate()).click().perform();
		ui_memberships.todayButton().click();
		
		action.moveToElement(ui_memberships.renewalDate()).click().perform();
	Thread.sleep(2000);
		ui_memberships.todayButton().click();
		ui_memberships.saveButton().click();
		
	}
	
	public void  a_enterDetails_addMemberships() throws InterruptedException {
		ui_memberships.memberships_DropDown().click();
		ui_memberships.firstField_dropDown().click();
		ui_memberships.subscription_dropDown().click();
		ui_memberships.firstField_dropDown().click();
		ui_memberships.currency_dropDown().click();
		ui_memberships.lang().click();
		
		action.moveToElement(ui_memberships.commenceDate()).click().perform();
		ui_memberships.todayButton().click();
		
		action.moveToElement(ui_memberships.date_31()).sendKeys("2023-12-31");
	     Thread.sleep(2000);
	     Thread.sleep(2000);
		ui_memberships.saveButton().click();
		
		Thread.sleep(5000);
	}
	
	public void  a_clickCancelButton() {
		ui_memberships.cancelButton().click();
	}
	
	public void a_EditMembership() {
		ui_memberships.pencilIcon().click();
		ui_memberships.subscriptionAmount().sendKeys("200");
		ui_memberships.saveButton().click();
	}
	
	

}
