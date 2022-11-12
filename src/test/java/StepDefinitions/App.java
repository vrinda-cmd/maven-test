package StepDefinitions;

import Runner.RunnerClass;
import Screens.SearchScreen;
import Screens.StartScreen;
import Screens.display_options;
import Utilities.Capabilities;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import junit.framework.Assert;

public class App extends Capabilities{
	StartScreen obj1;
	display_options obj2;
	SearchScreen obj3;
	@Given("User click on app button")
	public void user_click_on_app_button() throws Throwable{
		obj1=new StartScreen(driver);
		obj1.StartScreenButtons();
		obj2=new display_options(driver);
		obj2.appbtnclick();
	}

	@When("User click on action bar button")
	public void user_click_on_action_bar_button() throws Throwable{
		obj2.actionbtnclick();
	}

	@When("User click on display options button")
	public void user_click_on_display_options_button() throws Throwable{
		obj2.displaybtnclick();
	}

	@Then("User click on Display_show_title button")
	public void user_click_on_display_show_title_button() throws Throwable{
		obj2.displayshowbtnclick();
	}

	@When("User click on search")
	public void user_click_on_search() throws Throwable{
		obj3=new SearchScreen(driver);
		obj3.searchbtnclick();
	}

	@When("User click on invoke search button")
	public void user_click_on_invoke_search_button() throws Throwable{
		obj3.invokebtnclick();
	}

	@When("^User enter \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_enter(String arg1, String arg2) throws Throwable {
		obj3.enterdetails(arg1, arg2);
	}

	@Then("User click on OnSearchRequest")
	public void user_click_on_on_search_request() throws Throwable{
		obj3.searchbtn1click();
	}
}
