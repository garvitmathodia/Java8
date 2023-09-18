package work;

import java.util.function.Function;

public class FunChain {

	public static void main(String[] args) {
		Function<String, String> function1 = s -> s.toUpperCase();
		Function<String, String> function2 = s -> s.substring(0,3);
		
		Function<String, String>  function3 = function1.andThen(function2);
		
		function3.apply("garvit");
	}
}
