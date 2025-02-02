import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4WindowHandles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> it = windows.iterator();
		String parentWindow =it.next();
		String childWindow =it.next();
		driver.switchTo().window(childWindow);
		driver.get("https://rahulshettyacademy.com/");
		String courseName =driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/get-access-to-all-courses']")).get(1).getText();
		
		driver.switchTo().window(parentWindow);
		WebElement nameField=driver.findElement(By.xpath("//div [@class='form-group']/input[@name='name']"));
		nameField.sendKeys(courseName);
		
		// Capture Screenshot of the Element
		File newFile =nameField.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(newFile, new File("Test.png"));
		
		//Get Height and Width of the Element
		System.out.println(nameField.getRect().getDimension().getWidth());
		System.out.println(nameField.getRect().getDimension().getHeight());
	}
	}


