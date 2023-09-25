package Assesment;

public class Assesment22 {
	public static void main(String[] args) {
		int a=1221;
		int sum=0;
		int temp;
		temp=a;
		while(a>0) {
			int rem=a%10;
			sum = sum*10+rem;
			a=a/10;
		}
		System.out.println(sum);
		
		
		if(temp==sum) {
			System.out.println("palidrome");
		}else {
			System.out.println("not palidrome");
		}
	}

}
