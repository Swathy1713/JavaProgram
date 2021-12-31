package revision;

public class Ascending_Order {
	
public static void main(String[] args) {
		int a[] = new int[] {40,55,60,87,22,10};
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);	
		}
		System.out.println("Ascending Order:");
		int b;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i]<a[j]) {
					b=a[i];
					a[i] = a[j];
					a[j] = b;		
				}
			}
		}
		for (int i : a) {
			System.out.println(i);
			
		}
	}

}
