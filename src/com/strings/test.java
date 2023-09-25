package com.strings;

public class test {
	public static String reverse(String str) {
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		return sb.toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("pspk"));

	}

}
