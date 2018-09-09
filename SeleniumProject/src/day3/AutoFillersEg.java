package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AutoFillersEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("src")).sendKeys("G");
		Sleeper.sleepTightInSeconds(3);
		
		List<WebElement> cities=driver.findElements(By.xpath("//*[@id='search']/div/div[1]/div/ul/li"));
		System.out.println(cities.size());
		
		for (int i = 0; i < cities.size(); i++) 
		{
			String Cname=cities.get(i).getText();
			System.out.println(Cname);
			if (Cname.contentEquals("Guwahati"))
			{
				cities.get(i).click();
				break;
			}
		}

	}

}
