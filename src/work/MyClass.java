package work;



interface Parent{
	default void sayHello() {
		System.out.println("hello");
	}
}

class Child implements Parent{
	public void sayHello() {
		System.out.println("child hello");
	}
}

public class MyClass {

	public static void main(String[] args) {
		Parent parent = new Child();
		
		parent.sayHello();
	}
}
