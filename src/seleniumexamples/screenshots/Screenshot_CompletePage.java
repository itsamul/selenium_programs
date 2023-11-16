package seleniumexamples.screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_CompletePage {

	public static void main(String[] args) {
		
		String url = "https://www.w3schools.com/w3css/tryw3css_templates_cv.htm";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir")+"/src/seleniumexamples/screenshots/PageScreenshot.png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		driver.quit();
	}
}
