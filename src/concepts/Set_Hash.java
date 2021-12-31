package concepts;

import java.util.HashSet;
import java.util.Set;

public class Set_Hash {
	public static void main(String[] args) {
		Set<Object> s1 = new HashSet<Object>();
		Set<Object> s2 = new HashSet<Object>();
		Set<Object> s3 = new HashSet<Object>();
		
		s1.add(50);
		s1.add(50);
		s1.add(3.54);
		s1.add('A');
		s1.add("JAVA");
		s1.add("Selenium");
		System.out.println(s1);
		
		s2.add(null);
		s2.add(null);
		s2.add(5.65);
		s2.add("Java");
		s2.add("Python");
		System.out.println(s2);
		
		s3.addAll(s1);
		System.out.println(s3);
		
		boolean contains = s1.contains("JAVA");
		System.out.println(contains);
		
		boolean empty = s1.isEmpty();
		System.out.println(empty);
		
		int size = s2.size();
		System.out.println(size);
		
		s3.clear();
		System.out.println(s3);
		
		
	}

}
