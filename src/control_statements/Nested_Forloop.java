package control_statements;

public class Nested_Forloop {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5 ; j >= i; j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}

