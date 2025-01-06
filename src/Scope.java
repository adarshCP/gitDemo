import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement footerDriver=driver.findElement(By.xpath("//div[@class='navLeftFooter nav-sprite-v1']"));
		int linkCount =footerDriver.findElements(By.tagName("a")).size();
		System.out.println(linkCount);
		WebElement footerFirstCol=footerDriver.findElement(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'][1]"));
		int linkCountFooterFirstColumn=footerFirstCol.findElements(By.tagName("a")).size();
		System.out.println(linkCountFooterFirstColumn);
		
		for(int i=0;i<linkCountFooterFirstColumn;i++) {
			String clickLink= Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerFirstCol.findElements(By.tagName("a")).get(i).sendKeys(clickLink);
			Thread.sleep(5000);
		}
		
	 Set<String> windowsOpened=driver.getWindowHandles();
	 Iterator<String> it =windowsOpened.iterator();
	 
	 while(it.hasNext()) {
		 driver.switchTo().window(it.next());
		 System.out.println(driver.getTitle());
		 
	 }
	}

}
