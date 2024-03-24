package AbstractClass;

public class Test {
public static void main(String[] args) {
	//we can not create a object of abstract class , 
	//but we can create a reference variable of abstract class 
	//MobileUser mu=new MobileUser();
	
	//Syntax :ClassName(superclass) reference variable
	MobileUser mu;
	mu=new Karim();
	mu.sendMassage();
	mu.call();
	
	
	mu=new Rahim();
	mu.call();
	mu.sendMassage();
}
}
