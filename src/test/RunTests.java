package test;

import org.testng.annotations.Test;

import com.sun.org.apache.xml.internal.security.Init;

import framework.Driver;
import framework.WebDriverFactory;

public class RunTests {
	
  @Test(enabled = true)
  public void Firefox() {
	Init init = new Init();
	init.init();
	Driver Firefox = new Driver(null, null, null, null, null);
	Firefox.LoginGmail();
	//testFirefox.searchInboxGmail();
	//testFirefox.verifySubject();
	Firefox.searchMessageGmail();
	//testFirefox.gmailLogout();
  }
  
  @Test (enabled = false)
  public void Chrome() {
		Driver Chrome = new Driver();
		Chrome.LoginGmail();
		//testFirefox.searchInboxGmail();
		//testFirefox.verifySubject();
		Chrome.searchMessageGmail();
		//testFirefox.gmailLogout();
	}
  
  @Test (enabled = false)
  public void IE() {
	  
	  	WebDriverFactory testIE = new WebDriverFactory();
	  	try {
			testIE.getInstance("IE");
			//testIE.LoginGmail();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  	//testIE.LoginGmail();
		//testFirefox.searchInboxGmail();
		//testFirefox.verifySubject();
		//testIE.searchMessageGmail();
	}
  
   
}
