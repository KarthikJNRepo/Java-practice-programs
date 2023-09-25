package Assesment;

import java.util.Scanner;

public class Assesment23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		decimalToBinary(6);
		/*
		 * System.out.println("Enter binary number:"); String a=sc.nextLine(); int
		 * b=Integer.parseInt(a, 2);
		 * System.out.println("Hexadecimal of given number is: "+Integer.parseInt(a,
		 * 2));
		 * System.out.println("Again convertint to binary: "+Integer.toBinaryString(b));
		 */
	}

	static void decimalToBinary(int n) {
		int[] binary = new int[35];
		int id=0;
		
		while(n>0) {
			binary[id]=n%2;
			System.out.println(n%2);
			n=n/2;
			id++;
		}
		for(int i=id-1;i>=0;i--) {
			System.out.print(binary[i]);
		}
		decimal(binary,id);
	}

	static void decimal(int[] binary, int id) {
		int decimal=0;
		System.out.println();
		for(int i=0;i<id;i++) {
			if(binary[i]==1) {
			decimal=decimal+(int)Math.pow(2, i);
			System.out.println(i);
			System.out.println((int)Math.pow(2, i));	
		}
	}
		System.out.println(decimal);
	}
	}



