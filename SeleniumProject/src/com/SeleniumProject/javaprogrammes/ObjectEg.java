package com.SeleniumProject.javaprogrammes;

public class ObjectEg {

	public static void main(String[] args) 
	{
		Object[] x={"Selenium", 'M', 400000,555.555, true};
		
		System.out.println(x.length);
		for (Object object : x) 
		{
			System.out.println(object);
		}

	}

}
