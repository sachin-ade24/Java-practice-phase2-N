package encapsulation.oops;

public class LoginPageS16 {
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password.length()>=10) {
			this.password = password;
		} else {
			System.out.println("Please supply the valid password...");
		}
	}
	
	

}
