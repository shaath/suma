package com.SeleniumProject.javaprogrammes;

public class SwitchCaseEg {

	public static void main(String[] args)
	{
		String course="UFT";
		
		switch(course)
		{
		case "Selenium":
			System.out.println("You are selected selenium");
			break;
		case "Manual":
			System.out.println("You are selected manual");
			break;
		case "UFT":
			System.out.println("You are selected UFT");
			break;
			
		default:
			System.out.println("Select a proper course");
			break;
		}

	}

}
