package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.LoginPage;
import pages.ResgistrationPage;

public class Base {

	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;
	public LoginPage log_in;
	public HomePage home;
	public ResgistrationPage registration;
	DesiredCapabilities capabilities;

	public WebDriver SetupDriver() throws IOException {

		prop = new Properties();

		FileInputStream fis = new FileInputStream("src/test/resources/utils/data.properties");
		prop.load(fis);
		log = LogManager.getLogger(Base.class.getName());
		String browser = "chrome";

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			capabilities = new DesiredCapabilities();
			capabilities.setCapability("Browser Name", "Google Chrome");
			capabilities.setCapability("Browser Version", "108.0.5359.125");
			capabilities.setCapability("Platform Name", "Windows 10");

		}

		if (browser.equalsIgnoreCase("fire fox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			capabilities = new DesiredCapabilities();
			capabilities.setCapability("Browser Name", "Fire Fox");
			capabilities.setCapability("Browser Version", " 107.0.1");
			capabilities.setCapability("Platform Name", "Windows 10");
		}
//		if (browser.equalsIgnoreCase(browser)) {
//			WebDriverManager.safaridriver().setup();
//			driver = new SafariDriver();
//		}
//		if (browser.equalsIgnoreCase(browser)) {
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//		}

		driver.manage().window().maximize();
		return driver;

	}

	public void random() {
		Random random = new Random();
		random.nextInt();
		random.nextInt();
	}

}
