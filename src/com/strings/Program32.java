package com.strings;

public class Program32 {
	public static  String mirrorEnds(String String)
	{
		int len=String.length();
		String fin="";
		String tmp1="";
		String tmp2="";
		for(int i=0;i<len;i++)
		{
			tmp1 +=String.substring(i, i+1);
			tmp2="";
			for(int j=tmp1.length()-1;j>=0;j--)
			{
				tmp2 +=tmp1.substring(j, j+1);
				if(tmp2.equals(String.subSequence(len-i-1, len)))
					fin=tmp1;
			}
		}
		return fin;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("result :"+mirrorEnds("abXYZba"));

	}

}
