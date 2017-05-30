package com.mithun.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionHelper {
	
	public static void main(String[] args) {
/*		List<String> lst = new ArrayList<>();
//		lst.add(45);
		lst.add("lkjaoif");
		lst.add("some");
		lst.add("things");
		
		List<String> lst1 = new ArrayList<> ();
		lst1.add("second");
		lst1.add("list");
		lst1.add("some");
		
//		lst.addAll(lst1);
		lst1.retainAll(lst);
//		lst.add(4.5);
		
//		Iterator<String> iter = lst.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
//		int i = 0;
//		while(i < lst.size()) {
//			System.out.println(lst.get(i));
//			i++;
//		}
		
		for(String s : lst1) {
			System.out.println(s);
		}*/
		Map<String, String> myMap = new HashMap<>();
		myMap.put("name", "Mithun");	
		myMap.put("age", "28");	
		myMap.put("profession", "Trainer");	
		Set<Map.Entry<String, String>> entrySet = myMap.entrySet();
		
		Iterator<Entry<String, String>> iter = entrySet.iterator();
		while(iter.hasNext()) {
			Entry<String, String> e = iter.next();
//			System.out.println(e.getValue());
			if(e.getKey().equals("name"))
				e.setValue("Mithun Kumer Ghose");
			System.out.println(e.getValue());
		}
	}

}
