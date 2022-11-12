package Screens;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.ScreenBase;
import Utilities.Capabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MediaProjectionScreen extends ScreenBase{
	Capabilities obj = new Capabilities();
	static AppiumDriver<MobileElement> driver;
	public MediaProjectionScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver=driver;
	}
	String text="";
	public static Logger log = LogManager.getLogger(MediaProjectionScreen.class);
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[3]") 
	public RemoteWebElement mediaprojectionbtn;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Spinner/android.widget.TextView") 
	public RemoteWebElement dimensionsbtn;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]") 
	public RemoteWebElement dimension;
	@FindBy(id="screen_sharing_toggle") 
	public RemoteWebElement screensharingbtn;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]") 
	public RemoteWebElement startnowbtn;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView") 
	public RemoteWebElement check;
	public void mediaprojectiobtnclick() throws InterruptedException {
		log.info(driver.getContext());
		mediaprojectionbtn.click();
		Thread.sleep(1000);
	}
	public void dimensionbtnclick() throws InterruptedException {
		log.info(driver.getContext());
		dimensionsbtn.click();
		Thread.sleep(1000);
		log.info(driver.getContext());
		dimension.click();
		Thread.sleep(1000);
	}
	public void screensharingbtnclick() throws InterruptedException {
		log.info(driver.getContext());
		screensharingbtn.click();
		Thread.sleep(1000);
		startnowbtn.click();
		Thread.sleep(3000);
	}
	public String AssertionCheck() {
		text=check.getText();
		log.info(text);
		return text;
	}
}
