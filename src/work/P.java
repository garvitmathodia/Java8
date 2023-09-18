package work;
@FunctionalInterface
interface P {

	public void m1();
}
@FunctionalInterface
interface C extends P{
	public void m1();
//	public void m2();
	
}

//this thing is valid

//@FunctionalInterface
//interface P {
//	
//	public void m1();
//}

//interface C extends P{
//public void m2();
//
//	
//}