package work;

public class ThreadDemo {
public static void main(String[] args) {
	Runnable runnable = ()->{
		for(int i = 0 ; i<5 ; i++)
			System.out.println("child Thread");
	};
	
	Thread t = new Thread(runnable);
	t.start(); 
	for(int i = 0 ; i<5 ; i++)
		System.out.println("main thread");
}
	

}
