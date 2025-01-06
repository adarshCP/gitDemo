package rahulshettystreampractice;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterItemsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys("Mango");

		List<WebElement> veg = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<WebElement> filteredVegList =veg.stream().filter(s->s.getText().contains("Mango")).collect(Collectors.toList());
		
		Assert.assertEquals(veg.size(), filteredVegList.size());

	}

}
