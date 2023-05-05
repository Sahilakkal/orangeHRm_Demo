package Test_pkg;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import UI_elements.UI_Memberships;

public class Test_MembershipsModule {
	
	Actions.Actions_Memberships action_memberships;
	UI_Memberships ui_memberships;
	
	@BeforeClass
	public void navigateToReviewModule() throws Exception {
		Test_LoginPageHRM testLogin=new Test_LoginPageHRM();
		testLogin.navigateLoginPage();
		testLogin.validate_Loginfunctionality_validUname_validPass();
		
		action_memberships= new Actions.Actions_Memberships();
		ui_memberships=new UI_Memberships();
		action_memberships.a_navigateToMembershipSection();
		
	}
	
	@Test(priority=0)
	public void Validate_membershipsPageLoadsSuccessfully() {
		boolean actual= ui_memberships.addMemberships_button().isDisplayed();
		assertTrue(actual);
	}
	
	@Test(priority=1)
	public void Validate_addMembershipsButton_Functionality() {
		action_memberships.a_clickAddMembershipsButton();
		boolean actual= ui_memberships.currency_dropDown().isDisplayed();
		assertTrue(actual);
		
	}
	
	@Test(priority=2,dependsOnMethods = "Validate_addMembershipsButton_Functionality")
	public void Validate_enterDetailsAddMemberships() throws InterruptedException {
		action_memberships.a_enterDetails_addMemberships();
		Thread.sleep(800);
		boolean actual= ui_memberships.toastMessage().isDisplayed();
		//assertTrue(actual);
	}
	
	@Test(priority=3,dependsOnMethods ="Validate_enterDetailsAddMemberships")
	public void a_Editmembership_Functionality() {
		action_memberships.a_EditMembership();
		boolean actual= ui_memberships.toastMessage().isDisplayed();
		assertTrue(actual);
	}
	
	@Test(priority=3,dependsOnMethods = "Validate_enterDetailsAddMemberships")
	public void Validate_errorMessage_commencedateequalsToRenewalDate() throws InterruptedException {
		action_memberships.a_enterDetails_addMemberships_samedate();
		boolean actual= ui_memberships.error_renewalDate().isDisplayed();
		assertTrue(actual);
	}
	
	@Test(priority=4,dependsOnMethods ="Validate_errorMessage_commencedateequalsToRenewalDate")
	public  void cancelButton_Function() {
		action_memberships.a_clickCancelButton();
	}
	

	


}
