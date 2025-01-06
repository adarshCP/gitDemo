import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SpicejetAutoPractice {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@data-testid='round-trip-radio-button']")).click();
//		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input")).click();
//		driver.findElement(By.xpath("//div[text()='Agartala']")).click();
//		driver.findElement(By.xpath("//div[text()='Ahmedabad']")).click();
		driver.findElement(By.xpath("//div[@data-testid='one-way-radio-button']")).click();
		
		WebElement returnDateSelect = driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']"));
		if (returnDateSelect.getAttribute("style").contains("rgb(238, 238, 238)")){
			Assert.assertFalse(false);
			
		}else {
			Assert.assertFalse(true);
			
		}
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,250)", "")
//		;
//		driver.findElement(By.xpath("//div[@data-testid='undefined-month-November-2024']//div[@class='css-1dbjc4n r-1awozwy r-16ru68a r-y47klf r-1loqt21 r-eu3ka r-1otgn73 r-1aockid']")).click();
		//		WebElement chkBox=driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));
//		chkBox.click();
//		Assert.assertTrue(chkBox.isSelected());
//		System.out.println(chkBox.isSelected());
//		Thread.sleep(3000);
//		driver.quit();
	}

}
