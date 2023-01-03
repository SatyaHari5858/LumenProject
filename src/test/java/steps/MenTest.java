package steps;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MenPage;

public class MenTest extends Base {

	@When("user click on men drop down")
	public void user_click_on_men_drop_down() {
		men = new MenPage(driver);
		men.user_click_on_men_drop_down();

	}

	@When("user verify Men breadcrum")
	public void user_verify_men_breadcrum() {
		men.user_verify_Men_breadcrum();
	}

	@When("user click on {string} option")
	public void user_click_on_option(String string) {
		men.user_click_on_jackets_option();
	}

	@When("user selecet any product")
	public void user_selecet_any_product() {
		men.user_selecet_any_product();
	}

	@Then("user see item name")
	public void user_see_item_name() {
		
		
		men.user_see_item_name();
	}

}
