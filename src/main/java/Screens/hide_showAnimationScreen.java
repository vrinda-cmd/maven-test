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

public class hide_showAnimationScreen extends ScreenBase{
	Capabilities obj = new Capabilities();
	static AppiumDriver<MobileElement> driver;
	public hide_showAnimationScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver=driver;
	}
	public static Logger log = LogManager.getLogger(hide_showAnimationScreen.class);
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[2]")
	public RemoteWebElement Animationbtn;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[7]")
	public RemoteWebElement hide_showbtn;
	@FindBy(id="customAnimCB")
	public RemoteWebElement custombtn;
	@FindBy(id="hideGoneCB")
	public RemoteWebElement hidebtn;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]")
	public RemoteWebElement number1;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[2]")
	public RemoteWebElement number2;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[3]")
	public RemoteWebElement number3;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[4]")
	public RemoteWebElement number4;
	@FindBy(id="addNewButton")
	public RemoteWebElement showbtn;
	public void animationbtnclick() throws InterruptedException {
		log.info(driver.getContext());
		Animationbtn.click();
		Thread.sleep(1000);
	}
	public void hide_showbtnclick() throws InterruptedException {
		log.info(driver.getContext());
		hide_showbtn.click();
		Thread.sleep(1000);
	}
	public void hidebtnclick() throws InterruptedException {
		log.info(driver.getContext());
		custombtn.click();
		Thread.sleep(1000);
		log.info(driver.getContext());
		hidebtn.click();
		Thread.sleep(1000);
	}
	public void numberclick() throws InterruptedException {
		log.info(driver.getContext());
		number1.click();
		Thread.sleep(1000);
		log.info(driver.getContext());
		number3.click();
		Thread.sleep(1000);
	}
	public void showbtnclick() throws InterruptedException {
		log.info(driver.getContext());
		showbtn.click();
		Thread.sleep(1000);
	}
}
