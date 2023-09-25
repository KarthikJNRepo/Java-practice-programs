package Assesment;

public class Assesment20 {
	public static void main(String[] args) {
		System.out.println(divide(8, 6));
	}
	static double divide(int divided,int divisor) {
		double counter=0;
		double counter1=0;
		boolean sign=((divided<0)|(divisor<0))?true:false;
		divided=Math.abs(divided);
		divisor=Math.abs(divisor);
		
		
		
		if(divided<divisor) {
			divided=divided*10;
			while(divided>=divisor) {
				counter1=counter1+0.1;
				divided-=divisor;
			}
			if(sign==true) {
				counter=counter+counter1;
				counter1=-counter1;		
			}
			return counter1;
			}
		else {
			while(divided>=divisor) {
				counter++;
				divided-=divisor;
			}
		}
		
		
		
		if(divided>0) {
			divided=divided*10;
			while(divided>=divisor) {
				counter1=counter1+0.1;
				divided-=divisor;
			}
			counter=counter+counter1;
		}
		
		
		if(sign==true) {
			counter=-counter;	
		}
		
		return counter;
	}
}
