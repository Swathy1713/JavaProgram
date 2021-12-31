package inheritance;

public class Division {
	
	//single Inheritance Parent class
	
	public void div() {
		int x, y, z;
		x = 40;
		y = 5;
		z = x / y;
		System.out.println("Division of x and y is " + z);
	}

	public static void main(String[] args) {
		Division d = new Division();
		d.div();
	}


}
