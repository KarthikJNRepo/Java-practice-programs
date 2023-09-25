package com.strings;


public class Program3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println(Program3.isPalindrome("nitin"));
           System.out.println(Program3.isPalindrome("jathin"));
	}
           public static boolean isPalindrome(String str)
       	{
       		StringBuilder sb=new StringBuilder(str);
       		sb.reverse();
       		String rev=sb.toString();
       		if(str.equals(rev)) {
       			return true;
       		}
       		else
       		{
       		return false;
       		}
	}

}
