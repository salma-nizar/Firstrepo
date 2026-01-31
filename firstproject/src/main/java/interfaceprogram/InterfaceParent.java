package interfaceprogram;

public interface InterfaceParent {
	public static final int num=2;
	int num2=10;
public abstract void display();
default void example() {
	// num2=30;-->final
	System.out.println("default");
}
public static void example1() {
	System.out.println("static method");
}
}
