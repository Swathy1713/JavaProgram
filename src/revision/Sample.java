package revision;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import collections.Hash_Set;

public class Sample {

	public static void main(String[] args) {

		Set<Object> s1 = new TreeSet<Object>();
		
		s1.add(50);
		s1.add(3.54);
		s1.add('A');
		s1.add("JAVA");
		s1.add("Selenium");
	
		System.out.println(s1);
		
		int size = s1.size();
		System.out.println(size);
		
		
	}

}