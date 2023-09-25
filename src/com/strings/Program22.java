package com.strings;

public class Program22 {
	
	public static String stringX(String str) {
	  String result = "";
	  int len = str.length();
	  for (int i = 0; i < len; i++){
	    char temp = str.charAt(i);
	    if (!(i > 0 && i < len - 1 && temp == 'x'))
	      result = result + temp;
	  }
	    return result;      
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("result :"+stringX("xxHxix"));

	}

}
