package revision;

import java.util.Scanner;

public class Even_Number {

	public static void main(String[] args) {

		for (int i = 0; i < 20; i++) {
			if (i%2==0) {
				System.out.println(i);
			}

		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		if (a%2==0) {
			System.out.println("The given number is even");
		}
		else {
			System.out.println("The given number is odd");
		}
	}

}
