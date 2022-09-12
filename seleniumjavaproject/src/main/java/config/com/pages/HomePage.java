package config.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qacart.base.base;


import junit.framework.Assert;



public class HomePage extends base {
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="[@value='.logo_text']")
	 WebElement homepagelogo;
	 @FindBy(xpath="//a[@title='Contacts']")
	 WebElement menucontact;
	 @FindBy(xpath="//a[@title='Calendar')]")
	 WebElement CalendarButton; 
	 
	 
	 public void islogodisplayed() {
			driver.switchTo().frame("mainpanel");
			Assert.assertTrue(homepagelogo.isDisplayed());
	 }
	 
	 public void MovetoCalendar()
	 
	 {
		    driver.switchTo().frame( "mainpanel");
			Actions action=new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//a[@title='Calendar']"))).build().perform();
	 }
}
