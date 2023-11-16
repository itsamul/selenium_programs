package seleniumexamples.basicCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrlCommand {
	
	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("selenium");
		WebElement btnOk = driver.findElement(By.name("btnK"));
		btnOk.click();
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url : " + currentUrl);
		
		driver.quit();
	}

}
