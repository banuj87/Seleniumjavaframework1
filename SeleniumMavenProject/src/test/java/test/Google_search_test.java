package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Google;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_search_test {
	static WebDriver driver =null;

	public static void main(String[] args) {

		GoogleSearch();

	}
	public static void GoogleSearch()
	{
		WebDriverManager.chromedriver().version("2.36").setup();
		driver= new ChromeDriver();		
		driver.get("https://www.google.com");

		//driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("automation setp by step");

		Google.textbox_search(driver).sendKeys("automation setp by step");

		//driver.close();

		//driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		Google.Hit_Search_button(driver).sendKeys(Keys.RETURN);

	}

}
