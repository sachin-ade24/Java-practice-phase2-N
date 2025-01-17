package JavaSessions;

import java.util.Scanner;

public class WebDriver_S12 {
	
	public boolean launchBrowser(String browser) {
		
		boolean flag = false;
		
		switch(browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Chrome is launched.");
			flag = true;
			break;
		case "firefox":
			System.out.println("Firefox is launched.");
			flag = true;
			break;
		case "edge":
			System.out.println("Edge is launched.");
			flag = true;
			break;
		case "safari":
			System.out.println("Safari is launched.");
			flag = true;
			break;
		default:
			System.out.println("Please pass the right browser.");
			break;
		}
		
		return flag;
	}
	
	public boolean isLaunched(String browser) {
		return launchBrowser(browser);
	}
	
	public void enterUrlInTheBrowser(String browser) {
		if(isLaunched(browser)) {
			System.out.println("Enter the URL...");
		} else {
			System.err.println("Invalid browser...");
		}
	}

	public static void main(String[] args) {
		
		WebDriver_S12 driver = new WebDriver_S12();
		//driver.launchBrowser("Chrome");
		
		//if(driver.isLaunched("Opera")) {
		//	System.out.println("Enter the URL.");
		//} else {
		//	System.err.println("Invalid browser...");
		//}
		
		//driver.launchedBrowser("Chrome");//valid
		//driver.enterUrlInTheBrowser("Opera");//valid
		
		Scanner scn = new Scanner(System.in);
		
		String browserName = scn.nextLine();
		
		driver.enterUrlInTheBrowser(browserName);
		
		scn.close();

	}

}
