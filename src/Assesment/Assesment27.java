package Assesment;

import java.util.Scanner;

public class Assesment27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to print sum of number: ");
		int num=sc.nextInt();
		int sum =0;
		for(int i=num;i>=1;i--) {
			System.out.print(i+" ");
			sum=sum+i;
		}
		System.out.println("\nsum of the number "+num+" is: "+sum);
	}

}
