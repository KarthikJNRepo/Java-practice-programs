package Exception;

public class UncheckedExceptionDemo {
	public static void main(String[] args) {
		
		//ArithmaticException
		try {
			System.out.println(0/4);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			//e.getStackTrace();
			e.printStackTrace();
		}
		
		
		//NullPointerException
		try {
			int[] a = new int[3];
			System.out.println(a[3]);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		//
		
		
		System.out.println("end");
		
	}

}
