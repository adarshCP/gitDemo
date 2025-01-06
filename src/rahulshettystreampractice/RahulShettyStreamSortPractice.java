package rahulshettystreampractice;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RahulShettyStreamSortPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		List<WebElement> tableList = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String> originaltableListValues=tableList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		
		List<String> sortedListValues =originaltableListValues.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originaltableListValues.equals(sortedListValues));
		List<String> price;
		do{
			List<WebElement> tableList1 = driver.findElements(By.xpath("//tr/td[1]"));
			price = tableList1.stream().filter(s->s.getText().contains("Pineapple")).map(s->getPriceOfVeg(s)).collect(Collectors.toList());
			price.forEach(a->System.out.println(a));
			
			if (price.size()<1) {
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			}
		}while(price.size()<1);
		
	}

	private static String getPriceOfVeg(WebElement s) {
		// TODO Auto-generated method stub
		String priceValue =s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
