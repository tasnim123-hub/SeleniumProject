package learnCollection;

import java.util.LinkedList;
import java.util.List;



public class LearnLinkList {

	public static void main(String[] args) {
		List<String>name=new LinkedList<String>();
		name.add("Tas");
		name.add("Daw");//duplicate allow
		name.add("Daw");
		name.add("Mar");
		name.add("Mom");
		name.add("sar");
		System.out.println(name.get(0));
		System.out.println("...........................");
System.out.println(name.size());
System.out.println("...................................");
for (String eachname : name) {
	System.out.println(eachname);
}
System.out.println("...........................");
name.add("Rima");
System.out.println(name.size());
System.out.println("................................");

System.out.println(name.remove(0));
System.out.println("..............................");
System.out.println(name.contains("Mom"));//this item there have or Not?
System.out.println("....................................");
for (int i = 0; i < name.size(); i++) {
	System.out.println(name.get(i));
	}
System.out.println(".................................");
name.clear();//All clear
System.out.println(name.isEmpty());//true
System.out.println("................................");
System.out.println(name.size());
	}

}
