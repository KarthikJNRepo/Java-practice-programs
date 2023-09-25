package Assesment;

import java.util.Scanner;

public class Assesment08And09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number x");
		int x=sc.nextInt();
		sc.close();
		byte couter = 0;
		
		while(x>0) {
			x=x/10;
			couter++;
		}
		System.out.println(couter);
	}

}
