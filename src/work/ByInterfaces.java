package work;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class ByInterfaces {
public static void main(String[] args) {
	BiPredicate<Integer, Integer> predicate = (x,y) -> x%2 ==0 && y%2 ==0;
	System.out.println(predicate.test(2, 10));
	
	BiFunction<Integer, Integer, Integer> function = (x,y) -> x+y;
	Integer apply = function.apply(2, 4);
	System.out.println(apply);
	
	BiConsumer<Integer, Integer> consumer = (x,y) -> {
		System.out.println(x+y);
	};
	
	consumer.accept(1,2);
	
	
	
}
}
