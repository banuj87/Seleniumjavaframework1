package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.SearchPageObject;

public class SearchPageObject_Test {
	
	private static WebDriver driver =null;

	public static void main(String[] args) {
		
		googleSearchTest();
		
	}
	
	public static void googleSearchTest() {
		
		 System.setProperty("webdriver.chrome.driver", "/Users/anujbhatia/eclipse-workspace/SeleniumFramework/driver/chromdriver/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 SearchPageObject SPJ = new SearchPageObject(driver);
		 driver.get("https://www.google.com");
		 SPJ.setTextInSearchBox("Canada Goose");
		 SPJ.clickSearchButton();
		 
		 
	}
}
