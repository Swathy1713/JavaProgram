package revision;

public class Reverse_Number {

	public static void main(String[] args) {

		int number = 237856;
		System.out.println("Original Number " +number);
		int reverse = 0;
		int remainder;
		while(number !=0){
			remainder = number%10;
			reverse = reverse*10+remainder;
			number = number/10;
		}
		System.out.println("Reversed number " +reverse);
	}

}
