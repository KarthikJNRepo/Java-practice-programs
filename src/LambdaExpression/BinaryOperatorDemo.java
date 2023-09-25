package LambdaExpression;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
	public static void main(String[] args) {
		BinaryOperator<Integer> add=(val1,val2)->val1+val2;
		add.apply(2, 2);
		
	}

}
