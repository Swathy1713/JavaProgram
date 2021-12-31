package concepts;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class List_Linked {
	
	public static void main(String[] args) {
		List <Object> l1 = new LinkedList<Object>();
		List <Object> l2 = new LinkedList<Object>();
		List <Object> l3 = new LinkedList<Object>();
		
		l1.add(100);
		l1.add("Java");
		l1.add(100);
		l1.add('a');
		l1.add("abc");
		System.out.println(l1);
		
		l2.add(25);
		l2.add(null);
		l2.add('b');
		l2.add("Java");
		l2.add("Python");
		System.out.println(l2);
		
		//Collections.sort(l1);  
		System.out.println(l2);
		
		int size = l1.size();
		System.out.println(size);
		
		Object object = l1.get(1);
		System.out.println(object);
		
		Object set = l1.set(2, 200);
		System.out.println(set);
		System.out.println(l1);
		
		int indexOf = l1.indexOf('a');
		System.out.println(indexOf);
		
		int lastIndexOf = l2.lastIndexOf("Python");
		System.out.println(lastIndexOf);
		
		boolean contains = l2.contains("Selenium");
		System.out.println(contains);
		
		l3.addAll(l1);
		System.out.println(l3);
		
		l2.remove("Java");
		System.out.println(l2);
		
		l3.clear();
		System.out.println(l3);
		
		l2.retainAll(l1);
		System.out.println(l2);
		
		l2.removeAll(l1);
		System.out.println(l2);
		
	}

}
