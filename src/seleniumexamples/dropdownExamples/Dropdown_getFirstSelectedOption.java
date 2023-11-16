package seleniumexamples.dropdownExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_getFirstSelectedOption {
	
	public static void main(String[] args) throws InterruptedException {
	
		String url = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.switchTo().frame("iframeResult");
		WebElement cars = driver.findElement(By.id("cars"));
		Select select = new Select(cars);
		select.selectByValue("opel")	;
		Thread.sleep(2000);
		String firstSelectedOption = select.getFirstSelectedOption().getText();
		System.out.println("First Selected Option : " + firstSelectedOption);

		driver.quit();
	}
}
