package Steps;

import org.openqa.selenium.By;

import com.qacart.base.base;

import config.com.pages.NewFormPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class NewFormSteps extends base{
	NewFormPage newform= new NewFormPage();

	  @When ("user press login clicks on forms and then clicks on new form")
	  public void user_press_login_clicks_on_forms_and_then_clicks_on_new_form()
	  {
		  newform.ReachLogin();
	  }
	  @And ("fill in title as {string}, pages as {string} , report email as {string} ,describtion as {string}and welcome as {string}")
	  public void user_fills_in_the_data(String title,String pages,String email,String desc,String welcome)
	  
	  {
		  newform.FillData(title, pages, email, desc, welcome);
	  }
	  @Then ("the report is created suuccessfully and details are shown")
	  public void the_report_is_created_suuccessfully_and_details_are_shown()
	  {
		  newform =newform.SavedSuccessfuly();
	  }
	  @Then ("error message appears")
	  public void error_message_appears()
	  {
		  Assert.assertTrue(driver.findElement(By.xpath("//*[@class='datacardtitle']")).isDisplayed());
		  System.out.println("failed invaid data");
		  
	  }
}
