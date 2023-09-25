package Training;


class Or1{	
	protected   int RollNumber;
	protected  String name;
 void inialize() {
		System.out.println("or1");	
	}	
}


class Or2 extends Or1{	
	void inialize() {
		System.out.println("or2");
		System.out.println(RollNumber);
}

public class Overriding {
	public static void main(String[] args) {
		System.out.println("hiiii");
		Or1 or1=new Or1();
		Or2 or21=new Or2();
		Or1 or22=new Or2();
		or1.inialize();
		or21.inialize();
		or22.inialize();
		
		
	}
}

}
