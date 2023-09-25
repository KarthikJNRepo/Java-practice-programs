package Training;

class Parent01 {
	String name = "parent";

	Parent01() {
		System.out.println("parent constructor");
	}
}

class child01 extends Parent01 {
	String name = "child";

	child01() {
		// super();
		System.out.println(super.name);
	}
}

public class SuperClassDemo {
	public static void main(String[] args) {
		child01 c1 = new child01();

	}

}
