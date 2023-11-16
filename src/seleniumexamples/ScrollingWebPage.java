package seleniumexamples;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingWebPage {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://www.Amazon.com";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 2000)");

		driver.quit();
	}
}
