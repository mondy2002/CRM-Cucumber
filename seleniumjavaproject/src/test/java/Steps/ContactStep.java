package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qacart.base.base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class ContactStep extends base {
	@And ("Clicks on context") 
	public void Clicks_on_context()
	{
		//driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[@title='Contacts']")).click();
	}
	@Then("email text field should be visible")
	public void email_text_field_should_be_visible() 
	{
        Assert.assertTrue(driver.findElement(By.name("cs_email")).isDisplayed());

	}
	
	
	
	
	@And ("Clicks on new contact") 
	public void Clicks_on_new_contact()
	{
        driver.findElement(By.cssSelector("[value='New Contact']")).click();
  

	}
	@And ("Fill the first name and password") 
	public void Fill_the_first_name_and_password ()
	{
		driver.findElement(By.id("first_name")).sendKeys("mondyy");
		driver.findElement(By.id("surname")).sendKeys("mo");
		 WebElement  save  =driver.findElement(By.xpath("//input[@value='Save']"));
		 save.click();	

	}
	
	
	@Then("A new contact should be added")
	public void A_new_contact_should_be_added() 
	{
        Assert.assertTrue(driver.findElement(By.cssSelector("[value='Previous']")).isDisplayed());

	}

}
