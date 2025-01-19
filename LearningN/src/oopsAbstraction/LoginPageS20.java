package oopsAbstraction;

public class LoginPageS20 extends PageS20{
	
	int timeOut = 5;
	
	public LoginPageS20() {
		super(10);
		System.out.println("LoginPageS20 -- default constructor");
	}

	@Override
	public void title() {
		//if you want to access parent methods, you need to use
		//super keyword
		System.out.println("LoginPageS20 -- title");
	}

	@Override
	public void url() {
		//if you want to access parent methods, you need to use
		//super keyword
		System.out.println("LoginPageS20 -- url");
	}
	
	@Override
	public void pageLoadTimeout() {
		//if you want to access parent methods, you need to use
		//super keyword
		System.out.println("LoginPageS20 -- pageLoadTimeout = 5 sec");
	}
	
	//LoginPageS20 individual methods
	public void forgotPassword() {
		System.out.println("LoginPageS20 -- forgotPassword");
	}

	public void doLogin(String username, String password) {
		System.out.println("LoginPageS20 -- doLogin: " + 
	                       username + " " + password);
	}
	
	
	
	
	
	
}
