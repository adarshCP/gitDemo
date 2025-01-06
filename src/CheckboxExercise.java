import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement checkbox1= driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		Assert.assertFalse(checkbox1.isSelected());
		checkbox1.click();
		Assert.assertTrue(checkbox1.isSelected());
		
		List <WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkBoxes.size());
	}

}
