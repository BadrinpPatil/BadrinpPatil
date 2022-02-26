package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BaseClass_Que2_MailVerify {
	

	@FindBy (xpath="//input[@type='email']")
	private WebElement enterMail;
	
	@FindBy (xpath="//span[text()='Next']")
	private WebElement nextButton;
	
//----------------------------------------------------------------------
public BaseClass_Que2_MailVerify(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
//-------------------------------------------------------------	-----------

public void detailofMail() {
	enterMail.sendKeys("badrinppatil@gmail.com");
	nextButton.click();
	
	
}
	
}
