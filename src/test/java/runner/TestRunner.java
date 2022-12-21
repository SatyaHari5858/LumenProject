package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features", 
glue = "steps", 
monochrome = true, 
dryRun = false, 
plugin = {"pretty", "io.qameta.cucumber7jvm.AllureCucumber7Jvm" }, 
tags ="@Login"

)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	

}
