package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.Base;

public class WomenPage extends Base {

	public WebDriver driver;
	IBasePage i = new IBasePage(driver);

	public WomenPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
		// new AjaxElementLocatorFactory(driver, 20),

	}

	@FindBy(xpath = "//div[@class='page-title-wrapper']/child::h1/span")
	WebElement breadcrum;

	public void verifybreadcrum() {
		String womenBCT = breadcrum.getText();
		System.out.println(womenBCT);
	}

	@FindBy(xpath = "//div[@class='categories-menu']/descendant::li/a[contains(text(),'Hoodies & Sweatshirts')]")
	WebElement Hoodies_and_Sweatshirts;

	public void click_on_HoodiesandSweatshirts() {
		Hoodies_and_Sweatshirts.click();
	}

	@FindBy(xpath = "//div[@class='page-title-wrapper']/descendant::span")
	WebElement heading;

	public void verify_productTitle() {
		String title = heading.getText();
		System.out.println("product title is :" + title);
	}

	@FindBy(xpath = "//div[@class='product-item-info']/descendant::img[@alt='Autumn Pullie']")
	WebElement product;

	public void selectOneItem() {
		product.click();
	}

	@FindBy(xpath = "//div[@class='page-title-wrapper product']/descendant::span")
	WebElement Item_Name;

	public void ItemName() {
		String name_of_the_item = Item_Name.getText();
		System.out.println("item Name is:" + name_of_the_item);
		this.Ibase = i;

	}

}
