import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RahulShettyAcademyWindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Adarsh\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a[href='https://rahulshettyacademy.com/documents-request']")).click();
		Set <String> windows =driver.getWindowHandles();
		Iterator<String> it =windows.iterator();
		String firstWindow =it.next() ;
		String secWindow =it.next() ;
		driver.switchTo().window(secWindow);
		String para =driver.findElement(By.cssSelector(".im-para.red")).getText();
		System.out.println(para);
		String email =para.split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(firstWindow);
		driver.findElement(By.cssSelector("#username")).sendKeys(email);
		
	}

}
