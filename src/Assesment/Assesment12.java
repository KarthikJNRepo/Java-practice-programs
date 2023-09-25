package Assesment;

import java.util.Scanner;

public class Assesment12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number x");
		int x=sc.nextInt();
		System.out.println("enter number y");
		int y=sc.nextInt();
		if(x>y) {
			System.out.println("greatest number is x:"+x);
		}
		else if (y>x) {
			System.out.println("greatest number is y:"+y);
		}
		else {
			System.out.println("both numbers are equal");
		}
	}

}
