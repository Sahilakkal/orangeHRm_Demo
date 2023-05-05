package Test_pkg;

import static org.testng.Assert.*;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Actions.Actions_Buzz;
import Test_Base.testBase_OrangeHRM;
import UI_elements.UI_BuzzPageHRM;

public class Test_BuzzPageHRM extends testBase_OrangeHRM {
	
	UI_BuzzPageHRM ui_buzzPage;
	Actions_Buzz actions_buzzPage;
	SoftAssert soft;
	public ExtentTest test;
	public ExtentReports extent;

	
	@BeforeClass
	public void navigateToBuzzPage() throws InterruptedException, IOException {
		Test_LoginPageHRM testLogin=new Test_LoginPageHRM();
		testLogin.navigateLoginPage();
		testLogin.validate_Loginfunctionality_validUname_validPass();
		
		ui_buzzPage=new UI_BuzzPageHRM();
		actions_buzzPage=new Actions_Buzz();
		soft=new SoftAssert();
		actions_buzzPage.a_clickBuzz();
	}
	
	@BeforeTest
	public void x() {
		extent=new ExtentReports("C:\\Users\\sakkal\\Desktop\\reports\\BuzzPostTestreports.html",true);	
	}

	@AfterTest
	public void y() {
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority=0)
	public void validate_BuzzPageLoadsSuccessfully() {
		test=extent.startTest("Verify whether Buzz post Page Loads Successfully");
		test.log(LogStatus.INFO, "Buzz Page load Test is intiated");
		test.log(LogStatus.INFO,"Verify Buzz post Page Loads Successfully");
		
		String actual=driver.getCurrentUrl();
		String expected=prop.getProperty("buzz_URL");
		

		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Buzz Post page loaded properly");
		}
		else {
			test.log(LogStatus.FAIL, "Buzz Post page is not loaded properly");
		}
		
