package seleniumexamples.dropdownExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_isMultiple {
	
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.switchTo().frame("iframeResult");

		WebElement cars = driver.findElement(By.id("cars"));
		Select select = new Select(cars);
		boolean status = select.isMultiple();
		System.out.println("Is Multiple : " + status);
		
		driver.quit();
	}
}
