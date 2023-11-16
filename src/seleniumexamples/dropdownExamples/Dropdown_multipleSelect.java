package seleniumexamples.dropdownExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_multipleSelect {
	
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.switchTo().frame("iframeResult");

		WebElement cars = driver.findElement(By.id("cars"));
		Select select = new Select(cars);
		select.selectByIndex(1)	;
		select.selectByValue("opel");
		select.selectByVisibleText("Audi");
		Thread.sleep(2000);

		WebElement submit = driver.findElement(By.xpath("//input[@value='Submit']"));
		submit.click();
		Thread.sleep(2000);
		
		WebElement result = driver.findElement(By.xpath("//div[contains(@class,'w3-container')]"));
		if (result.getText().contains("saab") && result.getText().contains("opel") && result.getText().contains("audi")) {
			System.out.println("Pass.");
		} else {
			System.out.println("Failed");
		}

		driver.switchTo().defaultContent();

		driver.quit();
	}
}
