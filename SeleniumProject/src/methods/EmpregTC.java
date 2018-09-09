package methods;

import java.io.IOException;

public class EmpregTC {

	public static void main(String[] args) throws IOException 
	{
		String res=null;
		OrgMaster om=new OrgMaster();
		
		res=om.Org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("Applicaion Launch "+res);
		
		res=om.Org_Login("Admin", "Admin");
		System.out.println("Application Login "+res);
		
		res=om.Org_EmpReg("Suma", "J", "SJ9874");
		System.out.println("Employee Registration "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Application closed successfully");

	}

}