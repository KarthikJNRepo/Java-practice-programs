package com.strings;

import java.util.Scanner;

public class Program18 {

	public static void main(String[] arg) {
		
		String str="hello";
		int len=str.length();
		 String temp = "";
		 for (int i = 0; i <len;i= i+2)
		 temp += str.charAt(i);
		 System.out.println(temp);
		 }
	}

