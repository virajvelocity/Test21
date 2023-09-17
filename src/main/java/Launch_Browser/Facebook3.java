package Launch_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver  driver=new  ChromeDriver();
		
		
		//Enter URL
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(2000);
		
		//Click link
		driver.findElement(By.xpath("//a[contains(@class, 'text-light f')]")).click();
		
		
		
		
	}
	
	
	
}
