package stringprgrm;

public class Bufferbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer s=new StringBuffer("hello ");
StringBuilder s1=new StringBuilder("salma");
System.out.println(s);
System.out.println(s1);

//insert()-to insert new string
System.out.println(s.insert(6,"Morning"));
System.out.println(s);

//append()-add the new string at at the last
System.out.println(s.append(s1));

//replace()-to replace a word to another-specify the start index and end index

System.out.println(s.replace(6, 13, "world"));

// delete()

System.out.println(s.delete(11, 16));

//reverse()
System.out.println(s.reverse());
	}

}
