package revision;

public class Reverse_String {
	
	public static void main(String[] args) {
		
		String str = "My name is Swathy"; //create a string
		System.out.println("Original String: " +str);
		char[] ch = str.toCharArray(); //converting the string to array of char
		int chlen = ch.length;   //find the length of array
		System.out.println("Length: " +chlen); 
		
		for (int i = chlen-1; i >=0 ; i--) {
			System.out.print(ch[i]);
		}
		
	
		//Method 2
		System.out.println("\n*********************************");
		
		String rev = "";
		for (int i = chlen-1; i >=0 ; i--) {
			rev = rev + str.charAt(i);
		}
	
		System.out.println(rev);
	
		
		//Method3
		System.out.println("\n*********************************");
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		//Method4
		System.out.println("\n*********************************");
		
		StringBuilder stb = new StringBuilder(str);
		System.out.println(stb.reverse());
		
	}

}
