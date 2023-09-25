package com.strings;

public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(print("hello",5));

	}
	static String print(String a,int n)
	{
		for(int i=1;i<n;i++)
		{
			System.out.print(a);
		}
		return a;
	}

}
