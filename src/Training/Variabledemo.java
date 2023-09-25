package Training;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class variable {
	static int n;
	// static final int n2;

	void method() {
		int n1 = 1;
		System.out.println(n1);
	}
}

public class Variabledemo {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,2,3,4,2,1,65,4);
		l.stream().distinct().sorted().forEach(x->System.out.print(x));
		System.out.println("\n*************************************");
		
		variable v = new variable();
		System.out.println(variable.n);
		v.method();
	}

}
