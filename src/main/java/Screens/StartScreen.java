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

public class StartScreen extends ScreenBase{
	Capabilities obj = new Capabilities();
	static AppiumDriver<MobileElement> driver;
	public StartScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver=driver;
	}
	public static Logger log = LogManager.getLogger(StartScreen.class);
	@FindBy(id="com.android.permissioncontroller:id/continue_button") 
	public RemoteWebElement continuee;
	@FindBy(id="android:id/button1") 
	public RemoteWebElement ok;
	@FindBy(id="buttonDefaultPositive") 
	public RemoteWebElement ok2;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[2]")
	public RemoteWebElement ApiDemoBtn;
	public void StartScreenButtons() throws InterruptedException {
		log.info(driver.getContext());
		continuee.click();
		Thread.sleep(2000);
		log.info(driver.getContext());
		ok.click();
		Thread.sleep(1000);
		log.info(driver.getContext());
		ok2.click();
		Thread.sleep(1000);
		ApiDemoBtn.click();
		log.info(driver.getContext());
		Thread.sleep(1000);
	}
}
