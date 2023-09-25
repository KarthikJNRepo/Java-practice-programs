package New;
// Java Program to illustrate addThen() method

// Importing interface
import java.util.function.Function;

// Main class
public class FunctionalInterface {

	// main driver method
	public static void main(String args[])
	{
		// Function which takes in a number and
		// returns half of it
		Function<Integer, Double> half = a -> a + 5.0;

		// Now treble the output of half function
		half = half.compose(a -> 3 * a);

		// Applying the function to get the result
		// and printing on console
		System.out.println(half.apply(10));
		 Function<Integer, Integer> i = Function.identity();
		 i=i.andThen(x->x*4);
		 System.out.println(i.apply(10));
		 String s="karthi";
		 
	}
}
