package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://www.w3schools.com/howto/tryit.asp?filename=tryhow_js_autocomplete";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);

		WebElement inputBox = driver.findElement(By.id("myInput"));
		inputBox.sendKeys("i");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
		submitButton.click();
		Thread.sleep(1000);
		WebElement result = driver.findElement(By.xpath("//div[contains(@class,'w3-container')]"));

		if (result.getText().contains("India")) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}

		driver.quit();
	}
}
