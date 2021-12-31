package concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_Iterator {
	
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("abc");
		l.add("def");
		l.add("ghi");
		l.add("jkl");
		l.add("mno");
		
		ListIterator<String> li = l.listIterator();
		while (li.hasNext()) {
			if(li.previous().equals("def")) {
			System.out.println(li.previous());
		}
	}
	}

}
