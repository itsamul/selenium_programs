package seleniumexamples.dropdownExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_getallselectedoption {

	public static void main(String[] args) throws InterruptedException {
	
		String url = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.switchTo().frame("iframeResult");
		WebElement cars = driver.findElement(By.id("cars"));
		Select select = new Select(cars);
		select.selectByValue("saab");
		select.selectByVisibleText("Audi");
		Thread.sleep(2000);
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		for (WebElement selectedOption : selectedOptions) {
			System.out.println(selectedOption.getText());
		}

		driver.quit();
	}
}
