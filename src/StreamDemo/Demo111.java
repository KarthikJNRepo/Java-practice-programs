package StreamDemo;

import java.util.stream.Stream;

public class Demo111 {
	public static void main(String[] args) {
		Character[] carArray= {'a','n','d','f','h'};
		Stream.of(carArray).forEach(x->System.out.print(Character.toUpperCase(x)+" "));
	}

}
