package New;

class MyException extends Exception{
	public MyException(String s) {
		super(s);
	}
}

public class DEmo012 {
	public static void main(String[] args) {
		String s="a";
		String s1= "B";
		System.out.println("s=\"Aa\"  hashcode value ->"+s.hashCode());
		System.out.println("s1= \"BB\" hashcode value ->"+s1.hashCode());
		try {
			throw new MyException("i throw the exception");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("*****************END******************");
	}
}
