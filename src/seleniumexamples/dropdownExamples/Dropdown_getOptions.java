package seleniumexamples.dropdownExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_getOptions {
	
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.switchTo().frame("iframeResult");

		WebElement cars = driver.findElement(By.id("cars"));
		Select select = new Select(cars);
		
		List<WebElement> allOptions = select.getOptions();
		
		for(int i = 0; i < allOptions.size(); i++) {
			System.out.println(allOptions.get(i).getText());
		}
		
		driver.quit();
	}
}
