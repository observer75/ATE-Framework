package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.*;


public class Chrome {
	String baseUrlGmail = "https://mail.google.com";
	
	WebDriver driverChrome = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driverChrome, 20);
	
	public void LoginGmail(){
		  
		  driverChrome.get(baseUrlGmail);
		  driverChrome.findElement(By.id("Email")).sendKeys("iocmarus@gmail.com");
		  driverChrome.findElement(By.id("next")).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Passwd")));

		  driverChrome.findElement(By.id("Passwd")).sendKeys("US!pf.avg");
		  driverChrome.findElement(By.id("signIn")).click();
		  //driverChrome.findElement(By.id("submit")).click();
		
	  }
	
	// This function does not work correctly. Please do not use it!
	// TODO: create a bug
	public void searchMessageGmail(){
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gbqfq")));
		  driverChrome.findElement(By.id("gbqfq")).sendKeys("Lesson OOP");
		  driverChrome.findElement(By.id("gbqfb")).click();
		  //Assert.assertEquals(driverChrome.getPageSource().contains("Maven"), true);
		  //wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("//*[@id=\":c4\"]")));
		  //String messageID = "//*[@id=\":c4\"]"; //*[@id=":c2"]/div/div/div[2]/span[2]
		  driverChrome.findElement(By.xpath("//*[@id=\":c2\"]/div/div/div[2]/span[2]")).click();
		  //driverChrome.findElement(By.id(":bu")).click();
		  
	}
	
	public void searchInboxGmail(){
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":4o")));
		driverChrome.findElement(By.id(":4o")).click();
	}
	
	public void verifySubject(){
		Assert.assertEquals(driverChrome.getPageSource().contains("Fwd: Lesson TestNG (PDF)"), true);
	}
	
	public void gmailLogout(){
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")));
		driverChrome.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
	}

}
