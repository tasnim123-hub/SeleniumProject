package allKindOfSet;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetOfSet {

	public static void main(String[] args) {
		Set<Integer> SSN=new TreeSet<Integer>();
		SSN.add(100);//2nd    //Ascending Order
		SSN.add(200);//3rd
		SSN.add(300);//4rth
		SSN.add(100);//Duplicate not allow
		SSN.add(000);//first
		System.out.println(SSN);
		System.out.println("...........................");
		System.out.println(SSN.size());
		System.out.println(".............................");
		for (Integer i : SSN) {
			System.out.println(i);
		}
		
		
		
		Set<String> emp=new TreeSet<String>();
		//Ascending order
		emp.add("Tasnim");
		emp.add("Dawsi");
		emp.add("Darimee");
		emp.add("Marnia");
		emp.add("Tasnim");//Duplicate is not allow
		
		 Iterator<String> i=emp.iterator();
		 while (i.hasNext()) {
			System.out.println(i.next()); 
			}
		 System.out.println("...................");
		 System.out.println(emp.contains("Marnia"));
		 System.out.println(emp.hashCode());
		
		 
		 SortedSet<Integer> sorted =new TreeSet<Integer>();
		 sorted.add(200);//2nd
		 sorted.add(300);//3rd
		 sorted.add(00); //1st
		 sorted.add(200);//Duplicate not allow
		 System.out.println(sorted);
		 System.out.println(sorted.first());
		 System.out.println("............................");
		 System.out.println(sorted.last());
		 System.out.println(sorted.headSet(300));//300 will remove
		 System.out.println(sorted.tailSet(200));//0 will remove--
		 System.out.println("...........................");
		 Iterator<Integer> j=sorted.iterator();
		 while (j.hasNext()) {
			System.out.println(j.next());
			
		}
	}

}
