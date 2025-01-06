import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RahulShettyAcademyFramesPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Adarsh\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://jqueryui.com/droppable/");
				WebElement frame=driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']"));
				driver.switchTo().frame(frame);
				Actions a = new Actions(driver);
				WebElement source =driver.findElement(By.xpath("//div[@id='draggable']"));
				WebElement target =driver.findElement(By.xpath("//div[@id='droppable']"));
				a.dragAndDrop(source, target);
				driver.switchTo().defaultContent();
				driver.findElement(By.xpath("//a[@href='/resources/demos/droppable/revert.html']")).click();				
				
	}

}
