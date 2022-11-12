package StepDefinitions;

import Runner.RunnerClass;
import Screens.MediaPlayerScreen;
import Screens.MediaProjectionScreen;
import Screens.StartScreen;
import Utilities.Capabilities;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import junit.framework.Assert;

public class Media extends Capabilities{
	StartScreen obj1;
	MediaPlayerScreen obj2;
	MediaProjectionScreen obj3;
	@Given("User click on media button")
	public void user_click_on_media_button() throws Throwable{
		obj1=new StartScreen(driver);
		obj1.StartScreenButtons();
		obj2=new MediaPlayerScreen(driver);
		obj2.mediabtnclick();
	}

	@When("User click on media player button")
	public void user_click_on_media_player_button() throws Throwable{
		obj2.mediaplayerbtnclick();
	}

	@Then("User clik on play video from local file")
	public void user_clik_on_play_video_from_local_file() throws Throwable{
		obj2.localvideobtnclick();
		Assert.assertEquals(obj2.AssertionCheck(), "Media/MediaPlayer");
	}
	
	@When("User click on Media projection button")
	public void user_click_on_media_projection_button() throws Throwable{
		obj3=new MediaProjectionScreen(driver);
		obj3.mediaprojectiobtnclick();
	}

	@When("User change the dimensions and then click on start now")
	public void user_change_the_dimensions_and_then_click_on_start_now() throws Throwable{
		obj3.dimensionbtnclick();
	}

	@Then("User click on ok")
	public void user_click_on_ok() throws Throwable{
		obj3.screensharingbtnclick();
		Assert.assertEquals(obj3.AssertionCheck(), "Media/MediaProjection");
	}
}
