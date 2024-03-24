package learn.Constructor;

public class Human {
   String name, gender;
   int idNo;
   
   //default Constructor
     Human(){
	System.out.println("No data");
     }
     //Parameterize constructor
     Human(String n,String g){
    	name = n;              //Value declare
    	gender = g;
     }
     
     Human(String n, String g, int i){
    	name =n;  //Value declare
    	gender = g;
    	idNo = i;
     }
     
     void displayInfo() {
    	 System.out.println("Name:" + name);
    	 System.out.println("Gender:" + gender);
    	 System.out.println("IdNo:"+ idNo);
     }
     public static void main(String[] args) {
    	 // create of constructor 
		Human human = new Human ();
		human.displayInfo();
		
		Human human1 = new Human("Mamun", "Male");
		human1.displayInfo();
		
		Human human2 = new Human("Tina","Femail",1001);
		human2.displayInfo();
	}
     //Value assign in Java
     /*byte b = 10;
     byte c = b;
     int x = 23;
     String nam = "Mina"; */
     }
