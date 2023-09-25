package com.strings;

public class Program31 {
	public static String sameEnds(String String)
	{
		int len=String.length();
		String fin="";
		String tmp="";
		for(int i=0;i<len;i++)
		{
			tmp += String.charAt(i);
			int tmplen=tmp.length();
			if(i<len/2 && tmp.equals(String.substring(len-tmplen, len)))
				fin =tmp;
		}
		return fin;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// xx
		//
		System.out.println("result :"+sameEnds("xxx"));

	}

}
