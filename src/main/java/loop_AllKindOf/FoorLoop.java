package loop_AllKindOf;

public class FoorLoop {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i =i+1) {
			System.out.println(i);
		}
		System.out.println(".................................");
		
		for (int i =2; i < 10; i =i+2) {
			System.out.println(i);
			}
		System.out.println("'''''''''''''''''''''''''''''''''");
		
		for (int i =1; i<=10; i=i+2) {
			System.out.println(i);
		}
		System.out.println("''''''''''''''''''''''''''");
		
		for (int j = 3; j <=30; j=j+3) {
			System.out.println(j);
		}
		
		//while Loop
		
		int i = 1; 
		while (i <=20) {
			System.out.println(i);
			i++;
		}
		System.out.println("...........................");
 //Do while Loop
		int j= 2;
		do {
			System.out.println(j);
			j=j+3;
		}while(j<=30);
	} 

}
