package Test_Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testBase_OrangeHRM {
	public static WebDriver driver;
	public static Properties prop;
	
	public static void intializeLogin() throws InterruptedException{
		
		FileInputStream f;
		try {
			f = new FileInputStream("D:\\workspace\\orange\\config.properties");
			
			prop=new Properties();
			prop.load(f);
		     
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions=new ChromeOptions();
			chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		    driver = new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();
			driver.get(prop.getProperty("loginurl"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));			
			
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} 
		catch (IOException e) {
		
			e.printStackTrace();
		}		
	}

	public static void terminate() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
	
}
