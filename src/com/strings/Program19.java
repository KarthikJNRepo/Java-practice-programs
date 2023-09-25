package com.strings;

public class Program19 {
	public static void main(String[] arg) {
			String str="code";
			int len=str.length();
			 String temp = "";
			 for (int i = 0; i < len + 1; i++)
			 temp += str.substring(0, i);
			 System.out.println(temp);
			 }
	
}




