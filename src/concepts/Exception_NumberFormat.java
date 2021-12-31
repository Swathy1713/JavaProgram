package concepts;

public class Exception_NumberFormat {
	
	public static void main(String[] args) {
		String s ="Java";
		try {
			int parseInt = Integer.parseInt(s);
			System.out.println(parseInt);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.err.println("Number Format Exception");
		}finally {
			System.out.println("Selenium");
		}
	}

}
