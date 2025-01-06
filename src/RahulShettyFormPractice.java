import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RahulShettyFormPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		WebElement name=driver.findElement(By.xpath("//form[@class='ng-untouched ng-pristine ng-invalid']//input[@name='name']"));
		WebElement email=driver.findElement(By.xpath("//form[@class='ng-untouched ng-pristine ng-invalid']//input[@name='email']"));
		WebElement password=driver.findElement(By.xpath("//form[@class='ng-untouched ng-pristine ng-invalid']//input[@type='password']"));
		WebElement selectGenderDropdown=driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		WebElement loveIceCreamsCheckBox= driver.findElement(By.xpath("//input[@id='exampleCheck1']"));
		WebElement employmentStatusRadioBtnSelectorEmployed= driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		WebElement selectDOBinput=driver.findElement(By.xpath("//input[@name='bday']"));
		WebElement submitBtn=driver.findElement(By.xpath("//input[@value='Submit']"));
		
	
		
		
		name.sendKeys("Adarsh");
		email.sendKeys("dadaj@gmail.com");
		password.sendKeys("dada");
		Select dropdown = new Select(selectGenderDropdown);
		dropdown.selectByVisibleText("Female");
		loveIceCreamsCheckBox.click();
		employmentStatusRadioBtnSelectorEmployed.click();
		selectDOBinput.sendKeys("26111999");
		submitBtn.click();
		WebElement submitAlert = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']/strong"));
//		Assert.assertEquals(submitAlert.getText(), "Success!");
		System.out.println(submitAlert.getText());
	}

}
