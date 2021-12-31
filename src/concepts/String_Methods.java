package concepts;

public class String_Methods {

	public static void main(String[] args){
		String s = "Java is Simple Programming Language";
		
		int length = s.length();
		System.out.println(length);
		
		boolean equal = s.equals("Java is simple Programming Language");
		System.out.println(equal);
		
		boolean equalIgnore = s.equalsIgnoreCase("Java is simple Programming Language");
		System.out.println(equalIgnore);
		
		String upper = s.toUpperCase();
		System.out.println(upper);
		
		String lower = s.toLowerCase();
		System.out.println(lower);
		
		boolean start = s.startsWith("J");
		System.out.println(start);
		
		boolean end = s.endsWith("g");
		System.out.println(end);
		
		boolean contain = s.contains("Simple");
		System.out.println(contain);
		
		int indexof = s.indexOf('a');
		System.out.println(indexof);
		
		int lastindexof = s.lastIndexOf('a');
		System.out.println(lastindexof);
		
		char a = s.charAt(2);
		System.out.println(a);
		
		String replace = s.replace("Simple" , "Complex");
		System.out.println(replace);
		
		String substring = s.substring(4);
		System.out.println(substring);
		
		String substring2 = s.substring(4, 23);
		System.out.println(substring2);
		
		String concat = s.concat("Selenium");
		System.out.println(concat);


	}
}
