package Assesment;

import java.util.Scanner;

public class Assesment26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number:");
		int hcf=1;
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		
		
		int small=num1<num2?num1:num2;
		System.out.println(small);
		
		
		for(int i=small;i>=2;i--) {
			if(num1%i==0 && num2%i==0) {hcf=i;break;}
			System.out.println(small);
		}
		
		
		System.out.println(hcf);
	}

}
