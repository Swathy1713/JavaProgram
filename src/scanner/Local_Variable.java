package scanner;

public class Local_Variable {
	
	public void add() {
		// TODO Auto-generated method stub
		
		int e,f; //Local Variable
		e=20;
		f=e;
		System.out.println(f);

	}
	
	public static void main(String[] args) {
		Local_Variable v = new Local_Variable();
		v.add();
	}

}
