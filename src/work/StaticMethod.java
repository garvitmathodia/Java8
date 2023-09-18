package work;

interface L{
	public static void sayHello() {
		System.out.println("helo");
	}
}
public class StaticMethod {

	public static void main(String[] args) {

		StaticMethod staticMethod = new StaticMethod();
		L.sayHello();
	}
}
