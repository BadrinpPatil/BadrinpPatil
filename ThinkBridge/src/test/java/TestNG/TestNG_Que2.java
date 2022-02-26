package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.BaseClass_Que2_MailVerify;
import POM.BaseClass_Question2;

public class TestNG_Que2 {
	WebDriver driver;
	BaseClass_Question2 baseClass_Question2;
	
	
	@BeforeClass
	public void LaunchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://jt-dev.azurewebsites.net/#/SignUp");
		driver.manage().window().maximize();
		
	}
	@BeforeMethod
	public void CreateObj() {

		baseClass_Question2=new BaseClass_Question2(driver);
		
		
		
		
	}
	@Test
	public void TestCase001ToVerifyDetails() throws InterruptedException {
		
	baseClass_Question2.verfiyDropDownLanguage();
	Thread.sleep(2000);
	baseClass_Question2.verfiyDropDownDutch();
	Thread.sleep(2000);
	baseClass_Question2.verfiyDropDownLanguage();
	Thread.sleep(2000);
	baseClass_Question2.verifyDropDownEnglish();
	Thread.sleep(2000);
	baseClass_Question2.FillupDetails();
	}
	
	@AfterMethod
	public void Logout() {
		baseClass_Question2=null;
		
		
	}
	@AfterClass
	public void CloseBrowser() {
		
	}
	

}
