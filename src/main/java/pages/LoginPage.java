package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.Base;

public class LoginPage extends Base {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
		// new AjaxElementLocatorFactory(driver, 20),
	}

	@FindBy(xpath = "//div[@class='panel header']/descendant::li/following::a[contains(text(),'Sign')]")
	@CacheLookup
	WebElement signin;

	public void click_sign_in() {
		signin.click();
	}

	@FindBy(xpath = "//div[@class='control']/following::input[@name='login[username]']")
	@CacheLookup
	WebElement email;

	public void enter_email() {
		email.sendKeys(prop.getProperty("email"));
	}

	public void enter_invalid_email() {
		email.sendKeys(prop.getProperty("invaliduname"));
	}

	@FindBy(xpath = "//div[@class='control']/following::input[@id='pass']")
	@CacheLookup
	WebElement password;

	public void enter_password() {
		password.sendKeys(prop.getProperty("password"));

	}

	public void enter_invalid_password() {
		password.sendKeys(prop.getProperty("invalidpass"));
	}

	@FindBy(xpath = "//fieldset[@class='fieldset login']//button[@id='send2']")
	@CacheLookup
	WebElement signinbtn;

	public void click_Signinbtn() {
		signinbtn.click();
	}

	@FindBy(xpath = "//ul[@class='header links']/descendant::span[@class='logged-in']")
	@CacheLookup
	WebElement loginsuccesstxt;

	public void successverification() {
		String logintxtS = loginsuccesstxt.getText();
		System.out.println(logintxtS);
	}

	@FindBy(xpath = "//div[@class='messages']/descendant::div/div[contains(text(),'The account sign-in was')]")
	WebElement loginfailtxt;

	public void failedsverification() {
		String logintxtF = loginfailtxt.getText();
		System.out.println(logintxtF);
	}
	
	@FindBy(xpath = "//div[@class='page messages']/descendant::div[contains(text(),'Please wait and')]")
	WebElement loginerror;
	public void userseeloginerror() {
		String loge = loginerror.getText();
		System.out.println("login failed text :"+ loge);
		
	}

}
