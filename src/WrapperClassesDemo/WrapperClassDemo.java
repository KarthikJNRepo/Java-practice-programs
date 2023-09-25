package WrapperClassesDemo;

public class WrapperClassDemo {
	public static void main(String[] args) {
		/*
		 * Primitive to Wrapper class(autoboxing) (automatic by cimpiler after java1.5)
		 * Wrapper to Primitive (unautoboxing) (automatic by cimpiler after java1.5)
		 * *********************** ***********************************
		 * 
		 * (class.valueOf(primitive or string);primitive and string to wrapper
		 * 
		 * (object.xxxValue();) wrapper to primitive. 
		 * 
		 * (object.toString();) primitive to string and wrapper to string
		 * 
		 * (class.parsexxx(string);)string to primitive
		 */

		// primitive to wrapper (class.valueOf(primitive);
		int i = 1;
		Integer i1 = Integer.valueOf(i);
		// To prove
		/*
		 * if(i1 instanceof Integer) { System.out.println("integer class"); }
		 */

		// wrapper to primitive. (object.xxxValue();)
		Integer i2 = i1;
		int i3 = i1.intValue();

		// primitive to string and wrapper to string (object.toString();)
		System.out.println(i1.toString() + i1.toString());// 1+1 =11

		// string to primitive(class.parsexxx(string);)
		String s = "2";
		System.out.println(Integer.parseInt(s) + Integer.parseInt(s));// 2+2=4

		// string to wrapper
		System.out.println(Integer.valueOf(s) + Integer.valueOf(s));// 2+2=4

		System.out.println(Integer.valueOf("8", 16));

		

	}

}
