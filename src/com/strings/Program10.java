package com.strings;

import java.util.regex.Pattern;

public class Program10 {
	private static Pattern p=Pattern.compile("^[a-zA-Z0-9]*$");
	public static boolean isAlphaNumeric(String s)
	{
		return p.matcher(s).find();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="ABC#";
       System.out.println("isAlphaNumeric:"+isAlphaNumeric(s));
	}

}
