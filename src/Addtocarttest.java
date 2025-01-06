import java.time.Duration;
import java.util.Arrays;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Addtocarttest {

	public static void addItems(WebDriver driver, String[] itemsList) {
		List itemsListConverted = Arrays.asList(itemsList);

		List<WebElement> productNames = driver.findElements(By.xpath("//h4[@class='product-name']"));
		int j = 0;
		for (int i = 0; i < productNames.size(); i++) {
			String[] productName = productNames.get(i).getText().split("-");
			String productNameFormatted = productName[0].trim();

			if (itemsListConverted.contains(productNameFormatted)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsListConverted.size()) {
					break;
				}
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Adarsh\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		String[] itemsList = { "Brocolli", "Mushroom", "Cauliflower", "Orange" };
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		addItems(driver, itemsList);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		webdwait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("input.promoCode"))));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		webdwait.until(ExpectedConditions.invisibilityOfElementLocated((By.cssSelector("button.promoBtn"))));
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());	
		}

}
