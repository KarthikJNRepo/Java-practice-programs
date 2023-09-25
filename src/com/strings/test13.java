package com.strings;

public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="USERNAME123PASSWORD456";
		System.out.println(str);
		String s=str.replaceAll("[^a-zA-z]", "");
		System.out.println("string only");
		System.out.println(s);

	}

}
