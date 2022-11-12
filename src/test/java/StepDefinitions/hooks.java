package StepDefinitions;

import Runner.RunnerClass;
import Utilities.Capabilities;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks extends Capabilities{
	@Before
	public void launchANDinstalled() throws Exception
	{
		setCapabilties();
		getAndroidDriver();
		RunnerClass.log.info("device is initialized");

	}
	@After
	public  void StopDriver() {
		RunnerClass.log.info("driver is stopped");
		driver.quit();
	}
	
}
