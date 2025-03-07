package webDriver_Arch;

public interface WebDriver {
	
	public void get(String url);
	
	public String getTitle();
	
	public void findElement(String element);
	
	public void click(String element);
	
	public void sendKeys(String element, String value);
	
	public void quit();

}
