package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickExample {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick";
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//button"));
		Actions action = new Actions(driver);
		action.doubleClick(button).build().perform();
		WebElement result = driver.findElement(By.id("demo"));

		if (result.isDisplayed()) {
			System.out.println("Pass.");
		} else {
			System.out.println("Fail.");
		}

		driver.quit();
	}
}
