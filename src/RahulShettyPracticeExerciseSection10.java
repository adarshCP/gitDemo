import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RahulShettyPracticeExerciseSection10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Select Check box
		WebElement chkBoxAOptionSelect= driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
		chkBoxAOptionSelect.click();
		String chkBoxOptionSelectedText = driver.findElement(By.xpath("//label[@for='honda']")).getText();
		
		
		//Select Dropdown
		WebElement dropdown= driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select dropSelect=new Select(dropdown);
		dropSelect.selectByVisibleText(chkBoxOptionSelectedText);
		
		
		WebElement inputName= driver.findElement(By.cssSelector("input[id='name']"));
		inputName.sendKeys(chkBoxOptionSelectedText);
		
		WebElement alertBtn= driver.findElement(By.cssSelector("input[id='alertbtn']"));
		alertBtn.click();
		String alertText= driver.switchTo().alert().getText();
		
		System.out.println(alertText.contains(chkBoxOptionSelectedText));

	}
}