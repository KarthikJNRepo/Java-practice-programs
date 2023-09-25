package com.strings;

public class Program30 {
	public static int sumDigits(String str) {
		int len = str.length();
		int sum = 0;

		for (int i = 0; i < len; i++) {
		if (Character.isDigit(str.charAt(i))) {
		String tmp = str.substring(i,i+1);
		sum += Integer.valueOf(tmp);
		}
		}
		return sum;
		}

	public static void main(String[] args) {
		System.out.println("Chocolate :"+ sumDigits("Chocolate"));
		System.out.println("aa11b33 :"+ sumDigits("aa11b33"));
		System.out.println("aa1bc2d3 :"+ sumDigits("aa1bc2d3"));

	}

}
