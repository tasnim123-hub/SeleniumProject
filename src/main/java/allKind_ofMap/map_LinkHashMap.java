package allKind_ofMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class map_LinkHashMap {

	public static void main(String[] args) {
		//Map<String, Integer> map=new LinkedHashMap<>();
		Map<String, Integer> map=new LinkedHashMap<String, Integer>();
		map.put("Hena", 11);
		map.put("Tina", 22);
		map.put("Ria", 22);
		map.put("poly", 33);
		map.put("Tina", 44);
		for(Entry<String, Integer> eachmap : map.entrySet()) {
			System.out.println(eachmap.getKey()+"  "+eachmap.getValue());
		} //same
		Set<String> keys=map.keySet();
		for (String k : keys) {
			System.out.println(k+" "+map.get(k));
		}
		//TreeMap of Map
		Map<String, String> mp=new TreeMap<String, String>();
		mp.put("ABC", "abc");
		mp.put("BCD", "bcd");
		mp.put("DEF", "def");
		mp.put("ABC", "fgh");
		System.out.println(mp);
		System.out.println(mp.containsKey("DEF"));
		System.out.println(mp.size());
		System.out.println(mp.hashCode());
		System.out.println(mp.get("BCD"));
		mp.clear();
		System.out.println(mp.isEmpty());
	}

}
