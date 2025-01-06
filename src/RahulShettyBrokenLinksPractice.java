import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class RahulShettyBrokenLinksPractice {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links =driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert sa=new SoftAssert();
		
		for (WebElement link: links) {
			
			String url =link.getAttribute("href");
			
			HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection();
			
			connection.setRequestMethod("HEAD");
			connection.connect();
			int responseCode= connection.getResponseCode();
			System.out.println(responseCode);
			sa.assertTrue(responseCode<400, "The Link with Broken is "+link.getText()+" With the Status Code "+responseCode);
			
			
				
			}
		sa.assertAll();
			
		}
		
		
	}


