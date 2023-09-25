package Assesment;

public class Assesment37 {
	public static void main(String[] args) {
		
		int number=122,rem=0;
		boolean flag=false;
		while(number>0) {
			rem=number%10;
			if(rem==1) {
				flag=true;
				break;
			}
			number=number/10;
		}
		System.out.println(flag);
		
	}

}
