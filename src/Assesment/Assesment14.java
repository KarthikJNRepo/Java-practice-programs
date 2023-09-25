package Assesment;

import java.util.Scanner;

public class Assesment14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number x");
		int x=sc.nextInt();
		System.out.println("enter number y");
		int y=sc.nextInt();
		
		
		if(y%x==0) {
			System.out.println("Yess");
		}
		else {
			System.out.println("nooo!!!");
		}
		
	}
}
