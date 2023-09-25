package Assesment;

import java.util.Scanner;

public class Assesment04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x: ");
		int x=sc.nextInt();
		System.out.println("enter y :");
		int y=sc.nextInt();
		if(x%y==0) {
			System.out.println("x is a multiple of y");
		}
		else {
			System.out.println("x is not a multiple of y");
		}
	}
}
