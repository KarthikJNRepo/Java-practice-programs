package Assesment;

import java.util.Scanner;

public class Assesment19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int x= sc.nextInt();
		System.out.println(" Enter second number : ");
		int y = sc.nextInt();
		int sum=0;
		for(int i=1;i<=y;i++) {
			sum=sum+x;	
		}
		System.out.println(sum);	
	}		
		
}


