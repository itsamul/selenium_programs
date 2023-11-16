package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverExample {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_display_element_hover";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.switchTo().frame("iframeResult");

		WebElement target = driver.findElement(By.xpath("//div[@class='myDIV']"));
		Actions action = new Actions(driver);
		action.moveToElement(target).build().perform();
		Thread.sleep(3000);
		WebElement result = driver.findElement(By.xpath("//div[@class='hide']"));

		if (result.isDisplayed()) {
			System.out.println("Pass.");
		} else {
			System.out.println("Fail.");
		}

		driver.quit();
	}
}
