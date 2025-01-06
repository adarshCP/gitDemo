import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RahulShettyAutoCompletDropdownAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement autoCompleteInputField =driver.findElement(By.cssSelector("#autocomplete"));
		autoCompleteInputField.sendKeys("Ind");
		Thread.sleep(5000);
		WebElement autoCompleteOption= driver.findElement( By.xpath("//li/div[text()='India']"));
		String autoCompleteOptionText =autoCompleteOption.getText();
		autoCompleteOption.click();
		Thread.sleep(2000);
		String autoCompleteInputFieldText= autoCompleteInputField.getAttribute("value");
		Assert.assertEquals(autoCompleteInputFieldText,autoCompleteOptionText);
		System.out.println(autoCompleteInputFieldText);
	}

}
