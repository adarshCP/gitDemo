import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RahulShettyHandleHTTPSCertificates {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}

}
