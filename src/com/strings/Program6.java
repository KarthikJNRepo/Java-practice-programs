package com.strings;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int word=1;
     String str="count number of space";
     for(int i=0;i<str.length();i++)
     {
    	 if(str.charAt(i)==' ')
    		 word++;
     }
     System.out.println("number of words :"+word);
     System.out.println("number of spaces :"+(word-1));
	}

}
