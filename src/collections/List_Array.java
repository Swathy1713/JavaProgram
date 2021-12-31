package collections;

import java.util.ArrayList;
import java.util.List;

public class List_Array {
	
	public static void main(String[] args) {
		
		List<Object> a1 = new ArrayList<Object>();
		List<Object> a2 = new ArrayList<Object>();
		List<Object> a3 = new ArrayList<Object>();
		
		a1.add(50);
		a1.add(45);
		a1.add(3.54);
		a1.add('A');
		a1.add("Java");
		a1.add("Selenium");
		System.out.println(a1);
		
		a2.add(25);
		a2.add(null);
		a2.add(5.65);
		a2.add("Java");
		a2.add("Python");
		System.out.println(a2);
		
		int size = a2.size();
		System.out.println(size);
		
		Object object = a1.get(2);
		System.out.println(object);
		
		Object set = a2.set(0, 20);
		System.out.println(set);
		System.out.println(a2);
		
		int indexOf = a1.indexOf("Java");
		System.out.println(indexOf);
		
		boolean contains = a1.contains('A');
		System.out.println(contains);
		
		a3.addAll(a1);
		System.out.println(a3);
		
		a2.retainAll(a1);
		System.out.println(a2);
		
		a1.remove("Java");
		System.out.println(a1);
		
		a3.removeAll(a2);
		System.out.println(a3);
		
		a2.clear();
		System.out.println(a2);
		
		
		
	}

}
