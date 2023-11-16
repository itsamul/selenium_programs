package seleniumexamples.framesExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesUsingIndex {
	
	public static void main(String[] args) {
		
		String url = "https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width";
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.switchTo().frame("iframeResult");
		String text = driver.findElement(By.xpath("//h2")).getText();
		if (text.equalsIgnoreCase("HTML Iframes")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		driver.quit();
	}
}
