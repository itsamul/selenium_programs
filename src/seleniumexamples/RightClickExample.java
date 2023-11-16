package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickExample {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_oncontextmenu";
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.switchTo().frame("iframeResult");
		WebElement element = driver.findElement(By.xpath("//div[@style='border:1px solid black;text-align:center']"));
		Actions actions = new Actions(driver);
		actions.contextClick(element).build().perform();
		Thread.sleep(2000);

		driver.quit();
	}
}
