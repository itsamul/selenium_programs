package seleniumexamples.launchingBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingFirefoxBrowser {
	
	public static void main(String[] args) {	
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		driver.quit();
	}
}

