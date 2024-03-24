package allKindOfSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHashSet {

	public static void main(String[] args) {
		
		
		Set<Integer> obj = new LinkedHashSet<Integer>();
		//Inserting order
		obj.add(123);//Duplicate not allow
		obj.add(234);
		obj.add(456);
		obj.add(567);
		obj.add(678);
		obj.add(890);
		obj.add(000);
		obj.add(123);
		System.out.println(obj.size());
		
		for (Integer eachobj : obj) {
			System.out.println(eachobj);
			}
		System.out.println(obj.contains(890));
		
		System.out.println(obj.remove(123));
		for (Integer allobj : obj) {
			System.out.println(allobj);
			}
		System.out.println(obj.size());
		System.out.println("................................");
		obj.clear();
		System.out.println(obj.isEmpty());
	}

}
