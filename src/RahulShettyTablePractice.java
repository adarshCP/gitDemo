import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShettyTablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// No of Rows 
		List <WebElement> tableRows=driver.findElements(By.cssSelector("table[name='courses'] tr"));
		
		System.out.println(tableRows.size());	
		
		// No of Columns
		List <WebElement> tableHeader= driver.findElements(By.cssSelector("table[name='courses'] tr th"));
		
		System.out.println(tableHeader.size());	
		
		//Print Row 3
		List <WebElement> row3Values=driver.findElements(By.cssSelector("table[name='courses'] tr:nth-child(3) td"));
		
		for (int i=0;i<row3Values.size();i++){
			System.out.println(row3Values.get(i).getText());
			
		}
		
		
	}

}
