package Test_pkg;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Actions.Actions_Dashboard;
import Test_Base.testBase_OrangeHRM;
import UI_elements.UI_DashboardPageHRM;

public class Test_DashboardPageHRM extends testBase_OrangeHRM {

	Actions_Dashboard actionDashboard;
	UI_elements.UI_DashboardPageHRM ui_DashBoard;
	Actions actions;
	public ExtentTest test;
	public ExtentReports extent;


	@BeforeClass
	public void navigateDashboard() throws IOException, InterruptedException {
		Test_LoginPageHRM test_login=new Test_LoginPageHRM();
		test_login.navigateLoginPage();
		test_login.validate_Loginfunctionality_validUname_validPass();
		ui_DashBoard=new UI_DashboardPageHRM();
		actionDashboard=new Actions_Dashboard();
		actionDashboard.a_clickDashboard();
		actions=new Actions(driver);
		Thread.sleep(4000);	
	}

	@BeforeTest
	public void x() {
		extent=new ExtentReports("C:\\Users\\sakkal\\Desktop\\reports\\DashboardTestreports.html",true);	
	}

	@AfterTest
	public void y() {
		extent.endTest(test);
		extent.flush();
	}

	@Test(priority=0)
	public void dashboardHomePage_checkVisiblity() {
		test=extent.startTest("Verify Dashboard Home Page Visiblity");
		test.log(LogStatus.INFO, "DashboardHomePage Test is intiated");
		test.log(LogStatus.INFO,"Verify Dashboard Home Page Visiblity");

		boolean actual=ui_DashBoard.dashboard_indexPage().isDisplayed();


		if(actual==true) {
			test.log(LogStatus.PASS, "DashBoard page is visible ");
		}
		else {
			test.log(LogStatus.FAIL, "DashBoard page is not visible");
		}

		assertTrue(actual);


	}

	@Test(priority=0)

	public void assignLeave_checkVisiblity() {
		test=extent.startTest("Verify Assign Leave button Visiblity");
		test.log(LogStatus.INFO, "Assign Leave Test is intiated");
		test.log(LogStatus.INFO,"Verifying the  Visiblity of Assign Leave Button");

		boolean actual=ui_DashBoard.assignLeave_QuickLaunch().isDisplayed();


		if(actual==true) {
			test.log(LogStatus.PASS, "Assign Leave Button is visible ");
		}
		else {
			test.log(LogStatus.FAIL, "Assign Leave button is not visible");
		}
		assertTrue(actual);

	}

	@Test(priority=0)
	public void leaveList_checkVisiblity() {

		test=extent.startTest("Verify Leave list button Visiblity");
		test.log(LogStatus.INFO, "Leave List Test is intiated");
		test.log(LogStatus.INFO,"Verifying the  Visiblity of Leave List Button");

		boolean actual=ui_DashBoard.leaveList_QuickLaunch().isDisplayed();


		if(actual==true) {
			test.log(LogStatus.PASS, "Leave List Button is visible ");
		}
		else {
			test.log(LogStatus.FAIL, "Leave List button is not visible");
		}
		assertTrue(actual);

	}

	@Test(priority=0)
	public void timeSheets_checkVisiblity() {
		test=extent.startTest("Verify timeSheets button Visiblity");
		test.log(LogStatus.INFO, "timeSheets Test is intiated");
		test.log(LogStatus.INFO,"Verifying the  Visiblity of timeSheets Button");

		boolean actual=ui_DashBoard.timeSheets_QuickLaunch().isDisplayed();


		if(actual==true) {
			test.log(LogStatus.PASS, "timeSheets Button is visible ");
		}
		else {
			test.log(LogStatus.FAIL, "timeSheets button is not visible");
		}
		assertTrue(actual);

	}

