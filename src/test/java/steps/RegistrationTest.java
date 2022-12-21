package steps;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ResgistrationPage;

public class RegistrationTest extends Base {

	@And("user enter first name")
	public void user_enter_first_name() {
		registration = new ResgistrationPage(driver);
		registration.enter_firstname();
		System.out.println("user entered first name");
	}

	@And("user enter last name")
	public void user_enter_last_name() {
		registration.enter_lastname();
	}

	@And("user enter email")
	public void user_enter_email() {
		registration.enter_email();
	}

	@And("user enter password")
	public void user_enter_password() {
		registration.enter_password();
	}

	@And("user enter confirm password")
	public void user_enter_confirm_password() {
		registration.enter_confirmpass();
	}

	@And("user click on create an account button")
	public void user_click_on_create_an_account_button() {
		registration.click_create_button();
	}

	@Then("user should see {string} or {string} message")
	public void user_should_see_message(String successmsg, String failuremsg) {

		try {

			registration.new_user_created();

		} catch (Exception e) {
			registration.user_exist();
			e.getMessage();
		}

	}
}
