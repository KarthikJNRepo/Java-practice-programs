package Assesment;

public class Assesment49 {
	public static void main(String[] args) {
	roman(543);	
}

static void roman(int num) {
	int[] number= new int[] {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	String[] roman = new String[] {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	String result="";
	for(int i=0;i<=number.length-1;i++) {
		while(num>=number[i]) {
			result += roman[i];
			num = num-number[i];
		}
		if(num==0) {
			break;
		}
	}
	System.out.println(result);

}
}
