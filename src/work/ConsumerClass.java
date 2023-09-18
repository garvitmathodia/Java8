package work;

import java.util.function.Consumer;

public class ConsumerClass {
public static void main(String[] args) {
	 Consumer<String> consumer = (s) -> System.out.println(s);
	 consumer.accept("Garvit");
}
}
