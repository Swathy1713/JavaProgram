package concepts;

public class StringMethods_2 {

	public static void main(String[] args){
		String s1 = "Java is a simple programming language";
		String s2 = " Selenium ";
		String s3 = " ";
		String s4 = "www.facebook.com";

		boolean empty = s3.isEmpty();
		System.out.println(empty);
		
		System.out.println(s2);
		String trim = s2.trim();
		System.out.println(trim);
		
		int length = s1.length();
		System.out.println(length);
		
		System.out.println("************************");
		String[] split = s1.split("\\s");
		for (String a : split) {
			System.out.println(a);
		}
		System.out.println("************************");
		String[] split1 = s4.split("\\.");
		for (String b : split1) {
			System.out.println(b);
			
		}
		
		System.out.println("************************");
		String[] split3 = s1.split(" ");
		for (String c : split3) {
			System.out.println(c);
		}
		
		System.out.println("************************");
		String[] split4 = s1.split(" " , 3);
		for (String d : split4) {
			System.out.println(d);
		}
	}
}