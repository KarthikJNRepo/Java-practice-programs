package com.strings;

public class Program1 {

	public static String reverse(String str) {
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		
		return sb.toString();
	}
		public static void main(String[] args) {
			System.out.println(reverse("pspk"));
			System.out.println(reverse("power star pawan kalyan"));
	}

}
