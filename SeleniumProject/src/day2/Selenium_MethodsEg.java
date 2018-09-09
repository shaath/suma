package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_MethodsEg {

	public static void main(String[] args)
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
//		System.out.println(driver.getTitle());
		
//		System.out.println(driver.getCurrentUrl());

//		System.out.println(driver.getPageSource());
		
//		driver.close();
		
//		driver.quit();
		
		driver.navigate().to("http://seleniumhq.org");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
	}

}
