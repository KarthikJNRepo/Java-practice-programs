package Assesment;

import java.util.Scanner;

public class Assesment10And11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter popsitive number x");
		int sum=1;
		
		for(int x=sc.nextInt();x>=1;x--) {
			sum=sum*x;
			System.out.print(x+"*");
		}
		System.out.println();
		System.out.println("factorial of a number"+sum);
		
		
		
		  Boolean flag=true; for(int i=2;i<=sum/2;i++) { if(sum%i==0) { flag = false;
		  }} if(flag==true) { System.out.println("prime number"); }
		  else{System.out.println("not a prime n umber"); }
		 
	}

}
