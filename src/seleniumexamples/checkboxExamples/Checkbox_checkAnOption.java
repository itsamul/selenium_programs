package seleniumexamples.checkboxExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_checkAnOption {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://www.w3schools.com/howto/tryit.asp?filename=tryhow_js_display_checkbox_text";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.switchTo().frame("iframeResult");
		WebElement checkboxOption = driver.findElement(By.id("myCheck"));
		checkboxOption.click();
		Thread.sleep(1000);
		WebElement result = driver.findElement(By.id("text"));

		if (result.getText().equals("Checkbox is CHECKED!")) {
			System.out.println(result.getText());
			System.out.println("Pass.");
		} else {
			System.out.println("Fail.");
		}

		driver.quit();
	}
}
