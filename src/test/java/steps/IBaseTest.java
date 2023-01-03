package steps;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.IBasePage;

public class IBaseTest extends Base {

	@And("user select product colour")
	public void user_select_product_colour() {
		Ibase = new IBasePage(driver);
		Ibase.user_select_product_colour();
	}

	@And("user should see ItemPrice {string}")
	public void user_should_see_item_price(String string) {
		Ibase = new IBasePage(driver);
		Ibase.user_should_see_ItemPrice();
	}

	@And("user select product size")
	public void user_select_product_size() {
		Ibase.user_select_product_size();
	}

	@And("user enter QTY in Quantity field")
	public void user_enter_qty_in_quantity_field() {
		Ibase.user_enter_QTY_in_Quantity_field();
	}

	@And("user click on added to cart button")
	public void user_click_on_added_to_cart_button() {
		Ibase.user_click_on_added_to_cart_button();
	}

	@Then("user verify cart message")
	public void user_verify_cart_message() {
		Ibase.user_verify_cart_message();
	}

	@And("user get the product details")
	public void user_get_the_product_details() {
		Ibase.user_get_the_product_details();
	}

	@And("user navigate to mycart")
	public void user_navigate_to_mycart() {
		Ibase.user_navigate_to_mycart();
	}

	@And("user click on checkout button")
	public void user_click_on_checkout_button() {
		Ibase.user_click_on_checkout_button();
	}

	@And("user enter street address")
	public void user_enter_street_address() {
		Ibase.user_enter_street_address();
	}

	@And("user enter City Name")
	public void user_enter_city_name() {
		Ibase.user_enter_City_Name();
	}

	@And("user select country name")
	public void user_select_country_name() {
		Ibase.user_select_country_name();
	}

	@And("user select state")
	public void user_select_state() {
		Ibase.user_select_state();
	}

	@And("user enter zip code")
	public void user_enter_zip_code() {
		Ibase.user_enter_zip_code();
	}

	@And("user enter phone number")
	public void user_enter_phone_number() {
		Ibase.user_enter_phone_number();
	}

	@And("user click on next button")
	public void user_click_on_next_button() {
		Ibase.user_click_on_next_button();
	}

	@And("user click on place order button")
	public void user_click_on_place_order_button() throws InterruptedException {
		Ibase.user_click_on_place_order_button();
	}

	@And("user should verify {string}")
	public void user_should_verify(String string) {
		Ibase.user_should_verify_order_placed_text();
	}

	@And("user print order details")
	public void user_print_order_details() {
		Ibase.user_print_order_details();
	}

	@Then("user click on continue shopping button")
	public void user_click_on_continue_shopping_button() {
		Ibase.user_click_on_continue_shopping_button();
	}

}
