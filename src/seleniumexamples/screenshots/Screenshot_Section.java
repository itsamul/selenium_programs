package seleniumexamples.screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Section {
	
	public static void main(String[] args) {
		
		String url = "https://www.w3schools.com/w3css/tryw3css_templates_cv.htm";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		WebElement section = driver.findElement(By.xpath("//div[@class='w3-container']"));
		File src = section.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir")+"/src/seleniumexamples/screenshots/SectionScreenshot.png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		driver.quit();
	}
}
