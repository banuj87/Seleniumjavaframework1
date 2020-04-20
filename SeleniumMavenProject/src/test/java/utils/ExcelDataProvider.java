package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import configurations.Properties_File;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataProvider {

	static WebDriver driver=null;
	
	@BeforeTest
	public void setup() {

		
		//Properties_File.getProperties();
	 {
			WebDriverManager.chromedriver().version("2.36").setup();
			driver= new ChromeDriver();		
			//driver.get("https://www.google.com");
		}
		
	}
	
	
	
	
	@Test(dataProvider = "test1data")
	public void test1(String username, String password ) throws InterruptedException {
		
		System.out.println(username+" | "+password);
	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		Thread.sleep(2000);
		//driver.findElement(By.id("//input[@id='btnLogin']")).click();
	
	
	}
	
	
	
	
	
	
	
	@DataProvider(name="test1data")
	public  Object[][] getData() {

		String excelPath="/Users/anujbhatia/eclipse-workspace/SeleniumMavenProject/excel/data.xlsx";

		Object data[][]=TestData(excelPath,"sheet1");
		return data;
	}



	public  Object[][] TestData(String excelPath,String sheetName) {
		String cellData=null;
		Excel_Utils excel= new Excel_Utils(excelPath, sheetName);

		int colCount=excel.GetColCount();
		int rowCount=excel.GetRowCount();

		System.out.println(rowCount);
		
		Object data[][]=new Object[rowCount-1][colCount];

		//System.out.println(colCount+rowCount);

		for(int i=1 ;i<rowCount;i++)
		{
			for(int j=0;j<colCount;j++)
			{

				cellData=excel.GetCellDataString(i, j);
				
				System.out.print(cellData);
				data[i-1][j]=cellData;
			}
		}//System.out.println();
		return data;

	}


}


