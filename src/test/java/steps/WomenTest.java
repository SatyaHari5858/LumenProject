package steps;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.HomePage;
import pages.WomenPage;

public class WomenTest extends Base {

	@Given("user click on {string} Drop down")
	public void user_click_on_drop_down(String string) {
		home = new HomePage(driver);
		home.weomendd();
	}

	@And("user verify {string} breadcrum")
	public void user_verify_breadcrum(String string) {
		women = new WomenPage(driver);
		women.verifybreadcrum();
	}

	@And("user click on {string}")
	public void user_click_on(String string) {
		women.click_on_HoodiesandSweatshirts();
	}

	@And("user should see the text of {string}")
	public void user_should_see_the_text_of(String string) {
		women.verify_productTitle();
	}

	@And("user select any of the product")
	public void user_select_any_of_the_product() {
		women.selectOneItem();
	}

	@And("user should see ItemName {string}")
	public void user_should_see_item_name(String string) {
		women.ItemName();
		
	}

	

}
