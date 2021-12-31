package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Hash_Set {
	
	public static void main(String[] args) {
		
		Set<Object> s = new HashSet<Object>();
		Set<Object> s1 = new HashSet<Object>();
		Set<Object> s2 = new HashSet<Object>();
		
		s.add(50);
		s.add(30);
		s.add(23);
		s.add("Java");
		s.add(30);
		s.add(null);
		System.out.println(s);
		
		s1.add(50);
		s1.add(35);
		s1.add('A');
		s1.add("Java");
		s1.add(33);
		s1.add(null);
		System.out.println(s1);
		
		int size = s.size();
		System.out.println(size);
		
		s2.addAll(s);
		System.out.println(s2);
		
		boolean equals = s.equals(60);
		System.out.println(equals);
		
		s.add(20);
		System.out.println(s);
		
		s.retainAll(s1);
		System.out.println(s);
		
		s2.removeAll(s1);
		System.out.println(s2);
		
		s2.clear();
		System.out.println(s2);
				
	}

}
