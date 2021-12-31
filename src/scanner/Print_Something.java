package scanner;

import java.util.Scanner;

public class Print_Something {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("This is my content");
	String nextLine = sc.nextLine();
	
	
	System.out.println("Enter the name");
	String a = sc.next();
	
	System.out.println("Enter a number");
	int nextInt = sc.nextInt();
	
	
	System.out.println(nextLine);
	System.out.println(a);
	System.out.println(nextInt);
	
}
}
