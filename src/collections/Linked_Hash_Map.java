package collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Linked_Hash_Map {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map2 = new LinkedHashMap<Integer, String>();
		
		map2.put(1, "One");
		map2.put(2, null);
		map2.put(1, "One");
		map2.put(2, "Two");
		map2.put(3, "Four");
		map2.put(3, "Five");
		
		System.out.println(map2);
		
		int size = map2.size();
		System.out.println(size);
		
		String string = map2.get(3);
		System.out.println(string);
		
		Set<Integer> keySet = map2.keySet();
		System.out.println(keySet);
		
		Collection<String> values = map2.values();
		System.out.println(values);
		
		boolean containsKey = map2.containsKey(1);
		System.out.println(containsKey);
		
		boolean containsValue = map2.containsValue("Three");
		System.out.println(containsValue);
		
		Set<Entry<Integer, String>> entrySet = map2.entrySet();
		System.out.println(entrySet);
	}

}
