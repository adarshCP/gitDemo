import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RahulShettyAcademyCalenderUIPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		String year="2030";
		String month="12";
		String day="24";
		String[] expectedList= {month,day,year};
		
		driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).click();
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.xpath("//button[@class='react-calendar__tile react-calendar__year-view__months__month']")).get(Integer.parseInt(month)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+day+"']")).click();
		
		List<WebElement>actualList=driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		System.out.println(actualList);
		for(int i=0;i<actualList.size();i++) {
			
			System.out.println(actualList.get(i).getAttribute("value"));
			Assert.assertEquals(expectedList[i], actualList.get(i).getAttribute("value"));
		}
	
	}

}
