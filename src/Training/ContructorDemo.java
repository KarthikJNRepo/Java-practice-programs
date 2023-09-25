package Training;

public class ContructorDemo {

	private int a;
	private int b;
	private int c;


	public ContructorDemo(int a) {
		this.a=a;
	}
	@Override
	public String toString() {
		return "ContructorDemo [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
	public static void main(String[] args) {
		ContructorDemo c= new ContructorDemo(2);
		System.out.println(c);
	}

	
}
