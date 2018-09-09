package com.SeleniumProject.javaprogrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args)
	{
		ArrayList<Object> x=new ArrayList<Object>();

		//Writing the data into arraylist
		x.add("Selenium");
		x.add(60000);
		x.add(true);
		x.add(5555.555);
		x.add('M');
		x.add("Selenium");
		x.add(2, "UFT");
		
		System.out.println(x.size());
		
//		System.out.println(x.get(2));
		
		for (int i = 0; i < x.size(); i++) 
		{
			System.out.println(x.get(i));
		}
		
		
	}

}
