package com.strings;

public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="USERNAME123password456";
		System.out.println(str);
		str=str.replaceAll("[^A-za-z]", "");
		System.out.println("Strings only");
		System.out.println(str);

	}

}
