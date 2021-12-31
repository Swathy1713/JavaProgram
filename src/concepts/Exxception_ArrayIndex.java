package concepts;

public class Exxception_ArrayIndex {
	
	public static void main(String[] args) {
		int a[] = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 15;
		System.out.println(a[2]);
		try {
			System.out.println(a[5]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Array Index out of bound Exception");
		}
		
		String b[] = new String[1];
		b[0] = "Swa";
		System.out.println(b[0]);
	}

}
