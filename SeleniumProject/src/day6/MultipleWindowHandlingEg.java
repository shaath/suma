package day6;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MultipleWindowHandlingEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
//		String gmail=driver.getWindowHandle();
//		System.out.println(gmail);
		
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> s=driver.getWindowHandles();
		
		Iterator<String> it=s.iterator();
		
		while (it.hasNext()) 
		{
			String wId=it.next();
			System.out.println(wId);
			
			driver.switchTo().window(wId);
			System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
			
//			try 
//			{
//				driver.findElement(By.linkText("Create a strong password")).click();
//				Sleeper.sleepTightInSeconds(5);
//				System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
//				
//			} 
//			catch (Exception e)
//			{
//				System.out.println("The expected link not available in this page");
//			}
			if (driver.getTitle().equalsIgnoreCase("Google Account Help")) 
			{
				driver.findElement(By.linkText("Create a strong password")).click();
				Sleeper.sleepTightInSeconds(5);
				System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
				break;
			}
			
		}
		
//		driver.findElement(By.linkText("Create a strong password")).click();
		

	}

}
