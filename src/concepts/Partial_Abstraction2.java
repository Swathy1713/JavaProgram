package concepts;

public  class Partial_Abstraction2 extends Partial_Abstraction1 {
	
	@Override
	void customer_Account_number() {
		// TODO Auto-generated method stub
		System.out.println("Account Number : 617153968");
	}
	@Override
	void customer_Address() {
		// TODO Auto-generated method stub
		System.out.println("Address : Coimbatore");
	}
	
	public static void main(String[] args) {
		Partial_Abstraction2 a = new Partial_Abstraction2();
		a.customer_name();
		a.customer_Phone_Number();
		a.customer_Account_number();
		a.customer_Address();
	}
}
