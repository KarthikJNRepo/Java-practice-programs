package Assesment;

public class Assesment50 {

	public static void main(String[] args) {
		for(int i=2;i<=10000000;i++) {
			if(i==10000000)System.out.println(i);
		if(isPrime(i)!=0)
		System.out.println(i);
		}
	}

	
	
	private static int isPrime(int n) {
		int d=0;
		 d=digit(n);
		 if(d==0) return 0; 
		 int num=n;
		 //10 multiple for first number
		 int tens=pow(d-1);
		 
		 for(int i=1;i<=d;i++) {
			 int rem=num%10;
			 num/=10;
			 num=(rem*tens)+num;
			 //calling prime method to check whether number is prime or not.
			 if(!(Prime(num)))return 0;
		 }
		return num;

	}

	
	
	private static boolean Prime(int num) {
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}


	private static int pow(int d) {
		int tens=1;
		for(int i=1;i<=d;i++) {
			tens *=10;
		}
		return tens;
	}



	private static int digit(int i) {
		int d=0;
		while(i>0) {
			d++;
			if(i%2==0)return 0;
			i/=10;
		}
		return d;
	}
	
	
}
