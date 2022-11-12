package StepDefinitions;

import Runner.RunnerClass;
import Screens.StartScreen;
import Screens.ViewFlipScreen;
import Screens.hide_showAnimationScreen;
import Utilities.Capabilities;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class Animation extends Capabilities{
	StartScreen obj1;
	hide_showAnimationScreen obj2;
	ViewFlipScreen obj3;
	@Given("User click on Animation tab")
	public void user_click_on_animation_tab() throws Throwable {
		obj1=new StartScreen(driver);
		obj1.StartScreenButtons();
		obj2=new hide_showAnimationScreen(driver);
		obj2.animationbtnclick();
	}

	@When("User click on Hide-show transition")
	public void user_click_on_hide_show_transition() throws Throwable {
		obj2.hide_showbtnclick();
	}

	@When("Click on Custom animation and hide button")
	public void click_on_custom_animation_and_hide_button() throws Throwable {
		obj2.hidebtnclick();
	}

	@When("Click on button")
	public void click_on_button() throws Throwable {
		obj2.numberclick();
	}

	@Then("User click on show button")
	public void user_click_on_show_button() throws Throwable {
		obj2.showbtnclick();
	}
	@When("User click on view flip button")
	public void user_click_on_view_flip_button() throws Throwable{
		obj3=new ViewFlipScreen(driver);
		obj3.viewflipbtnclick();
	}

	@Then("User click on flip button")
	public void user_click_on_flip_button() throws Throwable{
		obj3.flipbtnclick();
	}
}
