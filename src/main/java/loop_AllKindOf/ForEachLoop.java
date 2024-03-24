package loop_AllKindOf;

public class ForEachLoop {

	public static void main(String[] args) {
		/*Syntax of for each loop
		
		for(DataType EachCollection: Collection){
		Statement (EachCollection);
	}*/
		
		String[]name=new String[4];
		name[0]="Shipa";
		name[1]="Ripa";
		name[2]="Nipa";
		name[3]="Lupa";
		System.out.println(name.length);
		 
		for(String eachName:name) {
			System.out.println(eachName);
		}
		
		System.out.println("........................................");
		 
		 String[] Args= {"Mina", "Tina", "Rina", "Bina"};
		 System.out.println(Args.length);
		 
		 for(String each:Args) {
			 System.out.println(each);
			 System.out.println("............................");
		 }
	}

}
