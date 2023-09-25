package Assesment;

public class Assesment43 {
	public static void main(String[] args) {
		int sumOfSquare=0;
		int SquareOfSum=0;
		for(int i=1;i<=100;i++) {
			SquareOfSum=SquareOfSum+(i*i);
			sumOfSquare=sumOfSquare+i;
			//System.out.print(i+" ");
		}
		int diff=(sumOfSquare*sumOfSquare)-SquareOfSum;
		System.out.println("\n"+diff);
	}

}
