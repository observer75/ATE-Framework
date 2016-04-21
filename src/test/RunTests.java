package test;

import org.testng.annotations.Test;
import framework.Firefox;
import framework.Chrome;
import framework.IE;

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
  
  @Test
  public void IE() {
		IE testIE = new IE();
		testIE.LoginGmail();
		//testFirefox.searchInboxGmail();
		//testFirefox.verifySubject();
		testIE.searchMessageGmail();
		//testFirefox.gmailLogout();
	}
}
