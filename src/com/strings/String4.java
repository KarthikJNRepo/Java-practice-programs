package com.strings;


public class String4 {

	public static void main(String[] args) {
		String s[]= "kalyan pawan star power".split(" ");
		//split is builtin functaion it reverse string
		String length=" ";

				for(int i=s.length-1;i>=0;i--) {
					length += s[i] + " ";
					
				}
				System.out.println("revers string:"+length);
		
	

	}

}
