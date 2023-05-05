package Actions;



import org.openqa.selenium.interactions.Actions;

import UI_elements.UI_DashboardPageHRM;


public class Actions_Dashboard extends UI_DashboardPageHRM {

	UI_DashboardPageHRM ui_dashboard= new UI_DashboardPageHRM();
	Actions actions=new Actions(driver);

	public void a_clickDashboard() {
		ui_dashboard.dashboard_indexPage().click();
	}

	public void a_clickAssignLeave() {
		ui_dashboard.assignLeave_QuickLaunch().click();
	}

	public void a_clickLeaveList() {
		driver.get(prop.getProperty("DashBoard_URL"));
		ui_dashboard.leaveList_QuickLaunch().click();
	}

	public void a_clicktimeSheets() {
		driver.get(prop.getProperty("DashBoard_URL"));
		if(ui_dashboard.timeSheets_QuickLaunch().isDisplayed()) {
			ui_dashboard.timeSheets_QuickLaunch().click();
		}
		
	}

	public void a_clickApplyLeave() {
		driver.get(prop.getProperty("DashBoard_URL"));
		ui_dashboard.applyLeave_QuickLaunch().click();
	}

	public void a_clickMyLeave() {
		driver.get(prop.getProperty("DashBoard_URL"));
		ui_dashboard.myLeave_QuickLaunch().click();;
	}

	public void a_clickMytimeSheets() {
		ui_dashboard.myTimesheet_QuickLaunch().click();
	}

	public void a_clickLeaveReqToApprove() {
		ui_dashboard.leaveReq_MyActions().click();
	}

	public void a_scrollBuzzLatest() {
		actions.moveToElement(ui_dashboard.scrollBar_BuzzLatestPost()).perform();
		actions.dragAndDropBy(ui_dashboard.scrollBar_BuzzLatestPost(), 0, 100).perform();
	}

	public void a_clickLeftcollapseButton() {
		driver.get(prop.getProperty("DashBoard_URL"));
		ui_dashboard.left_Collapse().click();
	}

	public void a_clickrightcollapseButton() {
		ui_dashboard.right_Collapse().click();
	}

	public void a_clockButtonTimeAtWorkClick() {
		ui_dashboard.clock_TimeAtWork().click();
	}



}
