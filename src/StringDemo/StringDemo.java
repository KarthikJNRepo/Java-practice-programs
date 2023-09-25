package StringDemo;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = s1.concat("");
		String s3 = s2.intern();
		String s4 = "Java";
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);

	}

}
