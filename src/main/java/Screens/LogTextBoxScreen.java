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

public class LogTextBoxScreen extends ScreenBase{
	Capabilities obj = new Capabilities();
	static AppiumDriver<MobileElement> driver;
	public LogTextBoxScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver=driver;
	}
	public static Logger log = LogManager.getLogger(LogTextBoxScreen.class);
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[12]") 
	public RemoteWebElement textbtn;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[2]") 
	public RemoteWebElement logtextboxbtn;
	@FindBy(id="add") 
	public RemoteWebElement addbtn;
	public void textbtnclick() throws InterruptedException {
		log.info(driver.getContext());
		textbtn.click();
		Thread.sleep(1000);
	}
	public void logtextboxbtnclick() throws InterruptedException {
		log.info(driver.getContext());
		logtextboxbtn.click();
		Thread.sleep(1000);
	}
	public void addbtnclick() throws InterruptedException {
		log.info(driver.getContext());
		addbtn.click();
		Thread.sleep(1000);
	}
}
