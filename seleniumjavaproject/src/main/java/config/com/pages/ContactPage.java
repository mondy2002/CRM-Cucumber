package config.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage {
	@FindBy(name="cs_email")
	 WebElement emailtextfield;
	@FindBy(css="[value='New Contact']")
	 WebElement addnewcontact;
	@FindBy(id="first_name")
	 WebElement firstname;
	@FindBy(id="surname")
	 WebElement lastname;
	@FindBy(xpath="//input[@value='Save']")
	 WebElement save;
	@FindBy(css="[value='Previous']")
	 WebElement previous;

}
