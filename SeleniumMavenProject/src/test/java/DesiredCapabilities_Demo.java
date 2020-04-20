import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesiredCapabilities_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "/Users/anujbhatia/eclipse-workspace/SeleniumFramework/driver/chromdriver/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("Https://www.google.com");

		//driver.close();
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		driver.close();
		driver.quit();
	
	}
	

}
