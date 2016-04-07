package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import javax.mail.search.SubjectTerm;


public class Firefox{
	
	String baseUrl = "https://mail.google.com";
	
	WebDriver driverFirefox = new FirefoxDriver();
	
	WebDriverWait wait = new WebDriverWait(driverFirefox, 20);
	
	public void Login(){
		  
		  driverFirefox.get(baseUrl);
		  
		  driverFirefox.findElement(By.id("Email")).sendKeys("iocmarus@gmail.com");
		  driverFirefox.findElement(By.id("next")).click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Passwd")));

		  driverFirefox.findElement(By.id("Passwd")).sendKeys("US!pf.avg");
		  driverFirefox.findElement(By.id("signIn")).click();
	  }
	
	public void searchMessage(){
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gbqfq")));
		  
		  driverFirefox.findElement(By.id("gbqfq")).sendKeys("maven");
		  driverFirefox.findElement(By.id("gbqfb")).click();
		  driverFirefox.findElement(By.id(":ex")).click();
	}
}
