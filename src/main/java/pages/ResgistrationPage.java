package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.Base;

public class ResgistrationPage extends Base {

	public WebDriver driver;

	public ResgistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
		// new AjaxElementLocatorFactory(driver, 20),
	}

	@FindBy(xpath = "//div[@class='control']/descendant::input[@id='firstname']")
	@CacheLookup
	WebElement firstname;

	public void enter_firstname() {
		firstname.sendKeys(prop.getProperty("firstname"));
		log.debug("user entered first name");
	}

	@FindBy(xpath = "//div[@class='control']/descendant::input[@id='lastname']")
	@CacheLookup
	WebElement lastname;

	public void enter_lastname() {
		lastname.sendKeys(prop.getProperty("lastname"));
		log.debug("user entered last name");
	}

	@FindBy(xpath = "//div[@class='control']/descendant::input[@id='email_address']")
	@CacheLookup
	WebElement email;

	public void enter_email() {
		email.sendKeys(prop.getProperty("email"));
		log.debug("user entered email");
	}

	@FindBy(xpath = "//div[@class='control']/descendant::input[@id='password']")
	@CacheLookup
	WebElement password;

	public void enter_password() {
		password.sendKeys(prop.getProperty("password"));
		log.debug("user entered password");
	}

	@FindBy(xpath = "//div[@class='control']/descendant::input[@id='password-confirmation']")
	WebElement confirmpass;

	public void enter_confirmpass() {
		confirmpass.sendKeys(prop.getProperty("retypepassword"));
		log.debug("user entered confirm password");
	}

	@FindBy(xpath = "//div[@class='primary']/descendant::button/span[text()='Create an Account']")
	@CacheLookup
	WebElement createbtn;

	public void click_create_button() {
		createbtn.click();
		log.debug("user clicked on create an account button");
	}

	@FindBy(xpath = "//div[@class='messages']/descendant::div[contains(text(),'There is already')]")
	@CacheLookup
	WebElement errormessage;

	public WebElement user_exist() {
		String errortxt = errormessage.getText();
		System.out.println("Error text is "+errortxt);
		log.debug("user already existing");
		return errormessage;

	}

	@FindBy(xpath = "//div[@class='messages']/descendant::div[contains(text(),'Thank you for registering')]")
	@CacheLookup
	WebElement successmessage;

	public WebElement new_user_created() {
		String successtxt = successmessage.getText();
		System.out.println("successText is "+successtxt);
		log.debug("new user created");
		return successmessage;
	}

}
