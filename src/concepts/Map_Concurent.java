package concepts;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class Map_Concurent {
	
	public static void main(String[] args) {
Map<String, Integer> m1 = new ConcurrentHashMap<String, Integer>();
	    
		m1.put("One", 1);
		m1.put("Two", 1);
		m1.put("Three", 2);
		m1.put("One", 4);
		m1.put("Ten", 11);
		m1.put("Eight", 8);
		m1.put("Six", 9);
		System.out.println(m1);
		
		int size = m1.size();
		System.out.println(size);
		
		boolean containsKey = m1.containsKey("Three");
		System.out.println(containsKey);
		
		boolean containsValue = m1.containsValue(10);
		System.out.println(containsValue);
		
		Set<Entry<String, Integer>> entrySet = m1.entrySet();
		System.out.println(entrySet);
		
		Set<String> keySet = m1.keySet();
		System.out.println(keySet);
		
		Collection<Integer> values = m1.values();
		System.out.println(values);
	}

}
