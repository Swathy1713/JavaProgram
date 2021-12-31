package scanner;

public class Static_Variable {
	
	static int x = 10;
	
public static void add() {
	// TODO Auto-generated method stub
	int y = 20;
	int z = x+y;
	System.out.println(z);
			

}

public static void add1() {
	// TODO Auto-generated method stub
	
	int f = 20;
	int g=30;
	int h = f+g;
	System.out.println(h);

}
public static void main(String[] args) {
	add();
	add1();
	System.out.println(x);
}

}