	@Test(priority=0)
	public void applyLeave_checkVisiblity() {

		test=extent.startTest("Verify Apply Leave button Visiblity");
		test.log(LogStatus.INFO, "Apply Leave Test is intiated");
		test.log(LogStatus.INFO,"Verifying the  Visiblity of Apply Leave Button");

		boolean actual=ui_DashBoard.applyLeave_QuickLaunch().isDisplayed();


		if(actual==true) {
			test.log(LogStatus.PASS, "Apply Leave Button is visible ");
		}
		else {
			test.log(LogStatus.FAIL, "Apply Leave button is not visible");
		}
		assertTrue(actual);

	}

	@Test(priority=0)
	public void myLeave_checkVisiblity() {

		test=extent.startTest("Verify My Leave button Visiblity");
		test.log(LogStatus.INFO, "My Leave Test is intiated");
		test.log(LogStatus.INFO,"Verifying the  Visiblity of My Leave Button");

		boolean actual=ui_DashBoard.myLeave_QuickLaunch().isDisplayed();


		if(actual==true) {
			test.log(LogStatus.PASS, "My Leave Button is visible ");
		}
		else {
			test.log(LogStatus.FAIL, "My Leave button is not visible");
		}

		assertTrue(actual);

	}

	@Test(priority=0)
	public void myTimeSheet_checkVisiblity() {

		test=extent.startTest("Verify My Timesheets button Visiblity");
		test.log(LogStatus.INFO, "My Timesheets Test is intiated");
		test.log(LogStatus.INFO,"Verifying the  Visiblity of My Timesheets Button");

		boolean actual=ui_DashBoard.myTimesheet_QuickLaunch().isDisplayed();


		if(actual==true) {
			test.log(LogStatus.PASS, "My Timesheets Button is visible ");
		}
		else {
			test.log(LogStatus.FAIL, "My Timesheets button is not visible");
		}

		assertTrue(actual);
	}

	@Test(priority=0)
	public void clockTimeAtWork_checkVisiblity() {
		test=extent.startTest("Verify clock button Visiblity");
		test.log(LogStatus.INFO, "clock Test is intiated");
		test.log(LogStatus.INFO,"Verifying the  Visiblity of clock Button");

		boolean actual=ui_DashBoard.clock_TimeAtWork().isDisplayed();


		if(actual==true) {
			test.log(LogStatus.PASS, "clock Button is visible ");
		}
		else {
			test.log(LogStatus.FAIL, "clock button is not visible");
		}
		assertTrue(actual);

	}

	@Test(priority=0)
	public void settingsEmpOnLeaveToday_checkVisiblity() {
		test=extent.startTest("Verify Settings button Visiblity");
		test.log(LogStatus.INFO, "Settings Test is intiated");
		test.log(LogStatus.INFO,"Verifying the  Visiblity of Settings Button");

		boolean actual=ui_DashBoard.settings_empOnLeaveToday().isDisplayed();


		if(actual==true) {
			test.log(LogStatus.PASS, "Settings Button is visible ");
		}
		else {
			test.log(LogStatus.FAIL, "Settings button is not visible");
		}

		assertTrue(actual);

	}

	@Test(priority=0)
	public void canvasTimeAtWork_checkVisiblity() throws InterruptedException {
		test=extent.startTest("Verify Canvas-Time At work Visiblity");
		test.log(LogStatus.INFO, "Canvas-Time At work Test is intiated");
		test.log(LogStatus.INFO,"Verifying the  Visiblity of Canvas-Time At work");

		boolean actual=ui_DashBoard.canvas_TimeAtWork().isDisplayed();


		if(actual==true) {
			test.log(LogStatus.PASS, "Canvas-Time At work is visible ");
		}
		else {
			test.log(LogStatus.FAIL, "Canvas-Time At work is not visible");
		}
		assertTrue(actual);
	}


	@Test(priority=0)
	public void canvasEmpDistBySubUnit_checkVisiblity() throws InterruptedException {
		test=extent.startTest("Verify Canvas-Sub Unit Visiblity");
		test.log(LogStatus.INFO, "Canvas-Sub Unit Test is intiated");
		test.log(LogStatus.INFO,"Verifying the  Visiblity of Canvas-Sub Unit");

		boolean actual=ui_DashBoard.canvas_EmpDistBySubUnit().isDisplayed();


		if(actual==true) {
			test.log(LogStatus.PASS, "Canvas-Sub Unit is visible ");
		}
		else {
			test.log(LogStatus.FAIL, "Canvas-Sub Unit is not visible");
		}
		assertTrue(actual);
	}

