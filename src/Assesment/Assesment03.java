package Assesment;

import java.util.Scanner;

public class Assesment03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		if(n>=0) {
			System.out.println("positive number");	
		}
		else {
			System.out.println("negative number");
		}
	}

}
