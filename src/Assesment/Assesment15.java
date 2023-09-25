package Assesment;

import java.util.Scanner;

public class Assesment15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number x");
		int x=sc.nextInt();
		int counter=0;
		int y=x;
		int z=y;
		int sum=0;
		while(x>0) {
			counter+=1;
			x=x/10;
		}
		for(int i=1;i<=counter;i++)
		{
			int rem=y%10;
			sum=sum+((int)(Math.pow(rem, counter)));
			y=y/10;
		}

		System.out.println();
		if(z==sum) {
			System.out.println("amstrong");
		}
		else {
			System.out.println("not amstrong");
		}
	}

}
