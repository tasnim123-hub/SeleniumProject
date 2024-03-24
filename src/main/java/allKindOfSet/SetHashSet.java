package allKindOfSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetHashSet {

	public static void main(String[] args) {
		Set<Integer> num =new HashSet<Integer>();
		//Random Order 
		num.add(11);//duplicate not allow
		num.add(22);
		num.add(33);
		num.add(11);
        num.add(000);
        System.out.println(num.size());
        
        for (Integer Allnum : num) {
			System.out.println(Allnum);
			}
        
        System.out.println(".........................");
        
        System.out.println(num.remove(33));
        
       Iterator<Integer> i=num.iterator();
		
	while (i.hasNext()) {
		System.out.println(i.next()); 
		}
			num.clear();
		System.out.println(num.isEmpty());
			
	}	
	}


