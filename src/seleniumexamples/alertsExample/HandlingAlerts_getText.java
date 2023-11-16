package seleniumexamples.alertsExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts_getText {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//button[text()='Try it']"));
		button.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();

		if (alertText.equals("I am an alert box!")) {
			System.out.println(alertText);
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		driver.quit();
	}
}
