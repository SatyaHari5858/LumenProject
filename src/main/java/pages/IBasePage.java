package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import base.Base;

public class IBasePage extends Base {
	public WebDriver driver;

	public IBasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}

	@FindBy(xpath = "(//*[contains(@id,'option-label-color')])[3]")
	WebElement selectcolour;

	public void user_select_product_colour() {
		selectcolour.click();
	}

	@FindBy(xpath = "(//*[contains(@id,'product-price')][@data-price-type='finalPrice']/span)[1]")
	WebElement Item_Price;

	public void user_should_see_ItemPrice() {
		String price_of_the_item = Item_Price.getText();
		System.out.println("item Price is:" + price_of_the_item);
	}

	@FindBy(xpath = "(//*[contains(@id,'option-label-size')])[3]")
	WebElement selectsize;

	public void user_select_product_size() {
		selectsize.click();
	}

	@FindBy(xpath = "//div[@class='control']/child::input[@id='qty']")
	WebElement enterquantity;

	public void user_enter_QTY_in_Quantity_field() {
		enterquantity.clear();
		enterquantity.sendKeys(prop.getProperty("QTY"));
	}

	@FindBy(xpath = "//div/a[text()='shopping cart']")
	WebElement MyCart;

	public void user_navigate_to_mycart() {
		MyCart.click();
	}

	@FindBy(xpath = "//button/span[text()='Add to Cart']")
	WebElement AddedToCart;

	public void user_click_on_added_to_cart_button() {
		AddedToCart.click();
	}

	@FindBy(xpath = "(//div[@id='tab-label-description']/following::div[@class='value']/descendant::p)[2]")
	WebElement productDetails;

	public void user_get_the_product_details() {
		String Details_of_product = productDetails.getText();
		System.out.println("Product Detaisl are :" + Details_of_product);
	}

	@FindBy(xpath = "//div[@class='messages']/descendant::div/child::div")
	WebElement cartSuccessmsg;

	public void user_verify_cart_message() {
		String message = cartSuccessmsg.getText();
		System.out.println("Added to Cart success message is :" + message);
	}

	@FindBy(xpath = "//div[@class='cart-summary']/descendant::button")
	WebElement checkout;

	public void user_click_on_checkout_button() {
		checkout.click();
	}

	@FindBy(xpath = "//input[@name='street[0]']")
	WebElement StreetAddress;

	public void user_enter_street_address() {
		StreetAddress.sendKeys(prop.getProperty("StreetAddress"));
	}

	@FindBy(xpath = "//input[@name='city']")
	WebElement City;

	public void user_enter_City_Name() {
		City.sendKeys(prop.getProperty("CityName"));
	}

	@FindBy(xpath = "//select[@name='region_id']")
	WebElement region;

	public void user_select_state() {
		Select select = new Select(region);
		select.selectByVisibleText("Telangana");
	}

	@FindBy(xpath = "//input[@name='postcode']")
	WebElement zipcode;

	public void user_enter_zip_code() {
		zipcode.sendKeys(prop.getProperty("ZipCode"));
	}

	@FindBy(xpath = "//select[@name='country_id']")
	WebElement country;

	public void user_select_country_name() {
		Select select = new Select(country);
		select.selectByVisibleText("India");
	}

	@FindBy(xpath = "//input[@name='telephone']")
	WebElement phonenumber;

	public void user_enter_phone_number() {
		phonenumber.sendKeys(prop.getProperty("phonenumber"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	@FindBy(xpath = "//div[@id='checkout-shipping-method-load']/descendant::input[@value='tablerate_bestway']")
	WebElement bestwayradio;

	public void select_ShippingMethod() {
		bestwayradio.click();
	}

	@FindBy(xpath = "//button/span[text()='Next']")
	WebElement next;

	public void user_click_on_next_button() {
		next.click();
	}

	@FindBy(xpath = "//div/button/descendant::span[contains(text(),'Place')]")
	WebElement placeOrder;

	public void user_click_on_place_order_button() throws InterruptedException {
		Thread.sleep(5000);
		placeOrder.click();
	}

	@FindBy(xpath = "//div[@class='page-title-wrapper']/descendant::span")
	WebElement orderplace;

	public void user_should_verify_order_placed_text() {
		String placeOrder = orderplace.getText();
		System.out.println("Order placed Text is :" + placeOrder);
	}

	@FindBy(xpath = "//div[@class='checkout-success']")
	WebElement orderdetails;

	public void user_print_order_details() {
		String details = orderdetails.getText();
		System.out.println("Final order details are :" + details);
	}

	@FindBy(xpath = "//div[@class='primary']/descendant::span[contains(text(),'Continue')]")
	WebElement continueShopping;

	public void user_click_on_continue_shopping_button() {
		continueShopping.click();
	}

}
