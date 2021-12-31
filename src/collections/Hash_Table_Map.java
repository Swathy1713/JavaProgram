package collections;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Table_Map {
	public static void main(String[] args) {
		
		Map<String, Integer> map3 = new Hashtable<String, Integer>();
		
		//will not accept null
		map3.put("Three", 1);
		map3.put("Five", 5);
		map3.put("Two", 2);
		map3.put("One", 1);
		map3.put("One", 5);
		map3.put("Three", 2);
		
		System.out.println(map3);
		
		int size = map3.size();
		System.out.println(size);
		
		Integer integer = map3.get("One");
		System.out.println(integer);
		
		Set<String> keySet = map3.keySet();
		System.out.println(keySet);
		
		Collection<Integer> values = map3.values();
		System.out.println(values);
		
		boolean containsKey = map3.containsKey("Five");
		System.out.println(containsKey);
		
		boolean containsValue = map3.containsValue(5);
		System.out.println(containsValue);
		
		Set<Entry<String, Integer>> entrySet = map3.entrySet();
		System.out.println(entrySet);
		
	}

}