	@Test(priority=0)
	public void canvasEmpDistByLocation_checkVisiblity() throws InterruptedException {
		test=extent.startTest("Verify Canvas-Location Visiblity");
		test.log(LogStatus.INFO, "Canvas-Location Test is intiated");
		test.log(LogStatus.INFO,"Verifying the  Visiblity of Canvas-Location");

		boolean actual=ui_DashBoard.canvas_EmpDistByLocation().isDisplayed();


		if(actual==true) {
			test.log(LogStatus.PASS, "Canvas-Location is visible ");
		}
		else {
			test.log(LogStatus.FAIL, "Canvas-Location is not visible");
		}
		assertTrue(actual);
	}

	@Test(priority=0)
	public void buzzLatestPost_1_checkVisiblity() {

		test=extent.startTest("Verify BuzzLatest Post button Visiblity");
		test.log(LogStatus.INFO, "BuzzLatest Post button is intiated");
		test.log(LogStatus.INFO,"Verifying the  Visiblity of BuzzLatest Post button");

		boolean actual=ui_DashBoard.buzzlatestPost_1().isDisplayed();


		if(actual==true) {
			test.log(LogStatus.PASS, "BuzzLatest Post button is visible ");
		}
		else {
			test.log(LogStatus.FAIL, "BuzzLatest Post button is not visible");
		}

		assertTrue(actual);
	}


