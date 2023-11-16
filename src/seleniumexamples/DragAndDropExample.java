package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://jqueryui.com/resources/demos/droppable/default.html";
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
		Thread.sleep(1000);
		WebElement result = driver.findElement(By.xpath("//div[@id='droppable']/p"));

		if (result.isDisplayed() && result.getText().equalsIgnoreCase("Dropped!")) {
			System.out.println("Pass.");
		} else {
			System.out.println("Fail.");
		}

		driver.quit();
	}
}
