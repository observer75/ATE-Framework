package test;

import org.testng.annotations.Test;
import framework.Firefox;
import framework.Chrome;

public class RunTests {
	
  @Test(enabled = true)
  public void Firefox() {
	Firefox testFirefox = new Firefox();
	testFirefox.LoginGmail();
	//testFirefox.searchInboxGmail();
	//testFirefox.verifySubject();
	testFirefox.searchMessageGmail();
	//testFirefox.gmailLogout();
  }
  
  @Test
  public void Chrome() {
		Chrome testChrome = new Chrome();
		testChrome.LoginGmail();
		//testFirefox.searchInboxGmail();
		//testFirefox.verifySubject();
		testChrome.searchMessageGmail();
		//testFirefox.gmailLogout();
	}
}
