package test;

import org.testng.annotations.Test;
import framework.Firefox;
import framework.Chrome;
import framework.IE;
import framework.WebDriverFactory;

public class RunTests {
	
  @Test(enabled = false)
  public void Firefox() {
	Firefox testFirefox = new Firefox();
	testFirefox.LoginGmail();
	//testFirefox.searchInboxGmail();
	//testFirefox.verifySubject();
	testFirefox.searchMessageGmail();
	//testFirefox.gmailLogout();
  }
  
  @Test (enabled = false)
  public void Chrome() {
		Chrome testChrome = new Chrome();
		testChrome.LoginGmail();
		//testFirefox.searchInboxGmail();
		//testFirefox.verifySubject();
		testChrome.searchMessageGmail();
		//testFirefox.gmailLogout();
	}
  
  @Test (enabled = true)
  public void IE() {
	  
	  	WebDriverFactory testIE = new WebDriverFactory();
	  	try {
			testIE.getInstance("IE");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  	testIE.LoginGmail();
		//testFirefox.searchInboxGmail();
		//testFirefox.verifySubject();
		//testIE.searchMessageGmail();
	}
  
   
}
