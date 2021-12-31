package scanner;

public class Class_Variable {
	
	int a=20 ;//declaring class variable
	public void add() {
		int b = 20;
		int c = b;
		System.out.println(b);

	}
	
	public static void main(String[] args) {
		Class_Variable v = new Class_Variable();
		v.add();
		System.out.println(v.a); //no need to create seperate reference name
	}

}
