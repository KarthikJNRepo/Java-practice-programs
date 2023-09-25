package Assesment;

import java.util.Scanner;

public class Assesment28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum=sum+(i*i);	
		}
		System.out.println("the sum of 1^2 + 2^2 + 3^2 +….. N^2: "+sum);
	}
}
