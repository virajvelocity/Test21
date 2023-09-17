package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_Chrome3 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver  driver=new  ChromeDriver();
		
		
		//Enter URL
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		//Close current tab
		//driver.close();
		
		
		//Close all the tabs of the browser
		driver.quit();
		
		
	}
	
	
	
	
	
	
	

}
