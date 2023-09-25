package com.strings;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int words=1;
		String str="count number of space";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			
				words++;
			}
			System.out.println("count number of words :"+words);
			System.out.println("count number of space :"+(words-1));
		

	}

}
