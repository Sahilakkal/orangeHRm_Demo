package Test_pkg;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Actions.Actions_ReviewModule_Performance;
import Test_Base.testBase_OrangeHRM;
import UI_elements.UI_ReviewModule_PerformancePageHRM;

public class Test_ReviewModule_PerformancePageHRM extends testBase_OrangeHRM {

	Actions.Actions_ReviewModule_Performance actions_review;
	UI_ReviewModule_PerformancePageHRM ui_review;


	@BeforeClass
	public void navigateToReviewModule() throws Exception {
		Test_LoginPageHRM testLogin=new Test_LoginPageHRM();
		testLogin.navigateLoginPage();
		testLogin.validate_Loginfunctionality_validUname_validPass();
		actions_review=new Actions_ReviewModule_Performance();
		ui_review=new UI_ReviewModule_PerformancePageHRM();
		actions_review.a_clickPerformanceButton();
	}




	@Test(priority=0)
	public void checkVisibility_PerformancePage() {
		boolean actual=ui_review.jobTitleDropDown().isDisplayed();
		assertTrue(actual);
	}

	@Test(priority=1)
	public void Validate_PerformancePageLoadsSuccessfully() {
		//		test=extent.startTest("Verify whether Performance Page Loads Successfully");
		//		test.log(LogStatus.INFO, "Buzz Page load Test is intiated");
		//		test.log(LogStatus.INFO,"Verify Buzz post Page Loads Successfully");

		String Actual=driver.getCurrentUrl();
		String Expected=prop.getProperty("manageReviews_URL");

		assertEquals(Actual,Expected);

	}

	@Test(priority=2)
	public void Validate_ManagereviewsButton_Functionality() {

		actions_review.a_clickManageReviews();	
	}

	@Test(priority=3,dependsOnMethods="Validate_ManagereviewsButton_Functionality")
	public void validate_SearchReviews_functionality() throws InterruptedException {
		actions_review.a_searchFunctionality();
		boolean actual=ui_review.toastMessage().isDisplayed();
		assertTrue(actual);

	}

	@Test(priority=4)
	public void check_Sort_Functionality() {

	}

	@Test(priority=5,dependsOnMethods="Validate_ManagereviewsButton_Functionality")
	public void validate_collapseButton() {
		actions_review.a_clickcollapse();	
		boolean actual= ui_review.empNameTextAreax().isDisplayed();
		assertFalse(actual);

	}

	@Test(priority=6)
	public void Validate_MyReviewsButton_Functionality() {
		actions_review.a_clickMyReviewsButton();

		String actual=driver.getCurrentUrl();
		String expected=prop.getProperty("myreviews_URL");
		assertEquals(actual,expected);
	}


	@Test(priority=7,dependsOnMethods = "Validate_MyReviewsButton_Functionality")
	public void Validate_ActionsButton_Functionality() {
		actions_review.a_clickActionsButton();
		boolean actual=driver.getCurrentUrl().contains(prop.getProperty("myperformance_URL"));
		assertTrue(actual);
	}

	@Test(priority=8,dependsOnMethods ="Validate_ActionsButton_Functionality" )
	public void Validate_SelfEvaulation_Functionality() throws InterruptedException{
		actions_review.scroll();
		actions_review.a_entereVaulationDetails();

	}

	@Test(priority=9)
	public void Validate_employeeReviewsButton_Functionality() {
		actions_review.a_clickEmployeeReviewsButton();
		String actual=driver.getCurrentUrl();
		String Expected=prop.getProperty("manageReviews_URL");
		assertEquals(actual,Expected);
	}

	@Test(priority=10,dependsOnMethods ="Validate_employeeReviewsButton_Functionality" )
	public void Validate_employeeSort() throws InterruptedException {
		actions_review.a_sort();
	}





}
