package concepts;

public class Meth_Overloading {
	
	public void subject() {
		System.out.println("Maths");
	}
	
	public void subject(int a) {
		System.out.println("Science : " +a);
	}
	
	public void subject(String b) {
		System.out.println(b);
	}
	
	public void subject(int a, int b) {
		System.out.println("English I : " +a+ "English II :" +b);
	}
	
	public void subject(String a, String b) {
		System.out.println(a + b);
	}
	
	public void subject (int a, int b, int c) {
		System.out.println("Total Marks" +a);
		System.out.println("Obtained Marks" +b);
		System.out.println("Rank " +c);
	}
	
	public static void main(String[] args) {
		Meth_Overloading c = new Meth_Overloading();
		c.subject();
		c.subject(100);
		c.subject("Social Science");
		c.subject(100, 80);
		c.subject("Tamil I", "Tamil II");
		c.subject(500, 460, 2);
	}

}
