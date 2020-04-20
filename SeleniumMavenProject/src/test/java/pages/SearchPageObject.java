package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchPageObject {
	
	WebDriver driver = null;
	
	
	
	By textbox_search=By.xpath("//input[@name='q']");
	By search_button= By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']");
	
	
	public SearchPageObject(WebDriver driver) {
		
		this.driver=driver;
	}

//Now we have to do actions on the above elements.
	
	public void setTextInSearchBox(String text ) {
		
		
//driver.findElement(textbox_search).sendKeys("Automation step by step");//BY this way the value automation step by step will be hard coded 
		
// So we will pass the send keys value as parameter to this function
		
		driver.findElement(textbox_search).sendKeys(text);
		
	}
	
	//This function peroform click action on search button
	
	public void clickSearchButton() {
		
		driver.findElement(search_button).sendKeys(Keys.RETURN);
	}
	

}