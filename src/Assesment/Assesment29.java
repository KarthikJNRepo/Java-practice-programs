package Assesment;

import java.util.Scanner;

public class Assesment29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		long sum=0;
		for(int i=1;i<=num;i++) {
			sum=sum+(long)Math.pow(i, i);
			System.out.println("i: "+i);
			System.out.println(sum);
		}
		System.out.println(sum);
	}
}
