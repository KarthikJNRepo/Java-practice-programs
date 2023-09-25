package Training;


class Overloading{
	protected int a=11;
	int b=2;
	void m1() {
		System.out.println("defaulkt method");
	}
	
int m1(int a) {
		System.out.println(a);
		return 0;
	}
	
	
	
	
}

public class OverloadingMain {
	public static void main(String[] args) {
		
		Overloading o1 = new Overloading();
		Overloading o2 = new Overloading();
		System.out.println(o2.a);
		
		System.out.println(o1.a=10);
		o1.m1(3);
		
	}
	
}
