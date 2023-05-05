package Test_pkg;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Test_Base.testBase_OrangeHRM;
import UI_elements.UI_HomePageHRM;
import UI_elements.UI_PersonalDetailsPageHRM;

public class Test_PersonalDetailsPageHRM extends testBase_OrangeHRM {

	UI_PersonalDetailsPageHRM UI_PersDetail;
	UI_HomePageHRM UI_HomPage;
	SoftAssert soft;

	@BeforeClass
	public void navigatePersonalDetailPage() throws InterruptedException, IOException {
		Test_LoginPageHRM b1=new Test_LoginPageHRM();
		b1.navigateLoginPage();
		b1.validate_Loginfunctionality_validUname_validPass();

		UI_PersDetail=new UI_PersonalDetailsPageHRM();
		UI_HomPage=new UI_HomePageHRM();
		UI_HomPage.MyInfoButton().click();
		UI_PersDetail.p_DetailsButton().click();
		soft = new SoftAssert();

	}

	@Test(priority=0)
	public void verify_visiblityPDetailsPage() {
		soft.assertEquals(UI_PersDetail.addAttach_Pdetails().isDisplayed(),true);
		soft.assertEquals(UI_PersDetail.fName_Pdetails().isDisplayed(),true);
		soft.assertEquals(UI_PersDetail.lName_Pdetails().isDisplayed(),true);
		soft.assertEquals(UI_PersDetail.mName_Pdetails().isDisplayed(),true);
		soft.assertEquals(UI_PersDetail.nickName_Pdetails().isDisplayed(),true);
		soft.assertEquals(UI_PersDetail.save_Pdetails().isDisplayed(),true);
		soft.assertEquals(UI_PersDetail.contactDetailsButton().isDisplayed(),true);

	}

	@Test(priority=1,enabled=true)
	public void verify_profilePicUpdate() throws InterruptedException {

		UI_PersDetail.profilePic_Pdetails().click();
		UI_PersDetail.profileadd_Pdetails().sendKeys("C:\\Users\\sakkal\\Desktop\\admin.jfif");
		UI_PersDetail.profileSave_Pdetails().click();
		soft.assertEquals(UI_PersDetail.toastMessage_ProfilePicture().getText(),"Success\n"+ "Successfully Updated");  
		UI_PersDetail.p_DetailsButton().click();
	
	}

	@Test(priority=2)
	public void validate_contactDetailsButtonFunctionality() throws InterruptedException {
		Thread.sleep(2000);
		UI_PersDetail.contactDetailsButton().click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		soft.assertTrue(driver.getCurrentUrl().contains(prop.getProperty("contactDetailsURL")));
		
	}
	
	@Test(priority=3)
	public void validate_emergencyContactsButtonFunctionality() {
		UI_PersDetail.Emergency_Button().click();
		soft.assertTrue(driver.getCurrentUrl().contains(prop.getProperty("EmergURL")));
	}

	@Test(priority=4)
	public void validate_dependentsButtonFunctionality() {
		UI_PersDetail.dependents_Button().click();
		soft.assertTrue(driver.getCurrentUrl().contains(prop.getProperty("DependentURL")));
	}
	
	@Test(priority=5)
	public void validate_immigrationButtonFunctionality() {
		UI_PersDetail.immigration_Button().click();
		soft.assertTrue(driver.getCurrentUrl().contains(prop.getProperty("immigrationURL")));
	}
	
	@Test(priority=6)
	public void validate_jobButtonFunctionality() {
		UI_PersDetail.job_Button().click();
		soft.assertTrue(driver.getCurrentUrl().contains(prop.getProperty("jobURL")));
	}
	
	@Test(priority=7)
	public void validate_salaryButtonFunctionality() {
		UI_PersDetail.Salary_Button().click();
		soft.assertTrue(driver.getCurrentUrl().contains(prop.getProperty("salaryURL")));
	}
	
	@Test(priority=8)
	public void validate_taxButtonFunctionality() {
		UI_PersDetail.tax_Button().click();
		soft.assertTrue(driver.getCurrentUrl().contains(prop.getProperty("taxURL")));
	}
	
	@Test(priority=9)
	public void validate_reportToButtonFunctionality() {
		UI_PersDetail.reportTo_Button().click();
		soft.assertTrue(driver.getCurrentUrl().contains(prop.getProperty("reportToURL")));
	}
	
	@Test(priority=10)
	public void validate_qualificationsButtonFunctionality() {
		UI_PersDetail.qual_Button().click();
		soft.assertTrue(driver.getCurrentUrl().contains(prop.getProperty("qualificationURL")));
	}
	
	@Test(priority=11)
	public void validate_membershipsButtonFunctionality() {
		UI_PersDetail.memberships_Button().click();
		soft.assertTrue(driver.getCurrentUrl().contains(prop.getProperty("membershipsURL")));
	}
	
	@AfterClass
	public void shutPersonal() throws InterruptedException { 
		
		terminate();                                 
	}	
	


}