	@Test(priority=1)
	public void validate_AssignLeaveButton_Functionality() {

		test=extent.startTest("Verify Assign Leave Button functionality");
		test.log(LogStatus.INFO, "Assign Leave Button functionality Test is intiated");
		test.log(LogStatus.INFO,"Verifying the Functionality of Assign Leave Button");

		actionDashboard.a_clickAssignLeave();
		String actual=driver.getCurrentUrl();
		String expected=prop.getProperty("assignLeave_URL");


		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Assign Leave button is navigating to the assign Leave URL. ");
		}
		else {
			test.log(LogStatus.FAIL, "Assign Leave button is not navigating to the assign Leave URL");
		}
		assertEquals(actual,expected);

	}

	@Test(priority=2)
	public void validate_leaveListButton_Functionality() {


		test=extent.startTest("Verify Leave list Button functionality");
		test.log(LogStatus.INFO, "Leave list Button functionality Test is intiated");
		test.log(LogStatus.INFO,"Verifying the Functionality of Leave list Button");

		actionDashboard.a_clickLeaveList();
		String actual=driver.getCurrentUrl();
		String expected=prop.getProperty("leaveList_URL");


		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Leave list button is navigating to the Leave lis URL. ");
		}
		else {
			test.log(LogStatus.FAIL, "Leave list button is not navigating to the Leave lis URL");
		}
		assertEquals(actual,expected);

	}

	@Test(priority=3)
	public void validate_timeSheetsButton_Functionality() {

		test=extent.startTest("Verify Timesheets Button functionality");
		test.log(LogStatus.INFO, "Timesheets Button functionality Test is intiated");
		test.log(LogStatus.INFO,"Verifying the Functionality of Timesheets Button ");

		actionDashboard.a_clicktimeSheets();

		String actual=driver.getCurrentUrl();
		String expected=prop.getProperty("timeSheet_URL");


		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Timesheets button is navigating to the timesheets URL. ");
		}
		else {
			test.log(LogStatus.FAIL, "Timesheets button is not navigating to the timesheets URL");
		}
		assertEquals(actual,expected);

	}

	@Test(priority=4)
	public void validate_applyleaveButton_Functionality() {

		test=extent.startTest("Verify Apply Leave Button functionality");
		test.log(LogStatus.INFO, "Apply Leave Button functionality Test is intiated");
		test.log(LogStatus.INFO,"Verifying the Functionality of Apply Leave Button");

		actionDashboard.a_clickApplyLeave();
		String actual=driver.getCurrentUrl();
		String expected=prop.getProperty("applyLeave_URL");
		assertEquals(actual,expected);

		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Apply Leave button is navigating to the Apply Leave URL. ");
		}
		else {
			test.log(LogStatus.FAIL, "Apply Leave button is not navigating to the Apply Leave URL");
		}


	}


	@Test(priority=5)
	public void validate_myleaveButton_Functionality() {
		test=extent.startTest("Verify My Leave Button functionality");
		test.log(LogStatus.INFO, "My Leave Button functionality Test is intiated");
		test.log(LogStatus.INFO,"Verifying the Functionality of My Leave Button");

		actionDashboard.a_clickMyLeave();

		String actual=driver.getCurrentUrl();
		String expected=prop.getProperty("myLeave_URL");



		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "My Leave button is navigating to the My Leave URL. ");
		}
		else {
			test.log(LogStatus.FAIL, "My Leave button is not navigating to the My Leave URL");
		}

		assertEquals(actual,expected);

		driver.get(prop.getProperty("DashBoard_URL"));
	}

	@Test(priority=6)
	public void validate_myTimeSheet_Functionality() {
		test=extent.startTest("Verify My Timesheets Button functionality");
		test.log(LogStatus.INFO, "My Timesheets Button functionality Test is intiated");
		test.log(LogStatus.INFO,"Verifying the Functionality of My Timesheets Button");


		actionDashboard.a_clickMytimeSheets();
		String actual=driver.getCurrentUrl();
		String expected=prop.getProperty("myTimeSheet_URL");


		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "My Timesheets button is navigating to the My Timesheets URL. ");
		}
		else {
			test.log(LogStatus.FAIL, "My Timesheets button is not navigating to the My Timesheets URL");
		}
		assertEquals(actual,expected);


	}

	//	@Test(priority=7)
	//	public void validate_ScrollBuzzPost_Functionality() {
	//
	//		if(ui_DashBoard.scrollBar_BuzzLatestPost().isDisplayed()) {
	//			actionDashboard.a_scrollBuzzLatest();
	//		}
	//
	//	}

	@Test(priority=7)
	public void validate_collapseButton_Functionality() throws InterruptedException {
		test=extent.startTest("Verify Collapse Button functionality");
		test.log(LogStatus.INFO, "Collapse Button functionality Test is intiated");
		test.log(LogStatus.INFO,"Verifying the Functionality of Collapse Button");

		actionDashboard.a_clickLeftcollapseButton();

		boolean actual=ui_DashBoard.right_Collapse().isDisplayed();



		if(actual==true) {
			test.log(LogStatus.PASS, "Left Collapse button is working fine");
		}
		else {
			test.log(LogStatus.FAIL, "Left Collapse button is not working fine");
		}
		assertTrue(actual);

		Thread.sleep(3000);	

		actionDashboard.a_clickrightcollapseButton();
		boolean actual1=ui_DashBoard.left_Collapse().isDisplayed();



		if(actual1==true) {
			test.log(LogStatus.PASS, "Right Collapse button is working fine");
		}
		else {
			test.log(LogStatus.FAIL, "Right Collapse button is not working fine");
		}
		assertTrue(actual1);
	}

	@Test(priority=8)
	public void validate_clockButton_Functionality() {

		test=extent.startTest("Verify Clock Button functionality");
		test.log(LogStatus.INFO, "Clock Button functionality Test is intiated");
		test.log(LogStatus.INFO,"Verifying the Functionality of Clock Button");

		actionDashboard.a_clockButtonTimeAtWorkClick();

		String actual=driver.getCurrentUrl();
		String expected=prop.getProperty("time_URL");


		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Clock button is navigating to the time URL. ");
		}
		else {
			test.log(LogStatus.FAIL, "Clock button is not navigating to the time URL");
		}

		assertEquals(actual,expected);

		driver.get(prop.getProperty("DashBoard_URL"));

	}

	@AfterClass
	public void shut() throws InterruptedException {
		terminate();
	}
}
