package seleniumexamples.alertsExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts_dismiss {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm3";
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//button[text()='Try it']"));
		button.click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		Thread.sleep(2000);
		WebElement result = driver.findElement(By.xpath("//p[@id='demo']"));

		if (result.getText().equals("You canceled!")) {
			System.out.println(result.getText());
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		driver.quit();
	}
}