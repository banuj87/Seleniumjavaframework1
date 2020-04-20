package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_GoogleSearch {


	public static void main(String[] args) {

		GoogleSearch();

	}
	public static void GoogleSearch()
	{
		WebDriverManager.firefoxdriver().setup();
		//WebDriver driver= new ChromeDriver();	
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("automation setp by step");
		//driver.close();
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
	}

}
