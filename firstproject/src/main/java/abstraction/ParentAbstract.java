package abstraction;

public abstract class ParentAbstract {
public abstract void display() ;
public void normalMethod(String name) {
	System.out.println("Normal method"+name);
}
public ParentAbstract() {
	System.out.println("default constructor");
}
public abstract void parameterAbstract(int age);

}
