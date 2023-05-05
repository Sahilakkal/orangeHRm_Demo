package Test_pkg;

import static org.testng.Assert.*;

import java.io.IOException;
import java.time.Duration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Test_Base.testBase_OrangeHRM;
import UI_elements.UI_HomePageHRM;
import UI_elements.UI_LoginPageHRM;

public class Test_LoginPageHRM extends testBase_OrangeHRM {

	UI_LoginPageHRM loginpage;
	UI_HomePageHRM B1;
	public ExtentTest test;
	public ExtentReports extent;;

	@BeforeClass
	public void navigateLoginPage() throws InterruptedException, IOException {

		intializeLogin();                                               
		loginpage=new UI_LoginPageHRM();  
		B1= new UI_HomePageHRM();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	@BeforeTest
	public void x() {
		extent=new ExtentReports("C:\\Users\\sakkal\\Desktop\\reports\\x.html",true);	
	}
	
	@AfterTest
	public void y() {
		extent.flush();
	}
		

	@Test(priority=0)                                                                  //Verify visiblity of all the elements in login Page
	public void validateVisiblity() throws InterruptedException {                                    

		Thread.sleep(5000);
		assertEquals(loginpage.checkLogo().isDisplayed(),true);                 
		assertEquals(loginpage.setUserName().isDisplayed(),true);               
		assertEquals(loginpage.setPassword().isDisplayed(),true);               
		assertEquals(loginpage.forgotPass().isDisplayed(),true);                
		assertEquals(loginpage.clickLogin().isDisplayed(),true);                
 
	}

	@Test(priority=1)                                                                  //Verify that user should not be able to login with invalid username and valid password
	public void validate_Loginfunctionality_invalidUname_validPass() throws IOException {         
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginpage.setUserName().sendKeys(prop.getProperty("IUsername"));                  
		loginpage.setPassword().sendKeys(prop.getProperty("VPassword"));                  
		loginpage.clickLogin().click();                                                   
		assertEquals(driver.getCurrentUrl(),prop.getProperty("loginurl"));        
	}

	@Test(priority=2)                                                                  //Verify that user should not be able to login with invalid username and invalid password
	public void validate_Loginfunctionality_invalidUname_invalidPass() throws IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginpage.setUserName().sendKeys(prop.getProperty("IUsername"));                 
		loginpage.setPassword().sendKeys(prop.getProperty("IPassword"));                   
		loginpage.clickLogin().click();                                                  
		assertEquals(driver.getCurrentUrl(),prop.getProperty("loginurl"));         
	}

	@Test(priority=3)                                                                  //Verify that user should not be able to login with valid username and invalid password
	public void validate_Loginfunctionality_validUname_invalidPass() throws IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginpage.setUserName().sendKeys(prop.getProperty("VUsername"));                    
		loginpage.setPassword().sendKeys(prop.getProperty("IPassword"));                    
		loginpage.clickLogin().click();                                                     
		assertEquals(driver.getCurrentUrl(),prop.getProperty("loginurl"));          
	}

	@Test(priority=4)                                                                  //Verify that user should not be able to login with blank password and valid username
	public void validate_Loginfunctionality_validUname_blankPass() {
		loginpage.setPassword().sendKeys(prop.getProperty("VUsername"));
		loginpage.clickLogin().click();
		assertEquals(loginpage.errorMessageBlankLogin().getText(),"Required");
		driver.navigate().refresh();
	}
	@Test(priority=5)                                                                  //Verify that user should not be able to login with blank password and blank username
	public void validate_Loginfunctionality_blankUname_blankPass() {
		loginpage.clickLogin().click();
		assertEquals(loginpage.errorMessageBlankLogin().getText(),"Required");
		driver.navigate().refresh();
	}
	
	@Test(priority=6)                                                                  //Verify that user should not be able to login with valid password and blank username
	public void validate_Loginfunctionality_blankUname_validPass() {
		loginpage.setPassword().sendKeys(prop.getProperty("VPassword"));
		loginpage.clickLogin().click();
		assertEquals(loginpage.errorMessageBlankLogin().getText(),"Required");
		driver.navigate().refresh();
	}


	@Test(priority=7)                                                                  //Validating Login functionality with valid uname and valid pass
	public void validate_Loginfunctionality_validUname_validPass() throws IOException {       
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginpage.setUserName().sendKeys(prop.getProperty("VUsername"));                    
		loginpage.setPassword().sendKeys(prop.getProperty("VPassword"));                    
		loginpage.clickLogin().click();                                                    
		assertEquals(driver.getCurrentUrl(),prop.getProperty("afterloginURL"));    
	}

	@Test(priority=8)                                                                  //Verify user able to logout after logged in successfully
	public void validate_logoutFunctionality() {
		B1.dropDown().click();
		B1.logoutButton().click();	
		assertEquals(driver.getCurrentUrl(),prop.getProperty("loginurl"));
	}

	@Test(priority=9)                                                                  //Verify whether the error message appears when user try to login with invalid credentials
	public void validate_errorMessage() throws IOException {
		validate_Loginfunctionality_invalidUname_invalidPass();
		assertEquals(loginpage.errorMessageLogin().getText(),"Invalid credentials");
	}

	@Test(priority=10)                                                                //Verify whether password is entered in encrypted format  
	public void validate_encryptedPass() {
		loginpage.setPassword().sendKeys(prop.getProperty("VPassword"));
		assertEquals(loginpage.setPassword().getAttribute("type"),"password");

	}

	@Test(priority=11)                                                                //Verify the forgot password functionality  
	public void validateForgotPassFunctionality() throws InterruptedException, IOException {    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginpage.forgotPass().click();                                                    
		loginpage.forgotPassUNAme().sendKeys(prop.getProperty("VUsername"));                 
		loginpage.resetPassword().click();                                                  
		assertEquals(driver.getCurrentUrl(),prop.getProperty("forgotpassURl"));
	} 

	@AfterClass
	public void shut() throws InterruptedException { 
		
		terminate();                                 
	}	
}
