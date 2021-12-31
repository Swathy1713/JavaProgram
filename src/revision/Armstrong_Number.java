package revision;

public class Armstrong_Number {
	
	public static void main(String[] args) {
		
		int n = 370;
		int temp = n;
		int r,sum=0;
		
		while (n > 0) {
			r= n % 10; // 370 % 10 = 0
			n = n/10;  // 370 / 10 = 37
			sum = sum + r*r*r;			
		}
		if (temp==sum) 
			System.out.println("It is a Armstrong Number");
		else
			System.out.println("It is not a Armstrong Number");
			
		
	}

}
