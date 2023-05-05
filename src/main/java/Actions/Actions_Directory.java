package Actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import UI_elements.UI_DirectoryPageHRM;

public class Actions_Directory extends UI_DirectoryPageHRM{
	
	UI_DirectoryPageHRM ui_directoryPage=new UI_DirectoryPageHRM();
	Actions action=new Actions(driver);
	
	public void a_clickDirectory_DirPage() {
		ui_directoryPage.directoryButton_DirPage().click();
	}
	
	public void a_enterDetails_DirPage() throws InterruptedException {
//		ui_directoryPage.empName_DirectoryPage().sendKeys("m");
//		Thread.sleep(4000);
//		ui_directoryPage.empName_DirectoryPage().sendKeys(Keys.ARROW_DOWN);
//		
		ui_directoryPage.JobTitleDropDown_DirPage().click();
		ui_directoryPage.JobTitleDropDown_DirPage().sendKeys(Keys.ARROW_DOWN);
		ui_directoryPage.JobTitleDropDown_DirPage().sendKeys(Keys.ARROW_DOWN);
		ui_directoryPage.JobTitleDropDown_DirPage().sendKeys(Keys.ENTER);
		
		ui_directoryPage.LocationDropDown_DirPage().click();
	    ui_directoryPage.LocationDropDown_DirPage().sendKeys(Keys.ARROW_DOWN);
	    ui_directoryPage.LocationDropDown_DirPage().sendKeys(Keys.ARROW_DOWN);
	    ui_directoryPage.LocationDropDown_DirPage().sendKeys(Keys.ENTER);
	    
	    ui_directoryPage.searchButton_DirPage().click();

	}
	
	public void a_resetclick() {
		ui_directoryPage.resetButton_DirPage().click();
	}
	
	public void a_getrecordinfo() {
		ui_directoryPage.firstRecordFound_DirPage().click();
		
	}
	
	public void  a_clickarrowbutton() {
		ui_directoryPage.arrowButton_DirPage().click();
	}

}
