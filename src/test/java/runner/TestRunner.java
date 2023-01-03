package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features", 
       			glue = "steps", 
       			monochrome = true, 
       			dryRun = false, 
       			tags = "@Men",
		
		plugin = { "pretty", "html:target/cucumber-reports.html" }
		// plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
		//plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" }
)
		public class TestRunner extends AbstractTestNGCucumberTests {

}
