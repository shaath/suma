package methods;

import java.io.IOException;

public class TestSuite {

	public static void main(String[] args) throws IOException
	{
		//Login
		String res=null;
		OrgMaster om=new OrgMaster();
		
		res=om.Org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("Applicaion Launch "+res);
		
		res=om.Org_Login("Admin", "Admin");
		System.out.println("Application Login "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Application closed successfully");
		
		//Empreg
		
		res=om.Org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("Applicaion Launch "+res);
		
		res=om.Org_Login("Admin", "Admin");
		System.out.println("Application Login "+res);
		
		res=om.Org_EmpReg("Mahesh", "J", "MJ9885");
		System.out.println("Employee Registration "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Application closed successfully");
		
		//Userreg
		
		res=om.Org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("Applicaion Launch "+res);
		
		res=om.Org_Login("Admin", "Admin");
		System.out.println("Application Login "+res);
		
		res=om.Org_UserReg("Mahesh J", "MaheshJ123456", "MaheshJ123456", "MaheshJ123456");
		System.out.println("User registration "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Application closed successfully");
		
		//userLogin
		
		res=om.Org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("Applicaion Launch "+res);
		
		res=om.Org_Login("MaheshJ123456", "MaheshJ123456");
		System.out.println("Application Login "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Application closed successfully");

	}

}
