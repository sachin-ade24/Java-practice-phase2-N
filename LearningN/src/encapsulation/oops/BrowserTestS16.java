package encapsulation.oops;

public class BrowserTestS16 {

	public static void main(String[] args) {

		BrowserS16 br = new BrowserS16();
		
		//For user launching the browser is the important thing,
		//so, user will only care about launching the browser
		//In this case, we are unnecessarily keeping all the 
		//other methods in the 'BrowserS16' class as 'public' methods

		br.launchBrowser();
		
	}

}
