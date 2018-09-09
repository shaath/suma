package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpReg_TestNG extends TestNGMaster
{  
	@Test(dataProvider="data")
	public void Empreg( String f,String l, String Eid)
	{
		expval=f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(Eid);
		driver.findElement(By.id("btnSave")).click();
		
		actval=driver.findElement(By.xpath("//*[@id='profile-pic']/h1")).getText();
		Assert.assertEquals(actval, expval,"Emp Reg  Failed");
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] x=new Object[3][3];
		
		x[0][0]="sachin";
		x[0][1]="T";
		x[0][2]="ST9870";
		
		x[1][0]="Manikanta";
		x[1][1]="G";
		x[1][2]="MG9870";
		
		x[2][0]="Sandeep";
		x[2][1]="G";
		x[2][2]="GST9870";
		
		return x;
	}

}
