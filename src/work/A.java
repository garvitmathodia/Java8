package work;

@FunctionalInterface
interface A{
	public void m1();
//	public void m2();
//	and it cannot be empty
	
	default void m2() {
		
	}
	
	public static void m3() {
		
	}
}




