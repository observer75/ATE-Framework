package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.*;

public class IE {
	
String baseUrlGmail = "https://mail.google.com";
	
	WebDriver driverIE= new InternetExplorerDriver(); 
	WebDriverWait wait = new WebDriverWait(driverIE, 20);
	
	public void LoginGmail(){
		  
		  driverIE.get(baseUrlGmail);
		  //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Email")));
		  driverIE.findElement(By.id("Email")).sendKeys("iocmarus@gmail.com");
		  driverIE.findElement(By.id("next")).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Passwd")));

		  driverIE.findElement(By.id("Passwd")).sendKeys("US!pf.avg");
		  driverIE.findElement(By.id("signIn")).click();
		  //driverIE.findElement(By.id("submit")).click();
		
	  }
	
	// This function does not work correctly. Please do not use it!
	// TODO: create a bug
	public void searchMessageGmail(){
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gbqfq")));
		  driverIE.findElement(By.id("gbqfq")).sendKeys("Lesson OOP");
		  driverIE.findElement(By.id("gbqfb")).click();
		  //Assert.assertEquals(driverIE.getPageSource().contains("Maven"), true);
		  //wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("//*[@id=\":c4\"]")));
		  //String messageID = "//*[@id=\":c4\"]"; //*[@id=":c2"]/div/div/div[2]/span[2]
		  driverIE.findElement(By.xpath("//*[@id=\":c2\"]/div/div/div[2]/span[2]")).click();
		  //driverIE.findElement(By.id(":bu")).click();
		  
	}
	
	public void searchInboxGmail(){
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":4o")));
		driverIE.findElement(By.id(":4o")).click();
	}
	
	public void verifySubject(){
		Assert.assertEquals(driverIE.getPageSource().contains("Fwd: Lesson TestNG (PDF)"), true);
	}
	
	public void gmailLogout(){
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")));
		driverIE.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		driverIE.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
	}

}
