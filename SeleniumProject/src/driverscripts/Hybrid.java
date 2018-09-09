package driverscripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import methods.OrgMaster;

public class Hybrid {

	public static void main(String[] args) throws IOException 
	{
		OrgMaster om=new OrgMaster();
		String res=null;
		String xlpath="F:\\Suma Recordings\\Workspace\\SeleniumProject\\src\\testdata\\Hybrid.xlsx";
		String xlout="F:\\Suma Recordings\\Workspace\\SeleniumProject\\src\\results\\HybridRes.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws1=wb.getSheet("Testcase");
		XSSFSheet ws2=wb.getSheet("Teststeps");
		XSSFSheet ws3=wb.getSheet("TestData");
		XSSFSheet ws4=wb.getSheet("EmpReg");
		
		int TcRc=ws1.getLastRowNum();
		int TsRc=ws2.getLastRowNum();
		int EmpRc=ws4.getLastRowNum();
		
		for (int i = 1; i <= TcRc; i++)
		{
			ws1.getRow(i).createCell(3);
			String exe=ws1.getRow(i).getCell(2).getStringCellValue();
			
			if (exe.equalsIgnoreCase("Y"))
			{
				String TcId=ws1.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= TsRc; j++) 
				{
					String TsTcId=ws2.getRow(j).getCell(0).getStringCellValue();
					if (TcId.equalsIgnoreCase(TsTcId))
					{
						String key=ws2.getRow(j).getCell(3).getStringCellValue();
						
						switch (key) 
						{
						case "Launch":
							String url=ws3.getRow(1).getCell(0).getStringCellValue();
							res=om.Org_Launch(url);
							break;
						case "login":
							String u=ws3.getRow(1).getCell(1).getStringCellValue();
							String p=ws3.getRow(1).getCell(2).getStringCellValue();
							res=om.Org_Login(u, p);
							break;
						case "logout":
							res=om.Org_Logout();
							om.Org_Close();
							break;
						case "Empreg":
							for (int k = 1; k <= EmpRc; k++)
							{
								String f=ws4.getRow(k).getCell(0).getStringCellValue();
								String l=ws4.getRow(k).getCell(1).getStringCellValue();
								String Eid=ws4.getRow(k).getCell(2).getStringCellValue();
								res=om.Org_EmpReg(f, l, Eid);
								ws4.getRow(k).createCell(3).setCellValue(res);
							}
							break;
						case "Usereg":
							String ename=ws3.getRow(1).getCell(6).getStringCellValue();
							String uname=ws3.getRow(1).getCell(7).getStringCellValue();
							String pswd=ws3.getRow(1).getCell(8).getStringCellValue();
							String cpswd=ws3.getRow(1).getCell(9).getStringCellValue();
							res=om.Org_UserReg(ename, uname, pswd, cpswd);
							break;
						case "Ulogin":
							String un=ws3.getRow(1).getCell(7).getStringCellValue();
							String pw=ws3.getRow(1).getCell(8).getStringCellValue();
							res=om.Org_Login(un, pw);
							break;
						default:
							System.out.println("Select a proper keyword");
							break;
						}
						
						ws2.getRow(j).createCell(4).setCellValue(res);
						
						if (!ws1.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							ws1.getRow(i).getCell(3).setCellValue(res);
						}
					}
					
				}
			}
			else
			{
				ws1.getRow(i).createCell(3).setCellValue("BLOCked");
			}
			
			
		}
		
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();

	}

}
