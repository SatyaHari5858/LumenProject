package runner;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.qameta.allure.Allure;

@CucumberOptions(features = "src/test/resources/Features", 
glue = "steps", 
monochrome = true, 
dryRun = false, 
plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" }, 
tags ="@Login"

)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	@BeforeClass
	public void before() {
		System.out.println("Browser is started");
	}
	
	WebDriver driver;
	
	
}
