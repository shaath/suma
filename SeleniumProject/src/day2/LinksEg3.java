package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg3 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("The number of links available in google page is "+links.size());
		
		for (int i = 0; i < links.size(); i++)
		{
			String name=links.get(i).getText();
			if (name.equalsIgnoreCase("privacy"))
			{
				links.get(i).click();
				break;
			}
		}

	}

}
