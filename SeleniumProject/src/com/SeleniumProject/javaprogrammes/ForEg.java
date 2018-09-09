package com.SeleniumProject.javaprogrammes;

public class ForEg {

	public static void main(String[] args) 
	{
		for(int i=1; i <= 10; i++)
		{
			System.out.println("Hi");
		}
		System.out.println("Incrementor loop");
		for(int i=1; i <= 100; i++)  // i++ ----     i=i+1
		{
			System.out.println(i);
			if (i == 70) 
			{
				break;
			}
			
		}
		
		System.out.println("Decrementor Loop");
		for(int i=100; i >= 1; i--)
		{
			System.out.println(i);
			if (i == 70) 
			{
				break;
			}
		}
	}

}
