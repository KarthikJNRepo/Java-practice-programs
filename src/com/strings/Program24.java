package com.strings;

public class Program24 {
	public static String stringYak(String str) {
		String result = "";

		for (int i=0; i<str.length(); i++) {
		if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
		i = i + 2;
		} else {
		result = result + str.charAt(i);
		}
		}

		return result;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("result :"+stringYak("yakpak"));

	}

}
