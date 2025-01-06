import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RahulShettyAcademyActionsPractice {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Adarsh\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		WebElement menu =driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		WebElement searchBar=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Actions a =new Actions(driver);
		a.moveToElement(searchBar).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();
		a.moveToElement(menu).contextClick().build().perform();
		
	}

}
