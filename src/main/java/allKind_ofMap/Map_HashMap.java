package allKind_ofMap;

import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_HashMap {

	public static void main(String[] args) {
		//Map<String, Integer> map=new HashMap<String, Integer>();
		Map<String, Integer> map=new HashMap<>();
		      //key and value = keySet
		map.put("Mina", 70);//1st String (Duplicate)will count but 1st integer will not count
		map.put("Rina", 80);
		map.put("Tina", 90);
		map.put("Mina", 60);// 2nd Integer will count
		System.out.println(map);
		
		
		Set<String> keys=map.keySet();
		for (String k : keys) {
			System.out.println(k+"  "+map.get(k));
		}
			System.out.println("...........................");
		//Same
		/*for(Entry<String, Integer> eachmp:map.entrySet()) {
			System.out.println(eachmp.getKey()+"  "+eachmp.getValue());
		}*/
			for (Entry<String, Integer> eachmap : map.entrySet()) {
				System.out.println(eachmap.getKey()+" "+eachmap.getValue());
			}
			System.out.println(map.size());//size 3
			System.out.println(map.get("Mina"));//we will get value
		System.out.println(map.containsKey("Tina"));//True or false
		map.clear();//Remove all map items ( True / false)
		System.out.println(map.size());// size = 0
	}

}
