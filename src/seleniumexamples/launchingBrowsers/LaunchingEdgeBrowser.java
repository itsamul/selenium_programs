package seleniumexamples.launchingBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingEdgeBrowser {
	
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		
		driver.quit();
	}
}
