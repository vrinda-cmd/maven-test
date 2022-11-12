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

public class display_options extends ScreenBase{
	Capabilities obj = new Capabilities();
	static AppiumDriver<MobileElement> driver;
	public display_options(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver=driver;
	}
	public static Logger log = LogManager.getLogger(display_options.class);
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[3]")
	public RemoteWebElement appbtn;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[1]")
	public RemoteWebElement actiondisplaybtn;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[6]")
	public RemoteWebElement displayoptionbtn;
	@FindBy(id="toggle_show_title")
	public RemoteWebElement displayshowbtn;
	public void appbtnclick() throws InterruptedException {
		log.info(driver.getContext());
		appbtn.click();
		Thread.sleep(1000);
	}
	public void actionbtnclick() throws InterruptedException {
		log.info(driver.getContext());
		actiondisplaybtn.click();
		Thread.sleep(1000);
	}
	public void displaybtnclick() throws InterruptedException {
		log.info(driver.getContext());
		displayoptionbtn.click();
		Thread.sleep(1000);
	}
	public void displayshowbtnclick() throws InterruptedException {
		log.info(driver.getContext());
		displayshowbtn.click();
		Thread.sleep(1000);
	}
	
}
