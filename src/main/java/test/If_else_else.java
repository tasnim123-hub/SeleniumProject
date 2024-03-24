package test;

public class If_else_else {

	public static void main(String[] args) {
		 
		double D = 5.5; //D = Diabetes,  5.5= PreDiabetes, D< 5= Non Diabetes,
		
		if(D <= 5) {
			System.out.println("Diabetes");
			}
		else if(D <  5) {
			System.out.println("Non Diabetes");
		}
		else if (D>8) {
			System.out.println("Poor Diabetes");
		}
		else { 
			System.out.println("Pre Diabetes");
		}
		System.out.println(".......................................");
		
		//Scenario-2
		
		int x = 20;
		
		if ( x > 21) {
			System.out.println("x greater then 21");
		}
		else if (x < 18) {
			System.out.println(" x less then 18 ");
		}
		else if (x <25) {
			System.out.println("x less then 25");
		}
		else {
			System.out.println("x equal to 20");
		}
		System.out.println(".........................................");
		
		int i = 5 ;
		int j = 15 ;
		
		if(i <j) {
			System.out.println("i is less then j");
		}
		else {
			System.out.println(" i is greater then j");
		}
		System.out.println("........................................");
		
		int e = 40;
		int f = 40;
		
		if (e!=f) {
			System.out.println("1");
		}
		else if (e == f) {
			System.out.println("2");
		}
		else if ( e <f) {
			System.out.println("3");
		}
		else {
			System.out.println("4");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}