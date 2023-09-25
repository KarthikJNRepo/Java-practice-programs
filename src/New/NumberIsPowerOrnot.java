package New;

import java.math.BigInteger;

public class NumberIsPowerOrnot {

	public static void main(String[] args) {
		int n=4;
		System.out.println((n>0 && (n&n-1)==0));
		String num=BigInteger.valueOf(2).pow(1000).toString();
		System.out.println(num);
		int res=0;
		for(char c: num.toCharArray()) {
			res=res+(int)c;
		}
		System.out.println(res);
			
	}	
}
