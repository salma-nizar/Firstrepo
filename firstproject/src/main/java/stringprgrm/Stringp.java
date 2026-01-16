package stringprgrm;

public class Stringp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="salma";
System.out.println(s);

String d=new String("hello");
System.out.println(d);

//length() method-to find the length of string
System.out.println(s.length());
// charAt()-to get specific character
System.out.println(s.charAt(2));
//concat()-to add two strings
System.out.println(s.concat(d));
//contains()-to check the character or word present in a string,there is present it return true else false.
System.out.println(s.contains("a"));
System.out.println(s.contains(d));
//touppercase()-to convert small to capital letters.
System.out.println(s.toUpperCase());
//tolowercase()-to convert capital letter to small letters.
System.out.println(s.toLowerCase());
//equals()method-to check the string is equal,returns true or false

String s1="java";
String s2="Java";
String s3="java";
String s4= new String("java");

System.out.println(s1.equals(s3));
System.out.println(s1.equals(s2));


//equalsIgnoreCase()-to check the string is equal or not ,ignore the case

System.out.println(s1.equalsIgnoreCase(s2));
System.out.println(s1==s3);
System.out.println(s1==s4);
System.out.println(s1.equals(s4));

//isEmpty()-to check the string empty or not,if empty it returns true otherwise false

System.out.println(s.isEmpty());

String s5= "";
System.out.println(s5.isEmpty());

//valueOf()-convert any datatype to string

int a=10;
System.out.println(String.valueOf(a));


//trim()-to remove the leading and trailing whitespace
String f=" hel lo ";
System.out.println(f.trim());

//substring()-to extract the part of string
 String r="student name is";

System.out.println(r.substring(5));
System.out.println(r.substring(2,9 ));





	}

}
