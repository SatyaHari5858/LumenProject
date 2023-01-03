package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class MenPage {
	public WebDriver driver;

	public MenPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}

	@FindBy(xpath = "//div[@class='sections nav-sections']/descendant::span[text()='Men']")
	@CacheLookup
	WebElement men;

	public void user_click_on_men_drop_down() {
		men.click();
	}

	@FindBy(xpath = "//div[@class='page-title-wrapper']/descendant::span")
	@CacheLookup
	WebElement menbreadcrum;

	public void user_verify_Men_breadcrum() {
		String menbreadcrumtxt = menbreadcrum.getText();
		System.out.println("men breadcrum txt is" + menbreadcrumtxt);
	}

	@FindBy(xpath = "//div[@class='categories-menu']/descendant::a[text()='Jackets']")
	@CacheLookup
	WebElement jackets;

	public void user_click_on_jackets_option() {
		jackets.click();
	}

	@FindBy(xpath = "//div[@class='product-item-info']/descendant::span/img[@alt='Lando Gym Jacket']")
	@CacheLookup
	WebElement jacketsproduct;

	public void user_selecet_any_product() {
		jacketsproduct.click();
	}

	@FindBy(xpath = "//div[@class='page-title-wrapper product']/descendant::span")
	@CacheLookup
	WebElement selectedproduct;

	public void user_see_item_name() {
		String menproductheading = selectedproduct.getText();
		System.out.println("men product heading is" + menproductheading);
	}
}
