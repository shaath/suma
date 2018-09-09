package com.SeleniumProject.javaprogrammes;

public class StringEg {

	public static void main(String[] args) 
	{
		String course="Selenium";
		
		System.out.println(course.toUpperCase());
		
		System.out.println(course.toLowerCase());
		
		System.out.println(course.length());

		System.out.println(course.charAt(5));
		
		System.out.println(course.indexOf('l'));
		
		System.out.println(course.trim());
		
		System.out.println(course.indexOf('e'));
		
		System.out.println(course.lastIndexOf('e'));
		
		System.out.println(course.substring(2, 6));
		
		System.out.println(course.replace('e', 'x'));
		
		System.out.println(course.replaceFirst("len", "pop"));
		
		System.out.println(course.concat(" is a course"));
		
		System.out.println(course+" is a course");
		
		System.out.println(course.join(" ", "We are learning",course,"UFT","Manual"));
		
		System.out.println(course.endsWith("sum"));
		
		System.out.println(course.isEmpty());
			
		
	}

}
