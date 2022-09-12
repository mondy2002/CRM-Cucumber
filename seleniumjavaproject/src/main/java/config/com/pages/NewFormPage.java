package config.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qacart.base.base;

import junit.framework.Assert;

public class NewFormPage extends base{
	public  NewFormPage ()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath="//*[@title='Forms']")
	WebElement forms;
	@FindBy (xpath="//*[@Value='New Form']")
	WebElement Nform;
	 @FindBy(id="title")
	 WebElement Title;
	 @FindBy(id="pages")
	 WebElement Pages;
	 @FindBy(id="report_email")
	 WebElement Email;
	 @FindBy (xpath="//*[@name='description']")
		WebElement Desc;
	 @FindBy (xpath="//*[@name='welcome_message']")
		WebElement Welcome; 

	 @FindBy (xpath="//*[@Value='Save']")
	 WebElement save;
	 
	 @FindBy (xpath="//*[@class='datacardtitle']")
	 WebElement emailsaved;
	 public void ReachLogin()
	 {
		 driver.switchTo().frame("mainpanel");
		 forms.click();
		 Nform.click();
	 }
	 public void FillData(String title,String pages,String email,String desc,String welcome)
	 {
		 Title.sendKeys(title);
		 Pages.sendKeys(pages);
		 Email.sendKeys(email);
		 Desc.sendKeys(desc);
		 Welcome.sendKeys(welcome);
		 save.click();
	 }
	 public NewFormPage SavedSuccessfuly()
	 {
		 Assert.assertTrue(emailsaved.isDisplayed());
		 return new NewFormPage();
	 }


}
