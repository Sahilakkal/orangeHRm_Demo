package UI_elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test_Base.testBase_OrangeHRM;

public class UI_PersonalDetailsPageHRM extends testBase_OrangeHRM {
	@FindBy(name="firstName")
	WebElement firstName_PDetails;

	@FindBy(name="middleName")
	WebElement midName_PDetails;   

	@FindBy(name="lastName")
	WebElement lastName_PDetails;

	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input")
	WebElement nickName_PDetails;

	//	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]/i")
	//	WebElement nationality_PDetails;

	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button")
	WebElement save_PDetails;

	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div/button")
	WebElement addAttachment_PDetails;

	@FindBy(xpath="//i[@class='oxd-icon bi-upload oxd-file-input-icon']")
	WebElement upload_PDetails;

	@FindBy(xpath="//textarea[@placeholder='Type comment here']")
	WebElement comment_Pdetails;

	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[1]/div/div/div/div[2]/div/i")
	WebElement saveAttachment_PDetails;

	@FindBy(className="employee-image")
	WebElement profilePic_PDetails;

	@FindBy(xpath="//input[@type='file']")
	WebElement addPic_PDetails;

	@FindBy(xpath="//button[@type='submit']")
	WebElement saveProfilePic_PDetails;

	@FindBy(xpath="//a[text()='Contact Details']")  
	WebElement contactDetailsButton;

	@FindBy(xpath="//a[text()='Personal Details']")  
	WebElement personalDetailsButton;

	@FindBy(xpath="//a[text()='Emergency Contacts']")  
	WebElement emergencyContactsButton;

	@FindBy(xpath="//a[text()='Dependents']")  
	WebElement dependentsButton;

	@FindBy(xpath="//a[text()='Immigration']")  
	WebElement immigrationButton;

	@FindBy(xpath="//a[text()='Job']")  
	WebElement jobButton;

	@FindBy(xpath="//a[text()='Salary']")  
	WebElement salaryButton;

	@FindBy(xpath="//a[text()='Tax Exemptions']")  
	WebElement taxExemptionsButton;

	@FindBy(xpath="//a[text()='Report-to']")  
	WebElement reporttoButton;

	@FindBy(xpath="//a[text()='Qualifications']")  
	WebElement qualificationsButton;

	@FindBy(xpath="//a[text()='Memberships']")  
	WebElement membershipsButton;
	
	@FindBy(xpath="//div[@class='oxd-toast-start']")
	WebElement toastMessage;
	
	@FindBy(xpath="//a[@href='/web/index.php/pim/viewMyDetails']")
	WebElement myInfo_HomePage;



	public UI_PersonalDetailsPageHRM() {
		PageFactory.initElements(driver,this);

	}

	public WebElement fName_Pdetails() {
		return firstName_PDetails;
	}

	public WebElement mName_Pdetails() {
		return midName_PDetails;
	}

	public WebElement lName_Pdetails() {
		return lastName_PDetails;
	}


	public WebElement nickName_Pdetails() {
		return nickName_PDetails;
	}

	//	public WebElement nationality_Pdetails() {
	//		return nationality_PDetails;
	//	}

	public WebElement save_Pdetails() {
		return save_PDetails;
	}

	public WebElement addAttach_Pdetails() {
		return addAttachment_PDetails;
	}

	public WebElement upload_Pdetails() {
		return upload_PDetails;
	}

	public WebElement comment_Pdetails() {
		return comment_Pdetails;
	}

	public WebElement saveAtt_Pdetails() {
		return saveAttachment_PDetails;
	}

	public WebElement profilePic_Pdetails() {
		return profilePic_PDetails;
	}

	public WebElement profileadd_Pdetails() {
		return addPic_PDetails;
	}

	public WebElement profileSave_Pdetails() {
		return saveProfilePic_PDetails;
	}

	public WebElement contactDetailsButton() {
		return contactDetailsButton;
	}
	
	public WebElement p_DetailsButton() {
		return personalDetailsButton;
	}
	
	public WebElement cont_DetailsButton() {
		return contactDetailsButton;
	}
	
	public WebElement Emergency_Button() {
		return emergencyContactsButton;	
	}
	
	public WebElement dependents_Button() {
		return dependentsButton;	
	}
	
	public WebElement immigration_Button() {
		return immigrationButton;	
	}
	
	public WebElement job_Button() {
		return jobButton;	
	}
	
	public WebElement Salary_Button() {
		return salaryButton;	
	}
	
	public WebElement tax_Button() {
		return taxExemptionsButton;	
	}
	
	public WebElement reportTo_Button() {
		return reporttoButton;	
	}
	
	public WebElement qual_Button() {
		return qualificationsButton;	
	}
	
	public WebElement memberships_Button() {
		return membershipsButton;	
	}
	
	public WebElement toastMessage_ProfilePicture() {
		return toastMessage;
	}
	
	public WebElement MyInfoButton() {
		return myInfo_HomePage;
	}





}
