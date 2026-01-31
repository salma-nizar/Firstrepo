package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPrgrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList <String>l1=new ArrayList<String>();
 l1.add("White");
 l1.add("green");
 l1.add("orange");
 l1.add("grey");
 l1.add("yellow");
 System.out.println(l1);
 
 ArrayList<String> l2=new ArrayList<String>();
 l2.add("bike");
 l2.add("car");
 l2.add("bus");
 l2.add("ship");
 l2.add("Train");
 System.out.println(l2);
 
 //addAll()-add two lists
 System.out.println(l1.addAll(l2));
 System.out.println(l1);
 
 //containsAll()-to check whether the list is present or not in an another list

 
 System.out.println(l1.containsAll(l2));
 System.out.println(l2.containsAll(l1));
 
 //Iterator
 Iterator<String> i=l1.iterator();
 while(i.hasNext()
		 ) {
	 System.out.println(i.next());
 }
 i.remove();
 System.out.println(l1);
 
 
 
 
	}

}

