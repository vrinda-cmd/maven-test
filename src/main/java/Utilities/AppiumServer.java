package Utilities;

import Base.TestBase;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumServer extends TestBase{
	public static void startserver() {
		service=AppiumDriverLocalService.buildDefaultService();
		service.start();
	}
	public static void stopserver() {
		service.stop();
	}
}
