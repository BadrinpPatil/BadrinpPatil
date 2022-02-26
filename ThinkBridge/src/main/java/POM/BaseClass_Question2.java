package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BaseClass_Question2 {
	WebDriver driver;


	@FindBy (xpath ="(//span[@tabindex='-1'])[2]")
	private WebElement DropDownLanguage ;
	
	@FindBy (xpath="//div[text()='Dutch']")
	private WebElement DropDownDutch;

	@FindBy (xpath="//div[text()='English']")
	private WebElement DropDownEnglish;
	
	@FindBy (xpath="//input[@name='name']")
	private WebElement Fillname;
	
	@FindBy (xpath="//input[@name='orgName']")
	private WebElement FillOrgname;
	
	@FindBy (xpath="//input[@name='email']")
	private WebElement Fillemail;
	
	@FindBy (xpath="//span[text()='I agree to the']")
	private WebElement clickOnTerms;
	
	@FindBy (xpath="//button[text()='Get Started']")
	private WebElement SignupButton;
	
	
//--------------------------------------------------------------	
	public BaseClass_Question2(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
//-------------------------------------------------------------	

	public void verfiyDropDownLanguage() throws InterruptedException 
	{
		DropDownLanguage.click();

	}
	public void verfiyDropDownDutch() {
		
		DropDownDutch.click();
	}
	
	public void verifyDropDownEnglish() {
		DropDownEnglish.click();
	}
	public void FillupDetails() throws InterruptedException {
		
		Fillname.sendKeys("Badrinarayan");
		Thread.sleep(2000);

		FillOrgname.sendKeys("BadrinNPatil");
		Thread.sleep(2000);

		Fillemail.sendKeys("badrinppatil@gmail.com");
		Thread.sleep(2000);

		clickOnTerms.click();
		Thread.sleep(2000);

		SignupButton.click();
		Thread.sleep(2000);	
		
	}
	
}
