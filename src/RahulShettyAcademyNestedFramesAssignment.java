import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShettyAcademyNestedFramesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Adarsh\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		WebElement frameTop= driver.findElement(By.xpath("//frame[@name='frame-top']"));
		driver.switchTo().frame(frameTop);
		
		WebElement frameMiddle =driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		driver.switchTo().frame(frameMiddle);
		
		String middleText =driver.findElement(By.xpath("//div[@id='content']")).getText();
		System.out.println(middleText);
	}

}
