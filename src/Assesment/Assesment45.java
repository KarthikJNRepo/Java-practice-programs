package Assesment;

import java.math.BigInteger;

public class Assesment45 {
	public static void main(String[] args) {
		/*
		 * int num = 2; int power = 63; long powerValve = 1L; long sumValue = 0L;
		 * 
		 * 
		 * for (int i = 1; i <= power; i++) { powerValve = powerValve * num; }
		 * 
		 * powerValve=(long) Math.pow(num,power ); System.out.println(powerValve);
		 * 
		 * 
		 * while(powerValve>0) { int rem= (int) (powerValve%10); sumValue=sumValue+rem;
		 * powerValve=(long)powerValve/10; }
		 */
		
		/*
		 * BigInteger b1= new BigInteger("2"); String valve = b1.pow(2).toString();
		 */
		
		
		String s= BigInteger.valueOf(2).pow(1000).toString();
		System.out.println(s);
		int result=0;
		
		
		for(char c:s.toCharArray()) {
			result += (int)c;
		}
		
		System.out.println(result);
	}

}
