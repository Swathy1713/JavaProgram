package concepts;

public class Meth_Overriding extends Meth_Overloading{
	
	@Override
	public void subject() {
		System.out.println("Mathematics");
		super.subject();
	}
	
	@Override
	public void subject(int a) {
		System.out.println("Environmental Science : " +a);
		super.subject(100);
	}
	
	@Override
	public void subject(String b) {
		System.out.println(b);
		super.subject("Social Science");
	}
	
	@Override
	public void subject(int a, int b) {
		System.out.println("English Paper I : " +a+ "English Paper II :" +b);
		super.subject(100, 80);
	}
	
	@Override
	public void subject(String a, String b) {
		System.out.println(a + b);
		super.subject("Tamil I", "Tamil II");
	}
	
	@Override
	public void subject(int a, int b, int c) {
		System.out.println("Total Marks" +a);
		System.out.println("Obtained Marks" +b);
		System.out.println("Rank " +c);
		super.subject(500, 460, 2);
	}
	
	public static void main(String[] args) {
		Meth_Overriding m = new Meth_Overriding();
		m.subject();
		m.subject(80);
		m.subject(90, 80);
		m.subject("Tamil paper I", "Tamil paper II");
		m.subject(500, 450, 4);
	}

}
