package inheritance;

public class Addition extends Division{
	//single Inheritance child class
	
	public void add() {
		int x,y,z;
		x = 10;
		y=20;
		z=x+y;
		System.out.println("Addition of x and y is " +z);
	}
	
	public static void main(String[] args) {
		Addition m = new Addition();
		m.add();
		m.div();


}
	
}
