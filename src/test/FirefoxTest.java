package test;

import org.testng.annotations.Test;
import framework.Firefox;

public class FirefoxTest {
	
  @Test
  public void Firefox() {
	Firefox testFirefox = new Firefox();
	testFirefox.LoginGmail();
	testFirefox.searchInboxGmail();
	testFirefox.verifySubject();
	testFirefox.gmailLogout();
  }
}
