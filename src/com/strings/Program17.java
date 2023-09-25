package com.strings;

public class Program17 {

	static boolean doubleX(String str) {
	int i = str.indexOf("x");
	if (i == -1) return false;
	if (i+1 >= str.length()) return false;
	return str.substring(i+1, i+2).equals("x");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Result: " +doubleX("axx"));
	}

}
