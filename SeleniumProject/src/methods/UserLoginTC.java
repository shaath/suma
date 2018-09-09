package methods;

import java.io.IOException;

public class UserLoginTC {

	public static void main(String[] args) throws IOException 
	{
		String res=null;
		OrgMaster om=new OrgMaster();
		
		res=om.Org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("Applicaion Launch "+res);
		
		res=om.Org_Login("SumaJ123456", "SumaJ123456");
		System.out.println("Application Login "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Application closed successfully");

	}

}
