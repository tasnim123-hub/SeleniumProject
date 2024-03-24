package learnCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnaaaaaList {

	public static void main(String[] args) {
		//ArrayList-Step 1:-Create object for ArrayLiust Class 
		//Use all List methods one by one 
		//maintain inserting order
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(50);
		list.add(10);
		list.add(10);
		System.out.println(list);
		
		for (Integer eachname : list) {
			System.out.println(eachname);;
		}
		List<String> name=new ArrayList<String>();
		name.add("123");
		name.add("Tas");
		name.add("Daw");
		name.add("Mar");
		name.add("Mar");
		System.out.println(name);
		System.out.println("........................");
		//count of list 
		System.out.println(name.size());
		System.out.println(".............................");
		for (String eachname1 : name) {
	System.out.println(eachname1);
}
System.out.println(".....................................");
	for (int i = 0; i < name.size(); i++) {
		System.out.println(name.get(i));;
		}
		/*System.out.println("...................................");
		// verifying particular item in the List-true/false
		System.out.println(name.contains("Daw"));
		System.out.println(".............................");
		//Delete particular item from file
		System.out.println(name.remove(3));*/
		System.out.println("...................................");
		
		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i));
			}
		System.out.println("......................................");
		//
		name.clear();
		System.out.println(name.isEmpty());  //true/false
		System.out.println("..............................");
		name.add("ABC");
		System.out.println(name.size());//1
		
		
		
	}
		
	}


