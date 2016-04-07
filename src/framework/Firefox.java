package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.*;

public class Firefox{
	
	String baseUrlF = "https://mail.google.com";
	
	WebDriver driverFirefox = new FirefoxDriver();
	
	//WebDriverWait waitForPassword = new WebDriverWait(driverFirefox, 30);
	WebDriverWait wait = new WebDriverWait(driverFirefox, 20);
	
	public void Login(){
		  
		  driverFirefox.get(baseUrlF);
		  
		  WebElement login = driverFirefox.findElement(By.id("Email"));
		  login.sendKeys("iocmarus@gmail.com");
		  
		  WebElement next = driverFirefox.findElement(By.id("next"));
		  next.click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Passwd")));

		  WebElement passwd = driverFirefox.findElement(By.id("Passwd"));
		  passwd.sendKeys("US!pf.avg");
		  
		  WebElement signIn = driverFirefox.findElement(By.id("signIn"));
		  signIn.click();
	  }
	
	public void searchMessage(){
		
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gbqfq")));
		  
		  WebElement search = driverFirefox.findElement(By.id("gbqfq"));
		  search.sendKeys("maven");
		  
		  WebElement searchButton = driverFirefox.findElement(By.id("gbqfb"));
		  searchButton.click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":ev")));
		  
		  WebElement message = driverFirefox.findElement(By.id(":ev"));
		  message.click();
	}
}
