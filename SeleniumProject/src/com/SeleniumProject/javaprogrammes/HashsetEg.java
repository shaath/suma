package com.SeleniumProject.javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetEg {

	public static void main(String[] args) 
	{
		Set<Object> s=new HashSet<Object>();
		
		s.add("Selenium");
		s.add(100000);
		s.add("Boll");
		s.add("Apple");
		s.add(true);
		s.add("Apple");
		
		Iterator<Object> it=s.iterator();
		
		while(it.hasNext())
		{
			Object value=it.next();
			System.out.println(value);
		}
	}

}
