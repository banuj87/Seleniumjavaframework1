package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReports_demo {


	static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ExtentHtmlReporter htmlReporter= new ExtentHtmlReporter("extentReports.html");


		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

		WebDriverManager.chromedriver().version("2.36").setup();
		driver= new ChromeDriver();		
		
		test.log(Status.INFO,"Starting the test case");
		driver.get("https://www.google.com");
		test.pass("Navigated to google");
		
		

		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("automation setp by step");
		test.pass("Enter text in search box");
		
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		test.pass("Pressed keyboard enter key");
		
		driver.close();
		test.pass("Passed test , closed browser");
		
		test.info("Test Completed");
		
		ExtentTest test2 = extent.createTest("MyFirstTest", "Sample description");
		driver= new ChromeDriver();		
		test2.log(Status.INFO,"Starting the test case");
		driver.get("https://www.google.com");
		test2.pass("Navigated to google");
		
		

		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("automation setp by step");
		test2.pass("Enter text in search box");
		
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		test2.fail("Pressed keyboard enter key");
		
		driver.close();
		test2.pass("Passed test , closed browser");
		
		test2.info("Test Completed");
		
		extent.flush();

	}

}
