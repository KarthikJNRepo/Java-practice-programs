package Training;

class test{
	final int x;
	test(){
		x=1;
	}
}

public class Amount {
	public static void main(String[] args) {
		int amount =2350;
		int finalmoney = 0;
		for (int i = 1; i < 12; i++) {
			amount = amount + amount;
			finalmoney = (int) (amount*0.72/100);		
		}
		System.out.println(finalmoney);
	}

}
