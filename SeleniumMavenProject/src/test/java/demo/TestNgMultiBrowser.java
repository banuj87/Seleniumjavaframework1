package demo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//In this program we are executing code in multiple browser
//To execute code in parallel  add "Parallel" tag in testing.xml file in suite Tag.

public class TestNgMultiBrowser {
	
	WebDriver driver=null;
	
	@BeforeTest
	@Parameters("browserName")// we will get parameter (browser name from testng.xml file)
	public void Setup(String browserName)
	{
		System.out.println("Browser Name is "+browserName);
		System.out.println("Thread Count is "+Thread.currentThread().getId());
		
		if(browserName.equalsIgnoreCase("chrome")) {

			String ProjectPath=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", ProjectPath+"/driver/chromdriver/chromedriver");
			driver =new ChromeDriver();
			
		}	else if(browserName.equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver= new FirefoxDriver();
				driver.get("https://google.ca");
			}
		
		
	}
	@Test
	public void test1() throws InterruptedException {
		
		driver.get("https://google.com");
		Thread.sleep(4000);
		
		}
	@AfterTest
	public void Teardown() {
		
		
		driver.close();
		System.out.println("Test completed");
	}
}
