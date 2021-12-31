package concepts;

import java.util.ArrayList;
import java.util.List;

public class List_Array {
	
	public static void main(String[] args) {
		
		List <Object> l1 = new ArrayList<Object>();
		List <Object> l2 = new ArrayList<Object>();
		List <Object> l3 = new ArrayList<Object>();
		
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
		
		int size = l1.size();
		System.out.println(size);
		
		Object obj = l1.get(3);
		System.out.println(obj);
		
		Object remove = l1.remove(2);
		System.out.println(remove);
		System.out.println(l1);
		
		Object set = l2.set(2, 'c');
		System.out.println(set);
		System.out.println(l2);
		
		boolean contains = l2.contains("Java");
		System.out.println(contains);
		
		Object index = l1.indexOf(100);
		System.out.println(index);
		
		Object last = l1.lastIndexOf("abc");
		System.out.println(last);
		
		l3.addAll(l2);
		System.out.println(l3);
		
		l3.retainAll(l1);
		System.out.println(l3);
		
		l2.remove("Java");
		System.out.println(l2);
		
		l2.removeAll(l1);
		System.out.println(l2);
		
		
		
	}

}
