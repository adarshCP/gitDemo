import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Selenium4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//above
		WebElement nameField= driver.findElement(By.xpath("//div[@class='form-group'] /input[@name='name']"));
		String nameText =driver.findElement(with(By.tagName("label")).above(nameField)).getText();
		System.out.println(nameText);
		
		//below
		WebElement dobText=driver.findElement(By.xpath("//label[@for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dobText)).click();
		
		//left 
		WebElement iceCreamText=driver.findElement(By.xpath("//label[@for='exampleCheck1']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamText)).click();
		
		//Right 
		WebElement radioBtn1=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		String radioBtn1Text=driver.findElement(with(By.tagName("label")).toRightOf(radioBtn1)).getText();
		System.out.println(radioBtn1Text);
	}
	
}
