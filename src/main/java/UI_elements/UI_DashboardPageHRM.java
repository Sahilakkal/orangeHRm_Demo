package UI_elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test_Base.testBase_OrangeHRM;

public class UI_DashboardPageHRM extends testBase_OrangeHRM {

	@FindBy(xpath="//span[text()='Dashboard']")
	WebElement dashboard_HomePage;

	@FindBy(xpath="//button[@title='Assign Leave']")
	WebElement assignLeave_quickLaunch;

	@FindBy(xpath="//button[@title='Leave List']")
	WebElement leaveList_quickLaunch;

	@FindBy(xpath="//button[@title='Timesheets']")
	WebElement timeSheets_quickLaunch;

	@FindBy(xpath="//button[@title='Apply Leave']")
	WebElement applyLeave_quickLaunch;

	@FindBy(xpath="//button[@title='My Leave']")
	WebElement myLeave_quickLaunch;

	@FindBy(xpath="//button[@title='My Timesheet']")
	WebElement myTimesheet_quickLaunch;

	@FindBy(xpath="//button[@class='oxd-icon-button oxd-icon-button--success orangehrm-report-icon']")
	WebElement leaveReqToApprove_myActions;

	@FindBy(xpath="//button[@class='oxd-icon-button oxd-icon-button--warn orangehrm-report-icon']")
	WebElement timeSheetsToApprove_myActions;

	@FindBy(xpath="//button[@class='oxd-icon-button oxd-icon-button--danger orangehrm-report-icon']")
	WebElement pendingSelfReview_myActions;

	@FindBy(xpath="//button[@class='oxd-icon-button oxd-icon-button--info orangehrm-report-icon']")
	WebElement candidateToInterview_myActions;

	@FindBy(xpath="//button[@class='oxd-icon-button oxd-icon-button--solid-main orangehrm-attendance-card-action']")
	WebElement clock_TimeAtWork;

	@FindBy(xpath="//i[@class='oxd-icon bi-gear-fill orangehrm-leave-card-icon']")
	WebElement settings_EmpOnLeaveToday;
	
	@FindBy(xpath="(//canvas)[1]")
	WebElement canvas_TimeAtWork;
	
	@FindBy(xpath="(//canvas)[2]")
	WebElement canvas_EmpDistributionBySubUnit;
	
	@FindBy(xpath="(//canvas)[3]")
	WebElement canvas_EmpDistributionByLocation;
	
	@FindBy(xpath="(//div[@class='orangehrm-buzz-widget-header'])[1]")
	WebElement buzzLatestPost_1;
	
	@FindBy(xpath="(//div[@class='orangehrm-dashboard-widget-body --scroll-visible'])[1]")
	WebElement scrollBar_BuzzLatestPost;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-chevron-right']")
	WebElement moveToright_Collapse;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-chevron-left']")
	WebElement moveToleft_Collapse;


	public UI_DashboardPageHRM() {
		PageFactory.initElements(driver, this);
	}

	public WebElement dashboard_indexPage() {
		return dashboard_HomePage;
	}

	public WebElement assignLeave_QuickLaunch() {
		return assignLeave_quickLaunch;
	}

	public WebElement leaveList_QuickLaunch() {
		return leaveList_quickLaunch;

	}

	public WebElement timeSheets_QuickLaunch() {
		return timeSheets_quickLaunch;

	}
	
	public WebElement applyLeave_QuickLaunch() {
		return applyLeave_quickLaunch;
	}

	public WebElement myLeave_QuickLaunch() {
		return myLeave_quickLaunch;

	}

	public WebElement myTimesheet_QuickLaunch() {
		return myTimesheet_quickLaunch;

	}

	public WebElement leaveReq_MyActions() {
		return leaveReqToApprove_myActions;
	}

	public WebElement timeSheets_MyActions() {
		return timeSheetsToApprove_myActions;
	}

	public WebElement pendingSelf_MyActions() {
		return pendingSelfReview_myActions;
	}

	public WebElement candidateToInterview_MyActions() {
		return candidateToInterview_myActions;
	}

	public WebElement clock_TimeAtWork() {
		return clock_TimeAtWork;
	}

	public WebElement settings_empOnLeaveToday() {
		return settings_EmpOnLeaveToday;
	}
	
	public WebElement canvas_TimeAtWork() {
		return canvas_TimeAtWork;
	}
	
	public WebElement canvas_EmpDistBySubUnit() {
		return canvas_EmpDistributionBySubUnit;
	}
	
	public WebElement canvas_EmpDistByLocation() {
		return canvas_EmpDistributionByLocation;
	}
	
	public WebElement buzzlatestPost_1() {
		return buzzLatestPost_1;
	}
	
	public WebElement scrollBar_BuzzLatestPost() {
		return scrollBar_BuzzLatestPost;
	}
	
	public WebElement left_Collapse() {
		return moveToleft_Collapse;
	}
	
	public WebElement right_Collapse() {
		return moveToright_Collapse;
		
	}


}
