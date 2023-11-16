package seleniumexamples;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle_SwitchToNewTab {

	public static void main(String[] args) {

		String url = "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.switchTo().frame("iframeResult");

		String mainWindow = driver.getWindowHandle();
		WebElement element = driver.findElement(By.xpath("//button[text()='Try it']"));
		element.click();
		Set<String> set = driver.getWindowHandles();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String childWindow = itr.next();
			if (!mainWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println(driver.switchTo().window(childWindow).getTitle());
				if (driver.switchTo().window(childWindow).getTitle().equals("W3Schools Online Web Tutorials")) {
					System.out.println("Pass");
				} else {
					System.out.println("Fail");
				}
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);

		driver.quit();
	}
}
