import framework.Firefox;;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Framework started!!!");
		
		Firefox browser = new Firefox();
		
		browser.LoginUkrNet();
		//browser.LoginGmail();
		
		browser.searchMessageUkrNet();
		//browser.searchMessage();
		
		System.out.println("Framework finished.");
	}

}
