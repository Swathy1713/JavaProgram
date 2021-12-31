package collections;

import java.util.List;
import java.util.Vector;

public class List_Vector {
	
	public static void main(String[] args) {
		
		List<Object> a1 = new Vector<Object>();
		List<Object> a2 = new Vector<Object>();
		List<Object> a3 = new Vector<Object>();
		
		a1.add(5.0);
		a1.add(450);
		a1.add(3.54);
		a1.add('C');
		a1.add("Java");
		a1.add("Selenium");
		System.out.println(a1);
		
		a2.add(25);
		a2.add(450);
		a2.add(5.65);
		a2.add("Java");
		a2.add("Python");
		System.out.println(a2);
		
		int size = a2.size();
		System.out.println(size);
		
		Object object = a1.get(2);
		System.out.println(object);
		
		Object set = a1.set(0, 50);
		System.out.println(set);
		System.out.println(a1);
		
		int indexOf = a2.indexOf("Python");
		System.out.println(indexOf);
		
		boolean contains = a2.contains(5.65);
		System.out.println(contains);
		
		a3.addAll(a1);
		System.out.println(a3);
		
		a1.retainAll(a2);
		System.out.println(a1);
		
		a1.removeAll(a1);
		System.out.println(a1);
		
		a2.remove("Java");
		System.out.println(a2);
		
		a3.clear();
		System.out.println(a3);
		
		
		
		
	}

}
