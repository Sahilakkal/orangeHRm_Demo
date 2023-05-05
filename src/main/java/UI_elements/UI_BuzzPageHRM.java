package UI_elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test_Base.testBase_OrangeHRM;

public class UI_BuzzPageHRM extends testBase_OrangeHRM {
	
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][text()='Buzz']")
	WebElement buzzButton_buzzPage;
	
	@FindBy(xpath="//button[@type='submit'][text()=' Post ']")
	WebElement postButton_buzzPage;
	
	@FindBy(xpath="//textarea[@class='oxd-buzz-post-input']")
	WebElement textAreaForPost_buzzPage;
	
	@FindBy(xpath="(//button[@class='oxd-glass-button'])[1]")
	WebElement sharephotos_buzzPage;
	
	@FindBy(xpath="(//button[@class='oxd-glass-button'])[2]")
	WebElement shareVideos_buzzPage;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--label-warn orangehrm-post-filters-button']")
	WebElement mostRecentPost_buzzPage;
	
	@FindBy(xpath="(//button[@class='oxd-button oxd-button--medium oxd-button--text orangehrm-post-filters-button'])[1]")
	WebElement mostLikedPosts_buzzPage;
	
	@FindBy(xpath="(//button[@class='oxd-button oxd-button--medium oxd-button--text orangehrm-post-filters-button'])[2]")
	WebElement mostCommentedPosts_buzzPage;
	
	@FindBy(xpath="//*[@id=\"Group\"]")
	WebElement likePostButton_buzzpage;
	
	@FindBy(xpath="(//div[@class='orangehrm-like-animation'])[1]")
	WebElement AfterlikePostButton_buzzpage;

	
	@FindBy(xpath="(//button[@class='oxd-icon-button'])[1]")
	WebElement optionsPostButton_buzzPage;
	
	@FindBy(xpath="(//button[@class='oxd-icon-button'])[2]")
	WebElement commentPostButtonFirstPost_buzzPage;
	
	@FindBy(xpath="(//button[@class='oxd-icon-button'])[3]")
	WebElement sharePostButton_buzzPage;
	
	@FindBy(xpath="//div[@id='oxd-toaster_1']")
	WebElement toastMessage_buzzPage;
	
	@FindBy(xpath="//input[@class='oxd-file-input'][@type='file']")
	WebElement uploadphotoFile_buzzPage;
	
	@FindBy(xpath="//button[text()=' Share ']")
	WebElement shareButtonUploadingPhoto_buzzPage;
	
	@FindBy(xpath="(//button[@class='oxd-button oxd-button--medium oxd-button--main'])[2]")
	WebElement shareButtonUploadingVideo_buzzPage;
	
	@FindBy(xpath="//input[@placeholder='Write your comment...']")
	WebElement writeYourCommentInPost_buzzPage;
	
	@FindBy(xpath="//textarea[@placeholder='Paste Video URL']")
	WebElement textAreaForVideoURL_buzzPage;
	
	@FindBy(xpath="(//div[@class='orangehrm-post-comment-action-area'])[1]/p[text()='Like']")
	WebElement likeACommentButton_buzzPage;
	
	@FindBy(xpath="(//p[@class='oxd-text oxd-text--p orangehrm-post-comment-action --liked'])[1]")
	WebElement unlikeACommentButton_buzzPage;
	
	@FindBy(xpath="//div[@class='orangehrm-post-comment-stats']")
	WebElement likeCountofComment_buzzPage;
	
	
	
	public UI_BuzzPageHRM() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement buzzButton_buzzPage() {
		return buzzButton_buzzPage;
	}
	
	public WebElement postButton_buzzPage() {
		return postButton_buzzPage;
	}
	
	public WebElement textAreaPost_buzzPage() {
		return textAreaForPost_buzzPage;
	}
	
	public WebElement sharePhotos_buzzPage() {
		return sharephotos_buzzPage;
	}
	
	public WebElement shareVideos_buzzPage() {
		return shareVideos_buzzPage;
	}
	
	public WebElement mostRecentPost_buzzPage() {
		return mostRecentPost_buzzPage;
	}
	
	public WebElement mostLikedPost_buzzPage() {
		return mostLikedPosts_buzzPage;
	}
	
	public WebElement mostCommentedPost_buzzPage() {
		return mostCommentedPosts_buzzPage;
	}
	
	public WebElement likeButton_buzzPage() {
		return likePostButton_buzzpage;
	}
	
	public WebElement AfterlikeButton_buzzPage() {
		return AfterlikePostButton_buzzpage;
	}
	
	public WebElement optionsButton_buzzPage() {
		return optionsPostButton_buzzPage;
	}
	
	public WebElement commentButton_buzzPage() {
		return commentPostButtonFirstPost_buzzPage;
	}
	
	public WebElement shareButton_buzzPage() {
		return sharePostButton_buzzPage;
	}
	
	public WebElement toastMessage_buzzPage() {
		return toastMessage_buzzPage;
	}
	
	public WebElement uploadphotofile_buzzPage() {
		return uploadphotoFile_buzzPage;
	}
	
	public WebElement shareButtonWhileUploadingphoto_buzzPage() {
		return shareButtonUploadingPhoto_buzzPage;
	}
	
	public WebElement shareButtonWhileUploadingVideo_buzzPage() {
		return shareButtonUploadingVideo_buzzPage;
	}
	
	public WebElement textareaforVideoURL_buzzPage() {
		return textAreaForVideoURL_buzzPage;
	}
	
	public WebElement writeYourCommentInPost_buzzPage() {
		return writeYourCommentInPost_buzzPage;
	}
	
	public WebElement likeACommentButton_buzzPage() {
		return likeACommentButton_buzzPage;
	}
	
	public WebElement likeCountOfComment() {
		return likeCountofComment_buzzPage;
	}
	
	public WebElement unlikeACommentButton_buzzPage() {
		return unlikeACommentButton_buzzPage;
	}




}
