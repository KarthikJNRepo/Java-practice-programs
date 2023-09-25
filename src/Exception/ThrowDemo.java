package Exception;

public class ThrowDemo {
	class karthi{
		
	}
	public static void main(String[] args)throws ArithmeticException {
	
		try {
			int a =4/0;
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("****************");
		throw new ArithmeticException("dbckjdbjkc");
	}

}

