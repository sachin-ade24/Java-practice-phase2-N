package webDriver_Arch;

public class AmazonTest {
	
	static WebDriver driver;

	public static void main(String[] args) {

		//1) without top casting
		//chrome/firefox/edge:
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//EdgeDriver driver = new EdgeDriver();
		
		
		//2) with top casting
		String browser = "chrome";
		
		//throws the NullPointerException for wrong browsers e.g. ie, 
		//opera
		
		switch (browser.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();//top casting
			break;
        
		case "firefox":
			driver = new FirefoxDriver();//top casting
			break;	
			
		case "edge":
			driver = new EdgeDriver();//top casting
			break;	
			
		default:
			System.out.println("please pass the right browser..");
			break;
		}
		
		//this way we are calling the default constructor of ChromeDriver
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("page title is: " + title);
		
		driver.findElement("emailId");
		driver.findElement("password");
		driver.findElement("login button");
		
		driver.sendKeys("emailId", "abc@def.com");
		driver.sendKeys("password", "admin123");
		driver.click("login button");
		
		driver.quit();
		
	}

}
