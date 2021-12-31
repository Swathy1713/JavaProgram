package revision;

public class Numbers_Swapping {
	
	public static void main(String[] args) {
		
		int a=20;
		int b=15;
		int c=10;
		int d;
		System.out.println("Before Swapping");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println("After Swapping");
		d=a;
		a=b;
		b=c;
		c=d;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println("After Swapping");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
	}

}
