package work;

import java.util.Optional;

public class OptionalClass {
public static void main(String[] args) {
	Optional<String> name = getName(1);
//	if(name.isPresent()) {
//		System.out.println(name.get());
//	}
	
//	name.ifPresent(System.out::println);
	
	String nameToBeUsed = name.orElse("NA");
	System.out.println(nameToBeUsed);
	
}


private static Optional<String> getName(int id) {
//	String name = null;
	
//	return Optional.ofNullable(name);
	return Optional.of("ram");
}
}
