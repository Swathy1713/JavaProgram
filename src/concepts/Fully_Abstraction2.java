package concepts;

public class Fully_Abstraction2 implements Fully_Abstraction1 {

	@Override
	public void password() {
		System.out.println("Password");
		
	}

	@Override
	public void personal_infromation() {
		System.out.println("Swathy");
		
	}

	@Override
	public void date_Of_Birth() {
		System.out.println("17/11/1998");
		
	}
	
	public static void main(String[] args) {
		Fully_Abstraction2 a = new Fully_Abstraction2();
		a.password();
		a.date_Of_Birth();
		a.personal_infromation();
	}

}
