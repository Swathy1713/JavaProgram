package concepts;

public class Exception_Nullpointer {
	
	public static void main(String[] args) {
		
		try {
			String s =null;
			System.out.println(s.toLowerCase());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("NullPointer Exception");
		}
	
	}

}
