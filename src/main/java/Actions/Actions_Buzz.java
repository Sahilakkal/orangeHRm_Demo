package Actions;

import org.openqa.selenium.Keys;

import UI_elements.UI_BuzzPageHRM;

public class Actions_Buzz extends UI_BuzzPageHRM{
	
	UI_BuzzPageHRM ui_buzzPage=new UI_BuzzPageHRM();
	public void a_clickBuzz() {
		ui_buzzPage.buzzButton_buzzPage().click();
		
	}
	
	public void a_makeAPost() throws InterruptedException {
		ui_buzzPage.textAreaPost_buzzPage().sendKeys("hello guyz");
		ui_buzzPage.postButton_buzzPage().click();
			
		//ui_buzzPage.postButton_buzzPage().click();
		Thread.sleep(1000);
	}
	
	public void  a_makeaPostWithPhoto() throws InterruptedException {
		Thread.sleep(1000);
		
		ui_buzzPage.sharePhotos_buzzPage().click();
		ui_buzzPage.uploadphotofile_buzzPage().sendKeys("C:\\Users\\sakkal\\Desktop\\admin.jfif");
		ui_buzzPage.shareButtonWhileUploadingphoto_buzzPage().click();
	}
	
	public void  a_makeAPostWithVideo() throws Exception {
	ui_buzzPage.shareVideos_buzzPage().click();
	ui_buzzPage.textareaforVideoURL_buzzPage().sendKeys("//https://vimeo.com/474849914");
	Thread.sleep(3000);
	ui_buzzPage.shareButtonWhileUploadingVideo_buzzPage().click();
	Thread.sleep(3000);
	
	}
	
	public void a_likePost() throws InterruptedException {
		
		Thread.sleep(3000);
		ui_buzzPage.likeButton_buzzPage().click();
		Thread.sleep(3000);
		
	}
	
	public void a_unlikePost() {
		ui_buzzPage.likeButton_buzzPage().click();
	}
	
	public void a_commentPost() {
		ui_buzzPage.commentButton_buzzPage().click();
		ui_buzzPage.writeYourCommentInPost_buzzPage().sendKeys("Nice pic Bro");
		ui_buzzPage.writeYourCommentInPost_buzzPage().sendKeys(Keys.ENTER);
		
	}
	
	public void a_likeAComment() throws InterruptedException {
		Thread.sleep(2000);
		ui_buzzPage.likeACommentButton_buzzPage().click();
	}
	
	public void a_unlikeAComment() {
		ui_buzzPage.unlikeACommentButton_buzzPage().click();
	}
	

	

}
