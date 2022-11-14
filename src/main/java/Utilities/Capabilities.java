package Utilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import Base.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Capabilities extends TestBase{
	static DesiredCapabilities capabilities = new DesiredCapabilities();
	public static AppiumDriver<MobileElement> driver;
	static String Version=prop.getProperty("platformVersion");
	static String p_name=prop.getProperty("platformName");
	static String apppackage=prop.getProperty("appPackage");
	static String appActivity=prop.getProperty("appActivity");
	static String app=prop.getProperty("app");
	static String d_name=prop.getProperty("deviceName");
	public static void setCapabilties() {
		capabilities.setCapability("platformVersion", Version);
		capabilities.setCapability("platformName", p_name);
		capabilities.setCapability("appPackage", apppackage);
		capabilities.setCapability("appActivity", appActivity);
		capabilities.setCapability("app", app);
		capabilities.setCapability("deviceName", d_name);
		capabilities.setCapability("isHeadless",true);
	}
	public void getAndroidDriver() throws MalformedURLException
	{
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
	}
}
