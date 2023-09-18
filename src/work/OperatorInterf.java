package work;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorInterf {

	public static void main(String[] args) {
		UnaryOperator<Integer> operator = x ->  x*x;
		Integer apply = operator.apply(2);
		System.out.println(apply);
		
		BinaryOperator<Integer> operator2 = (x,y) -> x+y;
		Integer apply2 = operator2.apply(23, 34);
		System.out.println(apply2);
	}
	
	
	
	
}
