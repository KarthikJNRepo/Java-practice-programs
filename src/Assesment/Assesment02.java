package Assesment;

import java.util.Scanner;

public class Assesment02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		  System.out.println("enter number : "); 
		  int n=sc.nextInt();
		  Boolean flag=true;
	  
		  for(int i=2;i<=n/2;i++) { if(n%i==0) { flag = false; }} 
		  if(flag==true) { System.out.println("prime number"); } 
		  else{System.out.println("not a prime n umber"); }	 

		// 1 to x prime number.

		
		  System.out.println("enter to where you need:"); int m = sc.nextInt(); int
		  counter=0;
		  
		  for(int i=3;i<=m;i++) { Boolean flag1=true; for(int j=2;j<=i/2;j++) {
		  if(i%j==0) { flag1=false; break; } } if(flag1==true) {
		  System.out.print(i+" "); counter++; }
		  
		  } System.out.println("\n"+counter);
	}

}
