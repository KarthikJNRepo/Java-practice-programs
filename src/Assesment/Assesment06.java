package Assesment;

import java.util.Scanner;

public class Assesment06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number x");
		int x=sc.nextInt();
		System.out.println("enter number y");
		int y=sc.nextInt();
		
		
		if((x-y)>-5 && (x-y)<5) {
			System.out.println("yes!!! the difference between x and y is less than 5");
		}
		else {
			System.out.println("no!!! the difference between x and y is less than 5");
		}
	}

}
