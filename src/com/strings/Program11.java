package com.strings;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt[]=new int[5];
		System.out.println("enter the sentence");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='A')
			{
				cnt[0]++;
			}
			if(str.charAt(i)=='e'||str.charAt(i)=='E')
			{
				cnt[1]++;
			}
			if(str.charAt(i)=='i'||str.charAt(i)=='I')
			{
				cnt[2]++;
			}
			if(str.charAt(i)=='o'||str.charAt(i)=='O')
			{
				cnt[3]++;
			}
			if(str.charAt(i)=='u'||str.charAt(i)=='U')
			{
				cnt[4]++;
			}
			}
System.out.println("number of 'a'="+cnt[0]);
System.out.println("number of 'e'="+cnt[1]);
System.out.println("number of 'i'="+cnt[2]);
System.out.println("number of 'o'="+cnt[3]);
System.out.println("number of 'u'="+cnt[4]);
	}

}
