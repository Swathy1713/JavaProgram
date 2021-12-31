package inheritance;

public class Juice {
	
	public void mango() {
		// TODO Auto-generated method stub
		System.out.println("Mango Juice");
	}
	
	public static void main(String[] args) {
		Juice j = new Juice();
		Juicee j1 = new Juicee();
		Juiceee j2 = new Juiceee();
		
		j.mango();
		j1.apple();
		j2.orange();
	}

}
