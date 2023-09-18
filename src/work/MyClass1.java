package work;

interface M{
	default void sayHello() {
		System.out.println("hello");
	}
}

interface N{
	default void sayHello() {
		System.out.println("b hello");
	}
}


public class MyClass1  implements M,N{
	public static void main(String[] args) {
		MyClass1 class1 = new MyClass1();
		class1.sayHello();
	}

	@Override
	public void sayHello() {
		
		System.out.println("Own Implementation");
		M.super.sayHello();
		N.super.sayHello();
	}

}
