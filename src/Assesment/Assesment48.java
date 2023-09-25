package Assesment;

public class Assesment48 {
	public static void main(String[] args) {
		NumberToCharecter(("9754").toCharArray());
	}
	static void NumberToCharecter(char[] num) {
		int length=num.length;
		if(length==0) {
			System.out.println("empty number");
			return;
		}
		if(length>4) {
			System.out.println("invalid number");
			return;
		}
		String[] single_Digit= new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
		String[] tentoTwenty= new String[] {"ten", "eleven",  "twelve", "thirteen",  "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String[] tens= new String[] {"", "", "twenty",  "thirty", "forty","fifty", "sixty", "seventy", "eighty", "ninety"};
		String[] power= new String[] {"hundred","thousad"};
		if(length==1) {
			System.out.print(single_Digit[num[0]-'0']);
			return;
		}

		int x=0;
		while(x<num.length) {
			//System.out.println(x);
			if(length>=3) {
				if(num[x]-'0' != 0) {
					System.out.print(single_Digit[num[x]-'0']+" ");
					System.out.print(power[length-3]+" ");
				}
				length--;
			}
			else {
				if(x==num.length-2) {
				if(num[x]-'0' == 1) {
					System.out.print(tentoTwenty[num[x+1]-'0']+" ");
					return;
				}
				else if (num[x]-'0' >= 2 && num[x+1]-'0' == 0) {
					
					System.out.print(tens[num[x]]);
					return;
				}
				else {
					if(num[x]-'0' != 0) {
						System.out.print(tens[num[x]-'0']+" ");
					}
				}
				}
				else {
					System.out.println(single_Digit[num[x]-'0']);
				}
			}
			x++;
		}		
		}
	}

