import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumMaven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
				 WebDriverManager.chromedriver().version("2.36").setup();
				 WebDriver driver=new ChromeDriver();
				 driver.get("https://www.google.com");
				 
				 
				 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
				 driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("automation setp by step");
				 //driver.close();
				 driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
			
			
			}

	}


