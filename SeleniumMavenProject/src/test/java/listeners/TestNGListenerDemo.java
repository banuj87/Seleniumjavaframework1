package listeners;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)

public class TestNGListenerDemo {

	@Test
	public void test1() {
		System.out.println("I am inside Test 1");
	}
	@Test
	public void test2() {
		System.out.println("I am inside Test 2");
		
		String ProjectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ProjectPath+"/driver/chromdriver/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("automation setp by step");

		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		driver.close();


	}
	@Test
	public void test3() {
		System.out.println("I am inside Test 3");
	}
}
