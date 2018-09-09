package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=d432f5682e3668870cab0d5bfba5b51d");
		driver.manage().window().maximize();
		
		WebElement country=driver.findElement(By.name("country"));
		
		Select s=new Select(country);
		
		List<WebElement> clist=s.getOptions();
			
		System.out.println("The number of countries avaialble in the drown is :"+clist.size());
		
		for (int i = 0; i < clist.size(); i++) 
		{
			s.selectByIndex(i);
			String name=clist.get(i).getText();
			System.out.println("Selected country name is :"+name);
		}
				
	}

}
