package Assesment;

import java.util.Scanner;

public class Assesment05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number x");
		int x=sc.nextInt();
		
		if(x>=-2 && x<=13) {
			System.out.println("Yesss!!");
		}
		else {
			System.out.println("no!!!");
		}
	}

}
