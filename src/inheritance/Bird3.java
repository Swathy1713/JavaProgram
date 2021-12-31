package inheritance;

public class Bird3 extends Bird2{
	
	public void crow() {
		// TODO Auto-generated method stub
		System.out.println("Crow is in black colour");
	}
	public static void main(String[] args) {
		Bird3 b3 = new Bird3();
		b3.crow();
		b3.parrot();
		b3.peacock();
	}
}
