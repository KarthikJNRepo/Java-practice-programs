package Assesment;

import java.util.Scanner;

public class Assesment31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3  numbers: ");
		System.out.println(sumOfNumber(sc.nextInt(),sc.nextInt(),sc.nextInt()));
	}

 static int sumOfNumber(int i, int j, int k) {
	 if(i==j) 
		return i;
	 else if(k==i || k==j)
	 	return i+j;
	 else 
		 return i+j+k;
 }
}
 


