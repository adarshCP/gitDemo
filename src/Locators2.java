import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray = passwordText.split("'");
		String passwordText2=passwordArray[1];
		String[] passwordArray2= passwordText2.split("'");
		String password = passwordArray2[0];
		return password ;
		
	}

	public static void main(String[] args) throws InterruptedException {
		String name ="Adarsh";
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String password =getPassword(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password
				+ "");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();
		Thread.sleep(1000);
		String sucessText = driver.findElement(By.tagName("p")).getText();
		String welcomeText =driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText();
		Assert.assertEquals(sucessText, "You are successfully logged in.");
		Assert.assertEquals(welcomeText, "Hello " + name + ",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();

	}

	
}
