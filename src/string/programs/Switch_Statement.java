package string.programs;

import java.util.Scanner;

public class Switch_Statement {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Week name:" );
		String day = s.next();
		
		
		switch (day) {
		case "Monday":
			System.out.println(1);
			
			break;
			
		case "Tuesday":
			System.out.println(2);
			
			break;
			
		case "Wednesday":
			System.out.println(3);
			
			break;
			
		case "Thursday":
			System.out.println(4);
			
			break;
			
		case "Friday":
			System.out.println(5);
			
			break;
			
		case "Saturday":
			System.out.println(6);
			
			break;
			
		case "Sunday":
			System.out.println(7);
			
			break;
			

		default:
			System.out.println("Invalid");
			break;
		}
	}
	
}
