package com.strings;

public class Program29 {
	public static int countTriple(String str) {
		int len = str.length();
		int count = 0;

		for (int i = 0; i < len-2; i++){
		char tmp = str.charAt(i);
		if (tmp == str.charAt(i+1) && tmp == str.charAt(i+2))
		count++;
		}
		return count;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("result :"+countTriple("abcxxxabc"));
	}

}
