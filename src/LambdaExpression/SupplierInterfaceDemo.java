package LambdaExpression;

import java.util.function.Supplier;

public class SupplierInterfaceDemo {
	public static void main(String[] args) {
		Supplier<String> StringSupplier= ()->new String("karthi"); 
		String name = StringSupplier.get();
		System.out.println(name);
	}

}
