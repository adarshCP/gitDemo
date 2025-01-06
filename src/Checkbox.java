import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement chkBox=driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));
		chkBox.click();
		Assert.assertTrue(chkBox.isSelected());
		System.out.println(chkBox.isSelected());
		Thread.sleep(3000);
		driver.quit();
	}

}