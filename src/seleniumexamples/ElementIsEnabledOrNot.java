package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsEnabledOrNot {

	public static void main(String[] args) {

		String url = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_disabled";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.switchTo().frame("iframeResult");

		WebElement lastname = driver.findElement(By.id("lname"));

		if (!lastname.isEnabled()) {
			System.out.println("Lastname field is disabled : " + !lastname.isEnabled());
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		driver.quit();
	}
}
