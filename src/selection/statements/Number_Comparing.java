package selection.statements;

public class Number_Comparing {
	public static void main(String[] args) {
		int a, b, c, d;
		a = 10;
		b = 20;
		c = 40;
		d = 25;

		if (a > b && a > c && a < d) {
			System.out.println("a");
		}

		else if (b > a && b > c && b > d) {
			System.out.println("b");
		}

		else if (c > a && c > b && c > b) {
			System.out.println("c");
		}

		else {
			System.out.println("d");
		}
	}

}
