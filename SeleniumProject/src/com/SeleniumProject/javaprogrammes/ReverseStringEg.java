package com.SeleniumProject.javaprogrammes;

public class ReverseStringEg {

	public static void main(String[] args) 
	{
		String f="Madam";    //elppA
		String rev="";	
		int len=f.length();
		
//		for (int i = 0; i < len; i++) 
//		{
//			System.out.println(f.charAt(i));
//		}
//		System.out.println("Reverse order");
//		for (int i = len-1; i >= 0; i--)
//		{
//			System.out.print(f.charAt(i));
//		}
		
		for (int i = len-1; i >= 0; i--) 
		{
			rev=rev+f.charAt(i);
		}
		
		System.out.println(f+"----------"+rev);
		if (f.equalsIgnoreCase(rev)) 
		{
			System.out.println("Given string is a polyndrome");
		}
		else
		{
			System.out.println("Given String is not a polyndrome");
		}
	}

}
