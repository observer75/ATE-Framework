package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Init {
	
	public Init(String baseUrlGmail, String baseUrlUkrNet, String loginGmail, WebDriver driver, WebDriverWait wait) {
		super();
		this.baseUrlGmail = baseUrlGmail;
		this.baseUrlUkrNet = baseUrlUkrNet;
		this.loginGmail = loginGmail;
		this.driver = driver;
		this.wait = wait;
	}


	public String baseUrlGmail = "https://mail.google.com";
	public String baseUrlUkrNet = "https://mail.ukr.net";
	public String loginGmail = "iocmarus@gmail.com";
	public static final String passwordGmail = "US!pf.avg";
	
	public static final String IE = "IE";
	public static final String FIREFOX = "firefox";
	public static final String CHROME = "chrome";
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	
public WebDriver getInstance(String browser) throws Exception {
		
		if (driver == null) {
			if (CHROME.equals(browser)){
				//setChromeDriver();
				driver = new ChromeDriver();
			} else if (FIREFOX.equals(browser)) {
				driver = new FirefoxDriver();
			} else if (IE.equals(browser)){
				driver = new InternetExplorerDriver();
			}
		}
		
		return driver;
	}
}
