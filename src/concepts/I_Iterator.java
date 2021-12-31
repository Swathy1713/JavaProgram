package concepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class I_Iterator {
	
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		l.add("abc");
		l.add("def");
		l.add("ghi");
		l.add("jkl");
		l.add("mno");
		
		Iterator<String> l1 = l.iterator();
		/*while (l1.hasNext()) {
			System.out.println(l1.next());
		}*/
		
		while (l1.hasNext()) {
			if (l1.next().equals("abc") )
				System.out.println(l1.next());
			
		}
	}

}
