package com.strings;

public class test4 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]="he is good".split(" ");
	     String length=" ";
	     for(int i=s.length-1;i>=0;i--)
	    	 length += s[i] + " ";
	     {
	    	 System.out.println("reverse string :"+length);
	     }

	}

}
