package work;

interface KammWala{
	String getSalary();
	String getDesignation();
}

public class Anonymous {
	
	public static void main(String[] args) {
		
		KammWala kammWala = new KammWala() {
			
			@Override
			public String getSalary() {
				
				return "10";
			}
			
			@Override
			public String getDesignation() {
				
				return "kuch kaam ni krrta";
			}
		};
		
		System.out.println(kammWala.getSalary());
		System.out.println(kammWala.getDesignation());
		
	}
	
		
	
 
}
