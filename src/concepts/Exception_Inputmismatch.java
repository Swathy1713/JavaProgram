package concepts;

import java.util.Scanner;

public class Exception_Inputmismatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int nextInt = sc.nextInt();
			System.out.println(nextInt);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Input Mismatch Exception");
		}
		finally {
			System.out.println("Enter the correct input");
		}
		
	}
}
