package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLoginEg {

	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		WebElement email=driver.findElement(By.id("identifierId"));
		email.sendKeys("gandesharath");
		
//		Sleeper.sleepTightInSeconds(5);
		
//		email.clear();
		
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
//		Sleeper.sleepTightInSeconds(20);
//		Thread.sleep(15000);
		driver.findElement(By.name("password")).sendKeys("123456789");
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
	}

}
