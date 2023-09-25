package Assesment;

import java.util.Scanner;

public class Assesment13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number x");
		int x=sc.nextInt();
		System.out.println("enter number y");
		int y=sc.nextInt();
		System.out.println("enter number z");
		int z=sc.nextInt();
		
		if(x==y && x==z) {
			System.out.println("all three are equal");
		}
		else if (x>y && x>z) {
			System.out.println("greatest number is x"+x);
			if(y<z) 
				System.out.println("smallest number is y"+y);
			else if (z>y) 
				System.out.println("smallest number is z"+z);
			else 
				System.out.println("y and z are equal");	
			}
		else if (y>x && y>z) {
			System.out.println("greatest number is y"+y);
			if(x<z)
				System.out.println("smallest number is x"+x);
			else if (z<x) 
				System.out.println("smallest number is z"+z);
			else 
				System.out.println("x and z are equal");
		}
		else {
			System.out.println("greatest number is z"+z);
			if(x<y)
				System.out.println("smallest number is x"+x);
			else if (y<x) 
				System.out.println("smallest number is y"+y);
			else 
				System.out.println("x and y2 are equal");

		}
		}
	}


