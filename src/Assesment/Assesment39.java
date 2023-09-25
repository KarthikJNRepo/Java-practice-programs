package Assesment;

public class Assesment39 {
	public static void main(String[] args) {
		multipleOf3And5(1000);
	}

	static void multipleOf3And5(int num) {
		int sum=0;
		for(Integer i=3;i<=num;i++) {
			if(i%3 == 0 || i%5 ==0) {
				System.out.print(i+" ");
				sum +=i; 
			}
		}
		System.out.println("\nThe sum of all the multiples of 3 or 5 is: "+sum);	
	}

}
