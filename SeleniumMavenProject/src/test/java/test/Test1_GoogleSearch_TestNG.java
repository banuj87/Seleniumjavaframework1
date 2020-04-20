package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_GoogleSearch_TestNG {

	static WebDriver driver=null;
	String brwosername=null;
	
	
	 
	@BeforeTest
	public void setup() {

		WebDriverManager.chromedriver().version("2.36").setup();
		driver= new ChromeDriver();		
		driver.get("https://www.google.com");

	}

	@Test
	public static void GoogleSearch()
	{

		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("automation setp by step");

		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
	}

	@AfterTest
	public void tear_down() {

		driver.close();
		System.out.println("Browser closed successfully");
	}
}
