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

public class ViewFlipScreen extends ScreenBase{
	Capabilities obj = new Capabilities();
	static AppiumDriver<MobileElement> driver;
	public ViewFlipScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver=driver;
	}
	public static Logger log = LogManager.getLogger(ViewFlipScreen.class);
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[14]")
	public RemoteWebElement viewflipbtn;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button")
	public RemoteWebElement flipbtn;
	public void viewflipbtnclick() throws InterruptedException {
		log.info(driver.getContext());
		swipMethod(0.70,0.10,0.50);
		viewflipbtn.click();
		Thread.sleep(1000);
	}
	public void flipbtnclick() throws InterruptedException {
		log.info(driver.getContext());
		flipbtn.click();
		Thread.sleep(1000);
	}
}
