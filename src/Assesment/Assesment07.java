package Assesment;

import java.util.Scanner;

public class Assesment07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number x");
		int x=sc.nextInt();
		
		if(x<5 && x>27) {
			System.out.println("no!!!");
		}
		else {
			System.out.println("Yesss!!");
		}
	}

}
