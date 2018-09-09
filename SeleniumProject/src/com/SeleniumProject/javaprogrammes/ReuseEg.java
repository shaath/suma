package com.SeleniumProject.javaprogrammes;

public class ReuseEg {

	public static void main(String[] args) 
	{
		Methods_Eg m=new Methods_Eg();
		
		int res=m.sum(40,60);
		System.out.println(res);

		res=m.sum(30, 20, 50);
		System.out.println(res);
	}

}
