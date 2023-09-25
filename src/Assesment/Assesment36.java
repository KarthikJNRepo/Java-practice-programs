package Assesment;

public class Assesment36 {
	public static void main(String[] args) {
		System.out.println(makeChocolate(4,2,7));
		
	}
	
	public static int makeChocolate(int small, int big, int goal) {
		int rem = goal % 5;
		 if(rem==0) {
			return -1;
		}
		else {
			return rem;
		}
			
		}
		
	}



