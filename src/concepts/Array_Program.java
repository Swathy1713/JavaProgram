package concepts;

public class Array_Program {

	public static void main (String[] args){
		int a[] = new int[4];
		a[0] = 23;
		a[1] = 42;
		a[2] = 97;
		a[3] = 23;

		/*System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);*/

		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}

	}

}
