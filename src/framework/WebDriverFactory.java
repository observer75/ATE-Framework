package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverFactory {
	
	private static final String IE = "IE";
	private static final String FIREFOX = "firefox";
	private static final String CHROME = "chrome";
	
	private static WebDriver webDriver;
	String baseUrlGmail = "https://mail.google.com";
	WebDriverWait wait = new WebDriverWait(webDriver, 20);
	
	public WebDriverFactory() {
		
	}
	
	public WebDriver getInstance(String browser) throws Exception {
		
		if (webDriver == null) {
			if (CHROME.equals(browser)){
				//setChromeDriver();
				webDriver = new ChromeDriver();
			} else if (FIREFOX.equals(browser)) {
				webDriver = new FirefoxDriver();
			} else if (IE.equals(browser)){
				webDriver = new InternetExplorerDriver();
			}
		}
		
		return webDriver;
		
	}
}
