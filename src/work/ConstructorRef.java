package work;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorRef {
	
public static void main(String[] args) {
	
//	ConstructorRef printf = new ConstructorRef();
//	
//	List<String> students = Arrays.asList("garvit" , "dhruv" , "aman");
//	students.forEach(x->System.out.println(x));
//	students.forEach(ConstructorRef::print);
//	students.forEach(printf::printhello);
//	
//}
// 
//public static void print(String s) {
//	System.out.println(s);
//}
//
//public  void printhello(String s) {
//	System.out.println(s);
//

	List<String> names = Arrays.asList("garvit" , "dhruv" , "aman");
	List<Student> students = names.stream().map(x -> new Student(x)).collect(Collectors.toList());
	List<Student> students2 = names.stream().map(Student::new).collect(Collectors.toList());
	
	
	
	
}
}
