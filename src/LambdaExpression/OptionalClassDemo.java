package LambdaExpression;

import java.util.Optional;

public class OptionalClassDemo {
	public static void main(String[] args) {
		String s="karthi";
		
		Optional<String> empty= Optional.empty();
		System.out.println(empty);
		
		Optional<String> same= Optional.of("karthi");
		System.out.println(same);
		System.out.println(same.get());
		System.out.println(same.hashCode());
		System.out.println(same.isPresent());
		
		
		
		Optional<String> checkNull= Optional.ofNullable(null);
		if(checkNull.isPresent()) {
			System.out.println("print");
		}else {
			System.out.println("null");
		}
	}

}
