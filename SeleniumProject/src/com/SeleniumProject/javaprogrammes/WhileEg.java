package com.SeleniumProject.javaprogrammes;

public class WhileEg {

	public static void main(String[] args) 
	{
		int i=1;
		while(i <= 500)
		{
			System.out.println(i);
			if (i==300)
			{
				break;
			}
			i++;
			
		}

		int j=500;
		while (j >=1 ) 
		{
			System.out.println(j);
			j--;
		}
	}

}
