package Steps;

import org.openqa.selenium.By;

import com.qacart.base.base;

import config.com.pages.CalendarPage;
import config.com.pages.HomePage;
import config.com.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CalendarSteps extends base{
	LoginPage login;
	HomePage homepage;
	CalendarPage calendar;
	@Given("user logged in successfully")
	public void user_logged_in_successfully()
	{
		launchbrowser();
		login= new LoginPage();
		homepage= login.performlogin("mondy1", "123456");
	}
	@When("user hover the calender button")
	public void user_hover_the_calender_button()
	{
         homepage.MovetoCalendar();
	}
	@And ("chooses New event")
	public void chooses_New_event()
	{
		driver.findElement(By.xpath("//a[@title='New Event']")).click();
	}
	@And ("chooses view today")
	public void chooses_view_today()
	{
		driver.findElement(By.xpath("//a[@title='View Today']")).click();
	}

	@And ("chooses week view")
	public void chooses_week_view()
	{
		driver.findElement(By.xpath("//a[@title='Week View']")).click();
	}

	@And ("chooses month view")
	public void chooses_month_view()
	{
		driver.findElement(By.xpath("//a[@title='Month View']")).click();
	}
	@Then("user should navigate to New event page")
	public void user_should_navigate_to_New_event_page()
	{
		calendar=new CalendarPage();
		calendar=calendar.isnewevent();
	}
	@Then("user should navigate to view today page")
	public void user_should_navigate_to_view_today_page()
	{
		calendar=new CalendarPage();

		calendar=calendar.isviewtoday();

	}
	@Then("user should navigate to week view page")
	public void user_should_navigate_to_week_view_page()
	{
		calendar=new CalendarPage();

		calendar=calendar.isweekview();

	}
	@Then("user should navigate to month view page")
	public void user_should_navigate_to_month_view_page()
	{
		calendar=new CalendarPage();

		calendar=calendar.ismonthview();

	}

	@Then("git push")
	public void user_should_navigate_to_month_view_page()
	{
		calendar=new CalendarPage();

		calendar=calendar.ismonthview();

	}
	@Then("git diff")
	public void user_should_navigate_to_month_view_page()
	{
		calendar=new CalendarPage();

		calendar=calendar.ismonthview();

	}
	

}
