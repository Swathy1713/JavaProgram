package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Map {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "One");
		map1.put(2, "Two");
		map1.put(null, null);
		map1.put(1, "Three");
		map1.put(3, "Four");
		map1.put(1, null);
		
		System.out.println(map1);
		
		int size = map1.size();
		System.out.println(size);
		
		String string = map1.get(3);
		System.out.println(string);
		
		Set<Integer> keySet = map1.keySet();
		System.out.println(keySet);
		
		Collection<String> values = map1.values();
		System.out.println(values);
		
		boolean containsKey = map1.containsKey(1);
		System.out.println(containsKey);
		
		boolean containsValue = map1.containsValue(null);
		System.out.println(containsValue);
		
		Set<Entry<Integer, String>> entrySet = map1.entrySet();
		System.out.println(entrySet);
		
		
	}

}
