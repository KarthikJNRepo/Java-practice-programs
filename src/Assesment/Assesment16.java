package Assesment;

import java.util.Scanner;

public class Assesment16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		int b=1;
		System.out.println("fibonacci series upto? : ");
		int fib=sc.nextInt();
		for(int i=1;i<=fib;i++) {
			System.out.println(a);
			int c=a+b;
			b=a;
			a=c;
			
		}
	}

}
