import framework.Firefox;;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Framework started!!!");
		
		Firefox browser = new Firefox();
		
		browser.Login();
		browser.searchMessage();
		
		System.out.println("Framework finished.");
	}

}
