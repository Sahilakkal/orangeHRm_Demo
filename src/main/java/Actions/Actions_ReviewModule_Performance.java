package Actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import UI_elements.UI_ReviewModule_PerformancePageHRM;

public class Actions_ReviewModule_Performance extends UI_ReviewModule_PerformancePageHRM {

	UI_ReviewModule_PerformancePageHRM ui_review=new UI_ReviewModule_PerformancePageHRM();
	Actions action_review=new Actions(driver);
	
	public void a_clickPerformanceButton() {
		ui_review.performanceButton().click();
	}
	
	public void a_clickManageReviews() {
		ui_review.manageReviewButton().click();
		ui_review.manageReview_listDropDown().click();;
		System.out.println(ui_review.toastMessage().getText());
	}
	
	public void a_searchFunctionality() throws InterruptedException {
		ui_review.jobTitleDropDown().click();
		ui_review.reviewStatus_DropDown().click();
		ui_review.firstField_listDropdown().click();
		ui_review.include_dropDown().click();
		ui_review.firstField_listDropdown().click();
		action_review.moveToElement(ui_review.fromDate_Calendar()).click().perform();
		ui_review.todayDateButton_Calendar().click();
		
		action_review.moveToElement(ui_review.toDate_Calendar()).click().perform();
		Thread.sleep(1000);
		ui_review.todayDateButton_Calendar().click();
		ui_review.submitButton().click();;

	}
	
	public void a_clickcollapse() {
		ui_review.toggleButton().click();
	}
	
	public void a_clickMyReviewsButton() {
		ui_review.manageReviewButton().click();
		ui_review.myReview_listDropDown().click();
	}
	
	public void a_clickActionsButton() {
		ui_review.actionsButton_myreviews().click();
	}
	
	public void scroll() throws InterruptedException {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/performance/reviewEvaluate/id/17");
		Thread.sleep(2000);
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].scrollIntoView(true);",ui_review.commitment_comment_myreviews());
	}
	
	public void a_entereVaulationDetails() throws InterruptedException {	

		ui_review.formalManagement_rating_myreviews().sendKeys("4.8");
		ui_review.personalCapabilties_rating_myreviews().sendKeys("4.9");
		ui_review.credible_rating_myreviews().sendKeys("5.0");
		ui_review.commitment_rating_myreviewsx().sendKeys("3.5");
		ui_review.plans_rating_myreviews().sendKeys("1.1");
		ui_review.formalManagement_comment_myreviews().sendKeys("keep it up");
		ui_review.personalCapabilties_comment_myreviews().sendKeys("Very nice");
		ui_review.credible_comment_myreviews().sendKeys("Excellent ");
		ui_review.commitment_comment_myreviews().sendKeys("Try hard");
		ui_review.plans_comment_myreviews().sendKeys("Focus on your plans");
		
		ui_review.generalComment_myreviews().sendKeys("Overall good");
		
	}
	
	public void a_clickEmployeeReviewsButton() {
		ui_review.manageReviewButton().click();
		ui_review.employeeReview_listDropDown().click();
		
	}
	
	public void a_sort() {
		ui_review.sort_employee().click();
		ui_review.sort_desceding().click();
	}


}
