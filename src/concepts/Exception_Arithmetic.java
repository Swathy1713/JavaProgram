package concepts;

public class Exception_Arithmetic {
	
	public static void main(String[] args) {
		int a=20;
		System.out.println(a);
		/*try { 
			int b=30;
			System.out.println(b/0);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
		System.out.println("Selenium");*/
		
		try {
			int b=30;
			System.out.println(b/0);
		} catch (Exception e) {
			System.err.println("Arithmetic Exception");
		}finally {
			System.out.println("Automation");
		}
		
		System.out.println("Selenium");
	}
	

}
