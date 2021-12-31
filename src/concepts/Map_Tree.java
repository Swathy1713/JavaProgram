package concepts;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map_Tree {
	public static void main(String[] args) {
		Map<String, Integer> m1 = new TreeMap<String, Integer>();
	    
		m1.put("One", 1);
		m1.put("Two", 1);
		m1.put("Three", 2);
		m1.put("One", 4);
		m1.put("Ten", null);
		m1.put("Eight", 8);
		m1.put("Six", null);
		
		System.out.println(m1);
		
		boolean containsKey = m1.containsKey("One");
		System.out.println(containsKey);
		
		boolean containsValue = m1.containsValue(4);
		System.out.println(containsValue);
		
		Set<String> keySet = m1.keySet();
		System.out.println(keySet);
		
		Collection<Integer> values = m1.values();
		System.out.println(values);
		
		Set<Entry<String, Integer>> entrySet = m1.entrySet();
		System.out.println(entrySet);
		
		boolean empty = m1.isEmpty();
		System.out.println(empty);
		
		int size = m1.size();
		System.out.println(size);
		
		Integer integer = m1.get("Three");
		System.out.println(integer);
		
	}

}
