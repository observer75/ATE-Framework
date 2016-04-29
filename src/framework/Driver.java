package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.*;

public class Driver extends Init {
	
	//WebDriver driver = new FirefoxDriver();
	
	//WebDriverWait wait = new WebDriverWait(driver, 20);
		
	public Driver(String baseUrlGmail, String baseUrlUkrNet, String loginGmail, WebDriver driver, WebDriverWait wait) {
		super(baseUrlGmail, baseUrlUkrNet, loginGmail, driver, wait);
		// TODO Auto-generated constructor stub
	}

	// ============= UKr.net ===================
	public void LoginUkrNet(){
		
		driver.get(baseUrlUkrNet);
		driver.findElement(By.id("login")).sendKeys("ate569@ukr.net");
		driver.findElement(By.id("password")).sendKeys("US!pf.avg");
		driver.findElement(By.xpath(".//*[@id='login-form']/div[3]/button")).click();
	}
	
	public void searchMessageUkrNet(){
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='msglist']/div[1]/div[1]/span[2]")));
		driver.findElement(By.xpath(".//*[@id='msglist']/div[1]/div[1]/span[2]")).sendKeys("Maven");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[8]/div/div/section[4]/a")));
		driver.findElement(By.xpath("html/body/div[8]/div/div/section[4]/a")).click();
	}
	
	//======================== Gmail.com =================================
	
	public void LoginGmail(){
		  
		  driver.get(baseUrlGmail);
		  driver.findElement(By.id("Email")).sendKeys(loginGmail);
		  driver.findElement(By.id("next")).click();
		  
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Passwd")));

		  driver.findElement(By.id("Passwd")).sendKeys(passwordGmail);
		  driver.findElement(By.id("signIn")).click();
		  //driver.findElement(By.id("submit")).click();
		
	  }
	
	// This function does not work correctly. Please do not use it!
	// TODO: create a bug
	public void searchMessageGmail(){
		  
		  driver.findElement(By.id("gbqfq")).sendKeys("Lesson OOP");
		  driver.findElement(By.id("gbqfb")).click();
		  //Assert.assertEquals(driver.getPageSource().contains("Maven"), true);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("//*[@id=\":c4\"]")));
		  String messageID = "//*[@id=\":c4\"]"; 
		  driver.findElement(By.xpath(messageID)).click();
		  //driver.findElement(By.id(":bu")).click();
		  
	}
	
	public void searchInboxGmail(){
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":4o")));
		driver.findElement(By.id(":4o")).click();
	}
	
	public void verifySubject(){
		Assert.assertEquals(driver.getPageSource().contains("Fwd: Lesson TestNG (PDF)"), true);
	}
	
	public void gmailLogout(){
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")));
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
	}

}