package EqualsAndoperatorFunction;

public class EqualsandOperator {
public static void main(String[] args) {
	String s1 = new String("karthi");
	String s2 = "karthi";
	/*
	 * if (s1 == s2) { System.out.println("== uses content"); } if (s1.equals(s2)) {
	 * System.out.println("equals uses content"); }
	 */

	Integer n = 127;
	Integer n1 = 127;
	
	/*
	 * if (n1 == n) { System.out.println("== uses content");}
	 * 
	 * if (n1.equals(n)) { System.out.println("equals uses content"); }
	 */
	
	Boolean c=true;
	Boolean c1=true;
	 if (c1 == c) { System.out.println("== uses content");}
	 if (c1.equals(c)) { System.out.println("equals uses content"); }
}

}
