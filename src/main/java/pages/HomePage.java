package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
		// new AjaxElementLocatorFactory(driver, 20),
	}

	@FindBy(xpath = "//a[text()='Create an Account']")
	@CacheLookup
	WebElement creat_account;

	public void user_click_on_creat_account() {

		creat_account.click();
	}

	@FindBy(xpath = "//div[@class='page-title-wrapper']/descendant::span")
	@CacheLookup
	WebElement creat_accounttxt;

	public void verification_creat_accounttxt() {
		String txt = creat_accounttxt.getText();
		System.out.println("verification text is " + txt);
		Assert.assertEquals(txt, "Create New Customer Account");
		
	}

}
