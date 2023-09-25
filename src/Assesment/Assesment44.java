package Assesment;

public class Assesment44 {
	public static void main(String[] args) {
		int a=0,b=0,c=0;
		int asquare=0,bsquare=0,csquare=0,total=0;
		for(a=1;a<=1000;a++) {
			for(b=1;b<=1000;b++) {
				for(c=1;c<=1000;c++) {
					asquare=a*a;
					bsquare=b*b;
					csquare=c*c;
					total=a+b+c;
					if((asquare+bsquare)==csquare && total==1000) {
						System.out.println(a+" "+b+" "+c);
						System.out.print(" " +(asquare+bsquare+csquare));
						break;
					}	
				}
				if((asquare+bsquare)==csquare && total==1000) {break;}	
		}
			if((asquare+bsquare)==csquare && total==1000) {break;}
	}
}
}
