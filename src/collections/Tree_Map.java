package collections;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Tree_Map {
	
	
	public static void main(String[] args) {
		
		Map<Integer, String> map5 = new TreeMap<Integer, String>();
		
		map5.put(7, "One");
		map5.put(2, "Three");
		map5.put(1, "Two");
		map5.put(2, "Four");
		map5.put(3, "Zero");
		map5.put(5, "Eight");
		map5.put(6, "Seven");
		map5.put(9, "Six");
        
		/*System.out.println("Tree Map in Ascending Order \n" +map5);
		System.out.println(map5);
		
		Set<Integer> keySet = map5.keySet();
		System.out.println("Ascending Order \n" +keySet);
		
		Collection<String> values = map5.values();
		System.out.println("Ascending Order \n" +values);
		
		int size = map5.size();
		System.out.println(size);
		
		String string = map5.get(5);
		System.out.println(string);
		
		Set<Integer> keySet = map5.keySet();
		System.out.println(keySet);
		
		Collection<String> values = map5.values();
		System.out.println(values);
		
		boolean containsKey = map5.containsKey(2);
		System.out.println(containsKey);
		
		boolean containsValue = map5.containsValue("One");
		System.out.println(containsValue);
		
		Set<Entry<Integer, String>> entrySet = map5.entrySet();
		System.out.println(entrySet);*/
		
		
		
	}

}
