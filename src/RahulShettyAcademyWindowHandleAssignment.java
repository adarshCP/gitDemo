import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShettyAcademyWindowHandleAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Adarsh\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/windows']")).click();
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it =windows.iterator();
		String firstTab = it.next();
		String secTab = it.next();
		driver.switchTo().window(secTab);
		String secTabText=driver.findElement(By.cssSelector("h3")).getText();
		System.out.println(secTabText);
		driver.switchTo().window(firstTab);
		String firstTabText=driver.findElement(By.cssSelector("h3")).getText();
		System.out.println(firstTabText);
	}

}
