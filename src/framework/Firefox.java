package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.*;

public class Firefox{
	
	String baseUrlGmail = "https://mail.google.com";
	String baseUrlUkrNet = "https://mail.ukr.net";
	
	WebDriver driverFirefox = new FirefoxDriver();
	
	WebDriverWait wait = new WebDriverWait(driverFirefox, 20);
	
	// ============= UKr.net ===================
	public void LoginUkrNet(){
		
		driverFirefox.get(baseUrlUkrNet);
		driverFirefox.findElement(By.id("login")).sendKeys("ate569@ukr.net");
		driverFirefox.findElement(By.id("password")).sendKeys("US!pf.avg");
		driverFirefox.findElement(By.xpath(".//*[@id='login-form']/div[3]/button")).click();
	}
	
	public void searchMessageUkrNet(){
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='msglist']/div[1]/div[1]/span[2]")));
		driverFirefox.findElement(By.xpath(".//*[@id='msglist']/div[1]/div[1]/span[2]")).sendKeys("Maven");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[8]/div/div/section[4]/a")));
		driverFirefox.findElement(By.xpath("html/body/div[8]/div/div/section[4]/a")).click();
	}
	
	//======================== Gmail.com =================================
	
	public void LoginGmail(){
		  
		  driverFirefox.get(baseUrlGmail);
		  driverFirefox.findElement(By.id("Email")).sendKeys("iocmarus@gmail.com");
		  driverFirefox.findElement(By.id("next")).click();
		  
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Passwd")));

		  driverFirefox.findElement(By.id("Passwd")).sendKeys("US!pf.avg");
		  driverFirefox.findElement(By.id("signIn")).click();
		  //driverFirefox.findElement(By.id("submit")).click();
		
	  }
	
	// This function does not work correctly. Please do not use it!
	// TODO: create a bug
	public void searchMessageGmail(){
		  
		  //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gbqfq")));
		  
		  driverFirefox.findElement(By.id("gbqfq")).sendKeys("maven");
		  driverFirefox.findElement(By.id("gbqfb")).click();
		  Assert.assertEquals(driverFirefox.getPageSource().contains("Maven"), true);
		  //driverFirefox.findElement(By.xpath(".//*[@id=':4c']/div/div/div[2]/span[2]")).click();
	}
	
	public void searchInboxGmail(){
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":4o")));
		driverFirefox.findElement(By.id(":4o")).click();
	}
	
	public void verifySubject(){
		Assert.assertEquals(driverFirefox.getPageSource().contains("Fwd: Lesson TestNG (PDF)"), true);
	}
	
	public void gmailLogout(){
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")));
		driverFirefox.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		driverFirefox.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
	}

}