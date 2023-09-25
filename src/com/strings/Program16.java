package com.strings;

public class Program16 {

	static int countXX(String str) {
	int count = 0;
	for (int i = 0; i < str.length()-1; i++) {
	if (str.substring(i, i+2).equals("xx"))
		count++;
	}
	return count;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Result: " +countXX("axxb"));
	}

}
