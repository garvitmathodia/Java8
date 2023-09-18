package work;

@FunctionalInterface
interface P1
{
	public void m1(int a, int b);
}


public class lamdaDemo{
	
public static void main(String[] args) {
	P1 parent = (a,b)->System.out.println(a+b);
	parent.m1(12, 23);
}
	
}
