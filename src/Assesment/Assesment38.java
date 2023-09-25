package Assesment;

public class Assesment38 {
  public static void main(String[] args) {
	System.out.println(divide(120));
}

static boolean divide(int num) {
	int val = num;
	while(val>0) {
		int digit = val%10;
		if(digit == 0 || num%digit != 0) {
			return false;
		}
		val=val/10;
	}
	return true;
}
	
	
}
