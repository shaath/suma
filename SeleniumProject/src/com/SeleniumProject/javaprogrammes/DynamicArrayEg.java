package com.SeleniumProject.javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args) 
	{
		String[] x=new String[5];
		
		System.out.println(x.length);
		
		//Writing the data into an array
		x[3]="Selenium";
		x[0]="Suma";
		x[3]="UFT";
		//Reading the data from an array
		for (int i = 0; i < x.length; i++)
		{
			System.out.println(x[i]);
		}

	}

}