		assertEquals(actual,expected);
	}
	
	@Test(priority=1)
	public void postButton_checkVisiblity() {
		test=extent.startTest("Verify whether Post_Button is visible");
		test.log(LogStatus.INFO, "Post_Button Visiblity test is intiated");
		test.log(LogStatus.INFO,"Verify Post_Button is visible ");
		
		boolean actual=ui_buzzPage.postButton_buzzPage().isDisplayed();
		
		if(actual==true) {
			test.log(LogStatus.PASS, "Post_Button is visible ");
		}
		else {
			test.log(LogStatus.FAIL, "Post_Button is not visible");
		}
		
		assertTrue(actual);
	}
	
	@Test(priority=1)
	public void sharePhotosButton_checkVisiblity() {
		test=extent.startTest("Verify whether Share_photos Button is visible");
		test.log(LogStatus.INFO, "Share_photos Button Visiblity test is intiated");
		test.log(LogStatus.INFO,"Verify Share_photos Button is visible ");
		
		boolean actual=ui_buzzPage.sharePhotos_buzzPage().isDisplayed();
		if(actual==true) {
			test.log(LogStatus.PASS, "Share_photos Button is visible ");
		}
		else {
			test.log(LogStatus.FAIL, "Share_photos Button is not visible");
		}
		assertTrue(actual);
	}
	
	@Test(priority=1)
	public void shareVideosButton_checkVisiblity() {
		test=extent.startTest("Verify whether Share_Videos Button is visible");
		test.log(LogStatus.INFO, "Share_Videos Button Visiblity test is intiated");
		test.log(LogStatus.INFO,"Verify Share_Videos Button is visible ");
		
		boolean actual=ui_buzzPage.shareVideos_buzzPage().isDisplayed();
		
		if(actual==true) {
			test.log(LogStatus.PASS, "Share_Videos Button is visible ");
		}
		else {
			test.log(LogStatus.FAIL, "Share_Videos Button is not visible");
		}
		assertTrue(actual);
	}
	
	@Test(priority=1)
	public void mostRecentPostButton_checkVisiblity() {
		
		test=extent.startTest("Verify whether Most_Recent_Post Button is visible");
		test.log(LogStatus.INFO, "Most_Recent_Post Button Visiblity test is intiated");
		test.log(LogStatus.INFO,"Verify Most_Recent_Post Button is visible ");
		
		boolean actual=ui_buzzPage.mostRecentPost_buzzPage().isDisplayed();
		if(actual==true) {
			test.log(LogStatus.PASS, "Most_Recent_Post Button is visible ");
		}
		else {
			test.log(LogStatus.FAIL, "Most_Recent_Post Button is not visible");
		}
		
		assertTrue(actual);
	}
	
	@Test(priority=1)
	public void mostLikedPostButton_checkVisiblity() {
		
		test=extent.startTest("Verify whether Most_Liked_Post Button is visible");
		test.log(LogStatus.INFO, "Most_Liked_Post Button Visiblity test is intiated");
		test.log(LogStatus.INFO,"Verify Most_Liked_Post Button is visible ");
		
		boolean actual=ui_buzzPage.mostLikedPost_buzzPage().isDisplayed();
		
		if(actual==true) {
			test.log(LogStatus.PASS, "Most_Liked_Post Button is visible ");
		}
		else {
			test.log(LogStatus.FAIL, "Most_Liked_Post Button is not visible");
		}
		
		assertTrue(actual);
	}
	
	@Test(priority=1)
	public void mostCommentedPostButton_checkVisiblity() {
		
		test=extent.startTest("Verify whether Most_Commented_Post Button is visible");
		test.log(LogStatus.INFO, "Most_Commented_Post Button Visiblity test is intiated");
		test.log(LogStatus.INFO,"Verify Most_Commented_Post Button is visible ");
		
		boolean actual=ui_buzzPage.mostCommentedPost_buzzPage().isDisplayed();
		
		if(actual==true) {
			test.log(LogStatus.PASS, "Most_Commented_Post Button is visible ");
		}
		else {
			test.log(LogStatus.FAIL, "Most_Commented_Post Button is not visible");
		}
		assertTrue(actual);
	}
	
	@Test(priority=1)
	public void likePostButton_checkVisiblity() {
		
		test=extent.startTest("Verify whether like_Post Button is visible");
		test.log(LogStatus.INFO, "like_Post Button Visiblity test is intiated");
		test.log(LogStatus.INFO,"Verify like_Post Button is visible ");
		
		boolean actual=ui_buzzPage.likeButton_buzzPage().isDisplayed();
		if(actual==true) {
			test.log(LogStatus.PASS, "like_Post Button is visible ");
		}
		else {
			test.log(LogStatus.FAIL, "like_Post Button is not visible");
		}
		assertTrue(actual);
	}
	
	
	@Test(priority=1)
	public void optionsPostButton_checkVisiblity() {
		test=extent.startTest("Verify whether Options_Post Button is visible");
		test.log(LogStatus.INFO, "Options_Post Button Visiblity test is intiated");
		test.log(LogStatus.INFO,"Verify Options_Post Button is visible ");
		
		boolean actual=ui_buzzPage.optionsButton_buzzPage().isDisplayed();
		
		if(actual==true) {
			test.log(LogStatus.PASS, "Options_Post Button is visible ");
		}
		else {
			test.log(LogStatus.FAIL, "Options_Post Button is not visible");
		}
		assertTrue(actual);
	}
	
	@Test(priority=1)
	public void commentButton_checkVisiblity() {
		
		test=extent.startTest("Verify whether Comment Button is visible");
		test.log(LogStatus.INFO, "Comment Button Visiblity test is intiated");
		test.log(LogStatus.INFO,"Verify Comment Button is visible ");
		boolean actual=ui_buzzPage.commentButton_buzzPage().isDisplayed();
		
		
		if(actual==true) {
			test.log(LogStatus.PASS, "Comment Button is visible ");
		}
		else {
			test.log(LogStatus.FAIL, "Comment Button is not visible");
		}
		assertTrue(actual);
	}
	
	@Test(priority=1)
	public void shareButton_checkVisiblity() {
		
		test=extent.startTest("Verify whether Share Button is visible");
		test.log(LogStatus.INFO, "Share Button Visiblity test is intiated");
		test.log(LogStatus.INFO,"Verify Share Button is visible ");
		boolean actual=ui_buzzPage.shareButton_buzzPage().isDisplayed();
		
		if(actual==true) {
			test.log(LogStatus.PASS, "Share Button is visible ");
		}
		else {
			test.log(LogStatus.FAIL, "Share Button is not visible");
		}
		assertTrue(actual);
	}
	
	@Test(priority=2)
	public void validate_postfunctionality() throws InterruptedException {
		
		test=extent.startTest("Validate Post functionality");
		test.log(LogStatus.INFO, "Post functionality test is intiated");
		test.log(LogStatus.INFO,"Verify whether user able to share a post");
		actions_buzzPage.a_makeAPost();
		
		boolean actual=ui_buzzPage.toastMessage_buzzPage().getText().contains("Successfully Saved");

		if(actual==true) {
			test.log(LogStatus.PASS, "User able to share post successfully");
		}
		else {
			test.log(LogStatus.FAIL, "User not  able to share post");
		}
		assertTrue(actual);
	}
	
	@Test(priority=3)
	public void validate_postWithPhoto_Functionality() throws InterruptedException {
		
		test=extent.startTest("Validate Post with photo functionality");
		test.log(LogStatus.INFO, "Post with photo functionality test is intiated");
		test.log(LogStatus.INFO,"Verify whether user able to share a post with photo");
	
		actions_buzzPage.a_makeaPostWithPhoto();
		
		boolean actual=ui_buzzPage.toastMessage_buzzPage().getText().contains("Successfully Saved");
		
		if(actual==true) {
			test.log(LogStatus.PASS, "User able to share post with photo successfully");
		}
		else {
			test.log(LogStatus.FAIL, "User not  able to share post with photo");
		}
		assertTrue(actual);
		Thread.sleep(3000);
		
	}
	
	@Test(priority=4)
	public void validate_postWithVideo_Functionality() throws Exception {
		test=extent.startTest("Validate Post with Video functionality");
		test.log(LogStatus.INFO, "Post with Video functionality test is intiated");
		test.log(LogStatus.INFO,"Verify whether user able to share a post with Video");
		
		actions_buzzPage.a_makeAPostWithVideo();
		boolean actual=ui_buzzPage.toastMessage_buzzPage().getText().contains("Successfully Saved");
		
		if(actual==true) {
			test.log(LogStatus.PASS, "User able to share post with Video successfully");
		}
		else {
			test.log(LogStatus.FAIL, "User not  able to share post with video");
		}
		soft.assertTrue(actual);	
	}
	
	@Test(priority=5,dependsOnMethods="validate_postWithVideo_Functionality")
	public void validate_LikePost_Functionality() throws InterruptedException {
		test=extent.startTest("Validate Like post functionality");
		test.log(LogStatus.INFO, "Like post functionality test is intiated");
		test.log(LogStatus.INFO,"Verify whether user able to like a post");
		
		actions_buzzPage.a_likePost();
		boolean actual=ui_buzzPage.AfterlikeButton_buzzPage().isDisplayed();
		
		if(actual==true) {
			test.log(LogStatus.PASS, "User able to like a Post successfully");
		}
		else {
			test.log(LogStatus.FAIL, "User not  able to like a post");
		}
		assertTrue(actual);	
	}
	
	@Test(priority=6,dependsOnMethods="validate_LikePost_Functionality")
	public void validate_UnLikePost_Functionality() {
		
		test=extent.startTest("Validate unLike post functionality");
		test.log(LogStatus.INFO, "UnLike post functionality test is intiated");
		test.log(LogStatus.INFO,"Verify whether user able to Unlike a post");
		actions_buzzPage.a_unlikePost();
		boolean actual=ui_buzzPage.AfterlikeButton_buzzPage().isDisplayed();
		
		if(actual==false) {
			test.log(LogStatus.PASS, "User able to unlike a Post successfully");
		}
		else {
			test.log(LogStatus.FAIL, "User not  able to unlike a post");
		}
		assertFalse(actual);
	}
	
	@Test(priority=7)
	public void validate_commentPost_functionality() {
		
		test=extent.startTest("Validate post a comment functionality");
		test.log(LogStatus.INFO, "Post a comment functionality test is intiated");
		test.log(LogStatus.INFO,"Verify whether user able to post a comment");
		
		actions_buzzPage.a_commentPost();
		boolean actual=ui_buzzPage.toastMessage_buzzPage().getText().contains("Successfully Saved");
		
		if(actual==true) {
			test.log(LogStatus.PASS, "User able to unlike a post a comment successfully");
		}
		else {
			test.log(LogStatus.FAIL, "User not  able to post a comment");
		}
		assertTrue(actual);	
	}
	
	@Test(priority=8,dependsOnMethods="validate_commentPost_functionality")
	public void validate_likeAcomment_Functionality() throws InterruptedException {
		Thread.sleep(5000);
		test=extent.startTest("Validate Like a comment functionality");
		test.log(LogStatus.INFO, "Like a comment functionality test is intiated");
		test.log(LogStatus.INFO,"Verify whether user able to Like a comment");
		
		actions_buzzPage.likeACommentButton_buzzPage();
		Thread.sleep(5000);
		
		boolean actual=ui_buzzPage.likeCountOfComment().isDisplayed();
		
		if(actual==true) {
			test.log(LogStatus.PASS, "User able to Like a comment successfully");
		}
		else {
			test.log(LogStatus.FAIL, "User not  able to Like a comment");
		}
		assertTrue(actual);
	}
	
	@Test(priority=9,dependsOnMethods="validate_likeAcomment_Functionality")
	public void validate_unlikeAComment_functionality() {
		test=extent.startTest("Validate unLike a comment functionality");
		test.log(LogStatus.INFO, "UnLike a comment functionality test is intiated");
		test.log(LogStatus.INFO,"Verify whether user able to UnLike a comment");
		
		actions_buzzPage.unlikeACommentButton_buzzPage();
		boolean actual=ui_buzzPage.unlikeACommentButton_buzzPage().isDisplayed();
		
		if(actual==false) {
			test.log(LogStatus.PASS, "User able to unLike a comment successfully");
		}
		else {
			test.log(LogStatus.FAIL, "User not  able to unLike a comment");
		}
		
		assertFalse(actual);
	}
	
	@AfterClass
	public void shutbuzz() throws InterruptedException {
		terminate();
		
	}


}
