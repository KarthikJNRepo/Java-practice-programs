package Assesment;

public class Assesment21 {
	public static void main(String[] args) {
		int a=193;
		int sum=0;
		while(a>0) {
			int rem=a%10;
			sum +=rem;
			a=a/10;
		}
		System.out.println(sum);
	}

}
