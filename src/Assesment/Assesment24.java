package Assesment;

import java.util.Scanner;

public class Assesment24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number which you need to print table:");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
	}

}
