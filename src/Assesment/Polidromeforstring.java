package Assesment;

import java.util.Scanner;

public class Polidromeforstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		int len=s.length();
		int last=len-1,first=0;
		boolean flag=true;
		int i=0;
		while(first<last) {
			System.out.println(i++);
			if(s.charAt(first++) != s.charAt(last--)){
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("print");
		}
	
	}

}
