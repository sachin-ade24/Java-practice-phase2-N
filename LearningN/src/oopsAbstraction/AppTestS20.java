package oopsAbstraction;

public class AppTestS20 {

	public static void main(String[] args) {

		LoginPageS20 lp = new LoginPageS20();
		lp.title();
		lp.url();
		lp.pageLoadTimeout();
		lp.logo();
		lp.doLogin("admin", "123");
		
	    System.out.println(lp.timeOut);
		
		System.out.println("============================");
		
		//PageS20 pg = new PageS20();//invalid
		//error: Cannot instantiate the type PageS20
		
		//top casting:
		//child class Object can be referred by the abstract class 
		//reference variable
		PageS20 pg = new LoginPageS20();
		pg.title();
		pg.url();
		pg.pageLoadTimeout();
		pg.logo();
		
		//
		//down casting --> not applicable
		
		
	}

}
