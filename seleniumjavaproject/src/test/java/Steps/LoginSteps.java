package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qacart.base.base;

import config.com.pages.HomePage;
import config.com.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


public class LoginSteps extends base {
	LoginPage login;
	HomePage homepage;
	@Given("user come to the web site and go to login page")
	public void user_come_to_the_web_site_and_go_to_login_page()
	{ 

		launchbrowser();
			
	}
	@When("user fill in email as {string} and password as {string} and press login")
	public void user_fill_in_email_and_password_and_press_login(String user, String pass) {
//		WebElement 	Username =driver.findElement(By.name("username"));
//		WebElement Password =driver.findElement(By.name("password"));
//		WebElement loginbutton =driver.findElement(By.xpath("//input[@value='Login']"));
//	    Username.sendKeys(user);
//	    Password.sendKeys(pass);
//	    loginbutton.click();
		login= new LoginPage();
		homepage= login.performlogin(user, pass);
	}
	
	@Then("user should navigate to home page")
	public void user_should_navigate_to_home_page() {

		homepage.islogodisplayed();
		
	}
	@Then("error message should appear")
	public void error_message_should_appear() {
		Assert.assertTrue(driver.findElement(By.name("username")).isDisplayed());

		driver.quit();

	}
	
	
	
	
	

}
