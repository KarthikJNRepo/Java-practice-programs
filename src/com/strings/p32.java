package com.strings;

public class p32 {
	public static String mirrorEnds(String String) 
	{
		int len=String.length();
		String fin="";
		String temp1="";
		String temp2="";
		for(int i=0;i<len;i++)
		{
			temp1+=String.substring(i, i+1);
			System.out.println("temp1 " +temp1);
			temp2="";
			for(int j=temp1.length()-1;j>0;j-- )
				
			{
				temp2+=temp1.substring(j,j+1);
				System.out.println("temp2 " +temp2);
				if(temp2.equals(String.subSequence(len-i-1, len)))
                   fin=temp1;
			}
		}
		return fin;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("result :"+mirrorEnds("abba"));

	}

}
