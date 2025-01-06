import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumIntro {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://www.selenium.dev/downloads/");
//		System.out.println(driver.getCurrentUrl());
//		driver.close();
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Adarsh\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.selenium.dev/downloads/");
//		System.out.println(driver.getCurrentUrl());
//		driver.close();
		
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\Adarsh\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.findElement(By.cssSelector("div[class='overlay-panel overlay-right']" )).getText());	
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Adarsh");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("testerkent13@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("6321321212121 ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Hello");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
	} 
}	