package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class LinksEg5 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com:9090/sitemap.html");
		driver.manage().window().maximize();

		WebElement block=driver.findElement(By.xpath("//*[@id='Table_011']/tbody/tr[2]/td"));
		
		List<WebElement> links=block.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) 
		{
			String lname=links.get(i).getText();
			System.out.println(lname);
			links.get(i).click();
			Sleeper.sleepTight(3000);
			System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
			driver.navigate().back();
			Sleeper.sleepTight(3000);
			block=driver.findElement(By.xpath("//*[@id='Table_011']/tbody/tr[2]/td"));
			links=block.findElements(By.tagName("a"));
		}

	}

}
