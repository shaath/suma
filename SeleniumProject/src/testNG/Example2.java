package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example2 
{
	public static WebDriver driver=null;
	@BeforeTest
	public void Launch_Br()
	{
		driver=new FirefoxDriver();
	}
	
	@BeforeMethod
	public void Launch_App()
	{
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void clickSitemap()
	{
		driver.findElement(By.linkText("Site Map")).click();
	}
	@AfterMethod
	public void clickhome()
	{
		driver.findElement(By.linkText("Home")).click();
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}
}
