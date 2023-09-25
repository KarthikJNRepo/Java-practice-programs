package Assesment;

public class Assesment40 {
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int sum=0;
		
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int fib=0;fib<=4000000;) {
			fib=a+b;
			a=b;
			b=fib;
			
			System.out.print(fib+" ");
			if(fib%2 == 0 && fib <= 4000000)
				sum +=fib;	
		}
		System.out.println("\n"+(sum+2));
	}

}
