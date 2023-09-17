package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_Chrome4
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver  driver=new  ChromeDriver();
		
		
		//Enter URL
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		//Enter URL
		driver.navigate().to("https://kite.zerodha.com/");
		
		Thread.sleep(2000);
		
		// to move backword
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		//To move forword
		driver.navigate().forward();
	
		Thread.sleep(2000);
		
		//To refresh webpage
		driver.navigate().refresh();
		
	}
	
	
	
	
	
	
	
}
