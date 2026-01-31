package collection;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		
List <String> li=new ArrayList<String>();
//System.out.println(li);

//add()-to add elements
li.add("red");
li.add("blue");
li.add("black");
li.add("black");
li.add(null);
li.add(null);
System.out.println(li);

//indexOf()- returns the index of the given element
//it returns first occurrence when the element is repeated
System.out.println(li.indexOf("black"));

//lastIndexOf()- returns the last index of the repeated  element
System.out.println(li.lastIndexOf("black"));


//get()- returns the element based on the index
System.out.println(li.get(1));

//contains()- checks whether the element is present or not
System.out.println(li.contains("red"));
System.out.println(li.contains("white"));


//remove()- removes elements based on index  or object based

System.out.println(li.remove(4));
System.out.println(li.remove(null));
System.out.println(li);

//isEmpty()- checks whether the collection is empty or not
System.out.println(li.isEmpty());

//size()- returns the size of the list
System.out.println(li.size());

//for loop-used to iterate elements using index

for(int i=0;i<li.size();i++)
{
	System.out.println(li.get(i));
}

//for each loop-used to iterate elements directly
for(String a:li) {
	System.out.println(a);
}

}
}
