import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorSamples {

	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver", "F://SeleniumFiles//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("");
		
		driver.findElement(By.name("firstname")).sendKeys("kavi");
		
		
//		driver.quit();
	}
}
