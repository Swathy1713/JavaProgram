package collections;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Concurrent_Hash_Table_Map {
	
	public static void main(String[] args) {
		 
		Map<Integer, String> map4 = new ConcurrentHashMap<Integer, String>();
		 //will not accept null
		map4.put(1, "One");
		map4.put(2,"Six");
		map4.put(1, "One");
		map4.put(2, "Two");
		map4.put(3, "Four");
		map4.put(3, "Five");
		
		System.out.println(map4);
		
	    int size = map4.size();
	    System.out.println(size);
	    
	    String string = map4.get(3);
	    System.out.println(string);
	    
	    boolean containsKey = map4.containsKey(1);
	    System.out.println(containsKey);
	    
	    boolean containsValue = map4.containsValue("One");
	    System.out.println(containsValue);
	    
	    Set<Integer> keySet = map4.keySet();
	    System.out.println(keySet);
	    
	    Collection<String> values = map4.values();
	    System.out.println(values);
	    
	    Set<Entry<Integer, String>> entrySet = map4.entrySet();
	    System.out.println(entrySet);
			
	}

}
