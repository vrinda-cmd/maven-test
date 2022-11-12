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

public class SearchScreen extends ScreenBase{
	Capabilities obj = new Capabilities();
	static AppiumDriver<MobileElement> driver;
	public SearchScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver=driver;
	}
	public static Logger log = LogManager.getLogger(SearchScreen.class);
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[12]")
	public RemoteWebElement searchbtn;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[1]")
	public RemoteWebElement invokesearchbtn;
	@FindBy(id="txt_query_prefill")
	public RemoteWebElement prefillbtn;
	@FindBy(id="txt_query_appdata")
	public RemoteWebElement appdatabtn;
	@FindBy(id="btn_start_search")
	public RemoteWebElement searchbtn1;
	public void searchbtnclick() throws InterruptedException {
		log.info(driver.getContext());
		searchbtn.click();
		Thread.sleep(1000);
	}
	public void invokebtnclick() throws InterruptedException {
		log.info(driver.getContext());
		invokesearchbtn.click();
		Thread.sleep(1000);
	}
	public void enterdetails(String prefill, String appdata) throws InterruptedException {
		log.info(driver.getContext());
		prefillbtn.sendKeys(prefill);
		Thread.sleep(1000);
		log.info(driver.getContext());
		appdatabtn.sendKeys(appdata);
		Thread.sleep(1000);
	}
	public void searchbtn1click() throws InterruptedException {
		log.info(driver.getContext());
		searchbtn1.click();
		Thread.sleep(1000);
	}
}
