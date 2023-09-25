package Assesment;

public class Assesment25 {
	public static void main(String[] args) {

		   int n1 = 15, n2 = 5, n3=4,lcm;

		    lcm = (n1 >= n2 && n1>=n3) ? n1 : (n2 >= n1 && n2>=n3) ? n2:n3;
		    System.out.println(lcm);
		    
		    while(true) {
		    	if(lcm%n1==0 && lcm%n2==0 && lcm%n3==0) {
		    		System.out.println("lcm of two numbers are:"+lcm);
		    		break;
		    	}
		    	lcm++;
		    }
}
}
