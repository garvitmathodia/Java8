package work;

@FunctionalInterface
interface MyInterface{
	public void sayHello();
}

public class MyLamda {
public static void main(String[] args) {
	MyInterface mi = ()->{
		System.out.println("hello");
	};
	
	mi.sayHello();
}
}
