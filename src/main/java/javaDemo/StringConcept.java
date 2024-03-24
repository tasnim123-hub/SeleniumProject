package javaDemo;



public class StringConcept {

	public static void main(String[] args) {
		String text ="String concept";
		String text1="string concept1";
		int num =22;
		int num1=33;
		System.out.println(text);
		System.out.println(text1);
		
		//memory Location
		System.out.println(System.identityHashCode(text));
		System.out.println(System.identityHashCode(text1));
		
		//equal()=method/function (True/False)
		System.out.println(text.equals(text1));
		System.out.println(text.length());
		System.out.println(text.endsWith(text));
		System.out.println("........................");
		String a = "77";
		String b = "44";
		
		int c = 55;
		int d = 66;
		System.out.println(a+b);
		System.out.println(a==b);
		
		System.out.println(c+d);
		System.out.println(c-d);
		System.out.println(c*d);
		System.out.println(c/d);
		
		//trim() = remove white space ,both side of spring
		String line="   Java  String  Concept  ";
		System.out.println(line);
		System.out.println(line.trim());
		System.out.println(line.length());
		
		
		System.out.println(line.toLowerCase());//toLowerCase()/method
		System.out.println(line.toUpperCase());//toUpperCase()/function
		
		System.out.println(line.contains("Concept"));//contains()=true/false
		System.out.println(line.contains("ing"));  //true/false
	}

}
