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

public class MediaPlayerScreen extends ScreenBase{
	Capabilities obj = new Capabilities();
	static AppiumDriver<MobileElement> driver;
	public MediaPlayerScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver=driver;
	}
	String text="";
	public static Logger log = LogManager.getLogger(MediaPlayerScreen.class);
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[7]") 
	public RemoteWebElement mediabtn;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[2]") 
	public RemoteWebElement mediaplayerbtn;
	@FindBy(id="localvideo") 
	public RemoteWebElement localvideobtn;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView") 
	public RemoteWebElement check;
	public void mediabtnclick() throws InterruptedException {
		log.info(driver.getContext());
		mediabtn.click();
		Thread.sleep(1000);
	}
	public void mediaplayerbtnclick() throws InterruptedException {
		log.info(driver.getContext());
		mediaplayerbtn.click();
		Thread.sleep(1000);
	}
	public void localvideobtnclick() throws InterruptedException {
		log.info(driver.getContext());
		localvideobtn.click();
		Thread.sleep(1000);
	}
	public String AssertionCheck() {
		text=check.getText();
		log.info(text);
		return text;
	}
}
