package Training;

class Parent1 {
	Parent1() {
		System.out.println("Parent");
	}
}

class Child1 extends Parent1 {
	Child1() {
		System.out.println("Child");
	}
}

public class Fam {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		if (c1 instanceof Parent1) {
			System.out.println("print");
		}
		char b = 's';
		String c = null;
		// Parent1 p1 = new Child1();
		int a = b;
		System.out.println(a + "   " + c);
	}

}
