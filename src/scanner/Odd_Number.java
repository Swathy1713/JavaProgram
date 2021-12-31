package scanner;

import java.util.Scanner;

public class Odd_Number {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		
		for(int i=1;i<=5;i++) {
			if(i%2==0) {
				System.out.println("Enter the numbers to count");
				int nextInt = sc.nextInt();
			}
		}
	}

}
