package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Func {

	public static void main(String[] args) {
		
		Function<String, Integer> function1 = x -> x.length();
		Function<String,String> function2 = s -> s.substring(0,3);
		
//		System.out.println(getLength.apply("Garvit"));
		List<Student> result = new ArrayList<>();
		Function<List<Student>, List<Student>> student = li -> {
			for(Student s : li) {
				if(function2.apply(s.getName()).equalsIgnoreCase("cha")) {
					result.add(s);
				}
			}
			return result;
		};
		
		Student student2 = new Student(1, "Chatur");
		Student student3 = new Student(1, "Charur");
		Student student4 = new Student(1, "Charihar");
		Student student5 = new Student(1, "ikka");
		
		List<Student> students = Arrays.asList(student2,student3,student4,student5);
		List<Student> apply = student.apply(students);
		System.out.println(apply);
		
	}
	
	
	
	
	private static class Student{
		private int id;
		private String name;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + "]";
		}
		public Student(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		
	}
	
	
			
}
