package Training;

import java.util.Objects;

public class A1 implements Interface1, Interface2, Interface4 {

	int a;
	int b;

	@Override
	public int hashCode() {
		return Objects.hash(a, b);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A1 other = (A1) obj;
		return a == other.a && b == other.b;
	}

	public static void main(String[] args) {
		A1 t1 = new A1();

		t1.m1();
		t1.m2();
		t1.m1(null);
		t1.m2(2);
	}

	@Override
	public void m1() {
		System.out.println("method 1");

	}

	@Override
	public void m2() {
		System.out.println("metrhod 2");

	}

	@Override
	public void m2(int a) {
		System.out.println(a);
	}

	@Override
	public String m1(String s) {
		System.out.println(s);
		return "hdfj";

	}
}