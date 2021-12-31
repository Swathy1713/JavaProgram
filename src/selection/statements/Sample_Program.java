package selection.statements;

public class Sample_Program {

	public static void main(String[] args) {
		
		int a = 20;
		int b= 30;
		int c = 10;
		int d = 5;
		
		if(a>b && a<c && a>b) {
			System.out.println("A is Larger number");
		}
		
		else if (b>a && b>c && b>b ) {
			System.out.println("B is larger number");
			
		}
		 
		else if (c>a && c>b && c>d) {
			System.out.println("C is larger number");
			
			
		}
		
		else {
			System.out.println("D is larger number");
		}
	}		

}
