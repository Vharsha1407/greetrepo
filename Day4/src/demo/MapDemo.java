package demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap();
		map.put(12, "rani");
		map.put(13, "raja");
		map.put(14, "kani");
		map.put(15, "jeni");
		
		Set<Entry<Integer,String>>entry=map.entrySet();
		
		for(Entry<Integer,String> entry2:entry) {
			System.out.println(entry2.getKey());
			System.out.println(entry2.getValue());
		}
		System.out.println("#############################");
		Iterator itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		for(Integer k:map.keySet()) {
			System.out.println(k);
			System.out.println(map.get(k));
		}
		
		Iterator<Integer> itr1=map.keySet().iterator();
		while(itr1.hasNext()) {
			Integer key=itr1.next();
			System.out.println(key+ "  "+map.get(key));
		}
		
		
		
		}

}
