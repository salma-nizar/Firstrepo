package collection;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<String> s=new HashSet<String>();
		s.add("black");
		s.add("blue");
		s.add("white");
		s.add("white");
		s.add(null);
		System.out.println(s);
		
		System.out.println(s.remove(null));
		System.out.println(s);
		//size()
		s.clear();
		System.out.println(s);
	}

}
