package seleniumexamples.checkboxExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_unCheckAnOption {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_checked";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.switchTo().frame("iframeResult");
		WebElement checkboxOption = driver.findElement(By.name("vehicle3"));
		Thread.sleep(1000);
		boolean status = checkboxOption.isSelected();
		System.out.println("Value selected : " + checkboxOption.getAttribute("value"));
		checkboxOption.click();

		status = checkboxOption.isSelected();
		if (!status) {
			System.out.println("Value un-Checked : " + checkboxOption.getAttribute("value"));
			System.out.println("Pass.");
		} else {
			System.out.println("Fail.");
		}

		driver.quit();
	}
}
