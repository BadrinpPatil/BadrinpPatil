package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.BaseClass_Que2_MailVerify;

public class TestNG_Que2_Verifymail {
	
	WebDriver driver;
	BaseClass_Que2_MailVerify baseClass_Que2_MailVerify;
	
	@BeforeClass
	public void LaunchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
	}
	@BeforeMethod
	public void CreateObj() {

		baseClass_Que2_MailVerify=new BaseClass_Que2_MailVerify(driver);
		
	}
	@Test
	public void TestCase002Verifymail() throws InterruptedException {
		
		baseClass_Que2_MailVerify.detailofMail();
		
	}
	
	
	@AfterMethod
	public void Logout() {
		
		
		
	}
	@AfterClass
	public void CloseBrowser() {
		
	}
	

}
