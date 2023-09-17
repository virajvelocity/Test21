package Launch_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook5 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver  driver=new  ChromeDriver();
		
		
		//Enter URL
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		//Click Button
		driver.findElement(By.xpath("//a[contains(text(),'Create new')]")).click();
		
		Thread.sleep(2000);
		
		//Enter Surname
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Sharma");
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
