package com.strings;

import java.util.regex.Pattern;

public class test10 {
	private static Pattern p= Pattern.compile("^[a-zA-Z0-9]*$");
	public static boolean isAlphanumric(String s)
	{
		return p.matcher(s).find();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		System.out.println("isAlphaNumeric :"+isAlphanumric(s));

	}

}
