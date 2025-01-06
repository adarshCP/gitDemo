package amazonpractice;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AmazonSearchPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ins/");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple iPhone 15 Pro Max");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		
		List <WebElement> productResults =driver.findElements(By.xpath("//div[@data-component-type='s-search-result']//h2"));
		for (int i=0;i<productResults.size();i++) {
			if (productResults.get(i).getText().contains("Adarsh")) {
				System.out.println("Results for Iphone are found");
				break;
			}
			
		}
		
			System.out.println("Results for Iphone are not found");
		
//		if productResults.co
//		List <WebElement> streamProductResults = productResults.stream().filter(s->s.getText().contains("Apple iPhone 15 Pro Max")).collect(Collectors.toList());
//		streamProductResults.forEach(a->System.out.println(a.getText()));
//		Assert.assertEquals(productResults.size(), streamProductResults.size());
	}

}
