package webDriver_Arch;

public class ChromeDriver implements WebDriver{
	
	public ChromeDriver() {
		System.out.println("Launch chrome browser...");
	}

	@Override
	public void get(String url) {
		System.out.println("entering URL: " + url);
	}

	@Override
	public String getTitle() {
		return "Amazon";
	}

	@Override
	public void findElement(String element) {
		System.out.println("found the element: " + element);
	}

	@Override
	public void click(String element) {
		System.out.println("clicking on the element: " + element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("entering the value: " + value + " into " + element );
	}

	@Override
	public void quit() {
		System.out.println("close the entire browser");
	}

}
