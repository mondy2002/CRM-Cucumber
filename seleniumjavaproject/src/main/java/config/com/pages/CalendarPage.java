package config.com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qacart.base.base;

import junit.framework.Assert;

import org.openqa.selenium.support.PageFactory;

import com.qacart.base.base;

public class CalendarPage extends base {

	public CalendarPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="//*[@class='fieldset']")
	WebElement evinfo;
	@FindBy (xpath="//*[@Value='Week View']")
	WebElement vtoday;
	@FindBy (xpath="//*[@class='calendartitle']")
	WebElement wview;
	
	@FindBy (xpath="//*[@class='calendartitle']")
		WebElement mview;
	// we will make the next methods from the type calendar page cause we are not willing to test the pages of these methods 
	 public CalendarPage isnewevent()
	 {
		 Assert.assertTrue(evinfo.isDisplayed());
		 return new CalendarPage();
	 }
	 public CalendarPage isviewtoday()
	 {
		 Assert.assertTrue(vtoday.isDisplayed());
		 return new CalendarPage();
	 }
	 public CalendarPage ismonthview()
	 {
		 Assert.assertTrue(mview.isDisplayed());
		 return new CalendarPage();
	 }
	 public CalendarPage isweekview()
	 
	 {
		 Assert.assertTrue(wview.isDisplayed());
		 return new CalendarPage();
	 }
}
