package scanner;

import java.util.Scanner;

public class Class_Scanner {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the content");
		String nextLine = s.nextLine();
		System.out.println(nextLine);
		
		System.out.println("Enyer the Name");
		String next = s.next();
		System.out.println(next);
		
		System.out.println("Int");
		int nextInt = s.nextInt();
		System.out.println(nextInt);
		
		
		
	}

}
