package seleniumexamples.alertsExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts_sendText {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//button[text()='Try it']"));
		button.click();
		Alert alert = driver.switchTo().alert();
		String sendAlertText = "Automation tester";
		alert.sendKeys(sendAlertText);
		alert.accept();
		Thread.sleep(2000);
		WebElement result = driver.findElement(By.xpath("//p[@id='demo']"));		
		if(result.getText().equals("Hello " + sendAlertText + "! How are you today?")) {
			System.out.println(result.getText());
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		driver.quit();
		
	}
}
