package work;

public class LamdaUse {
	public static void main(String[] args) {
		Employee em = () -> "software engineer";
			
			System.out.println(em.getName());
	}

}
