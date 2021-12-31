package collections;

import java.util.LinkedList;
import java.util.List;

public class List_Linked {
	
	public static void main(String[] args) {
		
		List<Object> a1 = new LinkedList<Object>();
		List<Object> a2 = new LinkedList<Object>();
		List<Object> a3 = new LinkedList<Object>();
		
		a1.add(50);
		a1.add(45);
		a1.add(3.54);
		a1.add('A');
		a1.add("JAVA");
		a1.add("Selenium");
		System.out.println(a1);
		
		a2.add(25);
		a2.add(45);
		a2.add(5.65);
		a2.add("Java");
		a2.add("Python");
		System.out.println(a2);
		
		int size = a1.size();
		System.out.println(size);
		
		Object object = a2.get(3);
		System.out.println(object);
		
		Object set = a1.set(2, 350);
		System.out.println(set);
		System.out.println(a1);
		
		int indexOf = a1.indexOf("Java");
		System.out.println(indexOf);
		
		boolean contains = a1.contains(45);
		System.out.println(contains);
		
		a3.addAll(a1);
		System.out.println(a3);
		
		a1.retainAll(a2);
		System.out.println(a1);
		
		Object remove = a2.remove(0);
		System.out.println(remove);
		System.out.println(a2);
		
	
		
		a3.removeAll(a2);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a2);
		
		
		
		
		
	}

}
