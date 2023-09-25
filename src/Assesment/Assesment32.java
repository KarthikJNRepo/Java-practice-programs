package Assesment;

public class Assesment32 {
	public static void main(String[] args) {
		System.out.println(sum(1,1,13));
	}
	 static int sum(int a, int b, int c) { 
		 if(a==13)
			 return 0;
		 else if(b==13)
			 return a;
		 else if(c==13)
			 return a+b;
		 else
			 return a+b+c;
	 }
}
