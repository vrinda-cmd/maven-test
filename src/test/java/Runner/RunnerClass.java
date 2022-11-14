package Runner;

import java.io.File;
import Utilities.Screenshots;
import java.io.IOException;
import java.lang.reflect.Method;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.junit.runner.RunWith;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import Utilities.AppiumServer;
import Utilities.Capabilities;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin= {"pretty"},
		features={"./src/test/java/Features/Animation.feature","./src/test/java/Features/App.feature","./src/test/java/Features/Media.feature","./src/test/java/Features/Text.feature"},
		glue="StepDefinitions",
		tags= {"@RegressionTest,@SmokeTest"}
		)
public class RunnerClass extends AbstractTestNGCucumberTests{
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	static {

		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.xml";
		Configurator.initialize(null, log4jConfigFile);
	}
	public static Logger log = LogManager.getLogger(RunnerClass.class);
	//Appium server is starting
	@BeforeSuite
	public void setup() {
		AppiumServer.startserver();
		log.info("Appium Server started");
		extent = new ExtentReports("./Reports/ExtentReport.html");
	}
	//Function will tell the extent report that which method is going to start
	@BeforeMethod
	public void startTest(Method name) {
		String testname = name.getName();
		extentTest = extent.startTest(testname);
	}
	//Function will set the data for extent report
	@AfterMethod
	public void atestCaseResult(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {

			extentTest.log(LogStatus.FAIL, "Test Case Failed ");
		} else {
			if (result.getStatus() == ITestResult.SUCCESS) {
				extentTest.log(LogStatus.PASS, "Test case passed successfully");
			}
		}
	}
	//Function tells the extent report that testing is stopped
	@AfterMethod
	public void endTest() {
		extent.endTest(extentTest);
	}
	//Appium server is stopped as well as extent report is closed
	@AfterSuite
	public void Teardown() {
		log.info("Appium server stopped");
		AppiumServer.stopserver();
		extent.flush();
		extent.close();
	}

}
