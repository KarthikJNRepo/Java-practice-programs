package LambdaExpression;


interface demo{
	 int square(int x);
}
public class SimpleLambdaExample {

	public static void main(String[] args) {
		Runnable r= ()->System.out.println("print");
		r.run();
		demo d= (x)-> {System.out.println("print");
		return 1;};
		System.out.println(d.square(30));
	}
}
