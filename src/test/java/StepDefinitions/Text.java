package StepDefinitions;

import Screens.LogTextBoxScreen;
import Screens.StartScreen;
import Utilities.Capabilities;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Text extends Capabilities{
	StartScreen obj1;
	LogTextBoxScreen obj2;
	@Given("User click on Text")
	public void user_click_on_text() throws Throwable{
		obj1=new StartScreen(driver);
		obj1.StartScreenButtons();
		obj2=new LogTextBoxScreen(driver);
		obj2.textbtnclick();
	}

	@When("User click on log text box button")
	public void user_click_on_log_text_box_button() throws Throwable{
		obj2.logtextboxbtnclick();
	}

	@Then("User click on ADD button")
	public void user_click_on_add_button() throws Throwable{
		obj2.addbtnclick();
	}
}
