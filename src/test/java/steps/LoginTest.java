package steps;

import java.io.IOException;

import base.Base;
import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginTest extends Base {

	@Given("^user navigate to the Application$")
	public void user_navigate_to_the_application() throws IOException {
		driver = SetupDriver();
		driver.get(prop.getProperty("url"));
	}

	@And("^user navigated to login page$")
	public void user_navigated_to_login_page() {
		log_in = new LoginPage(driver);
		log_in.click_sign_in();
	}

	@When("^user enter username and password$")
	public void user_enter_username_and_password() {
		log_in.enter_email();
		log_in.enter_password();
	}

	@And("^user should be logged in$")
	public void user_should_be_logged_in() {
		log_in.click_Signinbtn();
	}

	@Then("^user should see \"([^\"]*)\"$")
	public void user_should_see_something(String arg) throws Throwable {
		try {
			Thread.sleep(3000);
			log_in.successverification();

		} catch (Exception e) {
			log_in.failedsverification();
			e.getMessage();
		}
	}

	@When("^user enter invalid username and password$")
	public void user_enter_invalid_username_and_password() {
		log_in.enter_invalid_email();
		log_in.enter_invalid_password();
	}

	@Then("^user should see error message \"([^\"]*)\"$")
	public void user_should_see_error_message_something(String errormessage) {
		log_in.userseeloginerror();
	}

}
