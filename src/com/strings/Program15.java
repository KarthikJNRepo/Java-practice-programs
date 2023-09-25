package com.strings;

public class Program15 {
	public static void main(String[] args) {
		String str="sumhhhh";
		int n=2;
		int len=str.length();
		String temp="";
		if(len<4)
		{
			for(int i=0;i<n;i++)
			{
				temp=temp+str;
			}
		}
		else
		{
		for(int j=0;j<n;j++)
		{
			System.out.println(j);
			temp=temp+str.substring(0, 3);
		}
		}
		System.out.println(temp);
	}
			 
}	

