package test;


public class ArrayList {

	public static void main(String[] args) {
		
		/* There have 2 Type of Data
		  Primitive Data And Non Primitive Data
		 Primitive Data = byte , long , Short, integer, double, float, Char, boolean,
		Non Primitive = String , Interface , Array.*/
		//Syntax
		//for each loop
		/*for(DataType  eachCollection : Collection) {
			Statement(eachCollection);
		}*/
		
		
		
		
		int [] ph = {123, 234, 345, 456, 567};
		
		System.out.println(ph.length);
		System.out.println(ph[0]);
		
		 for (int n : ph) {
			System.out.println(n);
		}
			
		
		System.out.println("........................");
		
		char [] ch1 = {'B','A','C','F','D'};
		System.out.println(ch1.clone());//BACFD
		System.out.println(ch1);//BACFD
		
             for (int i=0; i<=4; i++) {
			System.out.println(ch1[i]);
             }
		System.out.println(".........................");
		
		String [] emp = new String [5];
		 emp [0] = "Tas";
		 emp [1] = "Daw";
		 emp [2] = "Mar";
		 emp [3] = "Shipa";
		 
		 System.out.println(emp.length);
		 System.out.println(emp[2]);
		 
		 for (String eachEmp : emp) {
			System.out.println(eachEmp);
		}
		 
	System.out.println("............................");
		for(int j=0; j<emp.length; j++) {
		System.out.println(emp[j]);	
		} 
		System.out.println("..............................");
		
		String [] name= {"Shipa","Ripa","Nipa"};
		System.out.println(name.hashCode());//Just Number Can Get from internally
			System.out.println(name[2]);
		
		
	}

}
