package steps;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.Base;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import pages.HomePage;

public class HomeTest extends Base {

	@Before
	public void startbrowser() throws IOException {
		driver = SetupDriver();
	}

	@Given("user navigate to application url")
	public void user_navigate_to_application_url() throws IOException {

		driver.get(prop.getProperty("url"));
	}

	@When("^user click on Create an Account link$")
	public void user_click_on_createAccount_link() {
		home = new HomePage(driver);
		home.user_click_on_creat_account();

	}

	@And("user navigated to registration page")
	public void user_navigated_to_registration_page() {
		home.verification_creat_accounttxt();
	}

	@After
	public void closeBrowser(Scenario scenario) {

		if (scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			//Allure.addAttachment("Failed Screen Shot", new ByteArrayInputStream(screenshot));
			scenario.attach(screenshot, "image/png", "screenshot");
		}
		driver.close();
		driver.quit();
	}

}
