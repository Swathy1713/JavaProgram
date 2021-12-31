package revision;

public class Prime_Number {
	
	public static void main(String[] args) {
		for (int i = 2; i <=10; i++) {
			boolean isPrimeNumber = true;
			for (int j = 2; j < i; j++) {
				if (i%j==0) {
					isPrimeNumber = false;
					break;
				}
			}
			if (isPrimeNumber) {
				System.out.println(i+" ");
			}
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
