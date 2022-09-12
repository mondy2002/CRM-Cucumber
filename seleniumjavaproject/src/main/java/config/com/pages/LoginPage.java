package config.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qacart.base.base;

import junit.framework.Assert;

public class LoginPage extends base{
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
		
	
 @FindBy(name="username")
 WebElement username;
 @FindBy(name="password")
 WebElement password;
 @FindBy(xpath="//input[@value='Login']")
 WebElement login;
 public HomePage performlogin (String name, String pass)
 {
	 username.sendKeys(name);
	 password.sendKeys(pass);
	 login.click();
	 return new HomePage();
 }

 
}
