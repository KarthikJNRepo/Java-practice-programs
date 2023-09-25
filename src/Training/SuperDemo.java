package Training;

class Parent {
	String name = "parent";

	public Parent() {
		System.out.println("parent defalt constructor" + "  -->    " + this.name);
	}

	Parent(String s) {
		this();
		this.name = s;
		System.out.println("parent parameterized constructor" + "   ->" + name);
	}
}

class Child extends Parent {
	String name = "child";

	public Child() {
		this("son");
		// TODO Auto-generated constructor stub
		System.out.println("child defalt constructor" + "   ->" + this.name);
		System.out.println("child defailt accesing parent class variable using super keyword" + " ->   " + super.name);
	}

	Child(String s) {
		super("dad");
		// super.print();
		this.name = s;
		System.out.println("child parameterized constructor" + "   ->" + name);

	}

}

public class SuperDemo<T extends Number> {
	public static void main(String[] args) {
		Child c = new Child();
	}

}
