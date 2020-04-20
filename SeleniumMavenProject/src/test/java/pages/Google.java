package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Google {

	//Identifying web objects seperate in the class

	private static WebElement element= null;
	//function for element locator 
	public static WebElement textbox_search(WebDriver driver)//We will be getting driver from our test
	{
		element = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		return element;
	}

	//function for element locator 
	public static WebElement Hit_Search_button(WebDriver driver)
	{

		element= driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]"));
		return element;


	}



}
