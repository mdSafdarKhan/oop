package oop2_closer_look_at_methods_and_classes;
/**
 * As soon as the UseStatic class is loaded, all of the static statements are run. First, a is
set to 3, then the static block executes, which prints a message and then initializes b to a*4
or 12. Then main( ) is called, which calls meth( ), passing 42 to x. The three println( )
statements refer to the two static variables a and b, as well as to the local variable x.
 * @author Safdar.Khan
 *
 */
public class P8_UseStatic {
	static int a = 3;
	static int b;

	static void meth(int x) {
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	static {
		System.out.println("static block initialized");
		b = a * 4;
	}

	public static void main(String[] args) {
		//System.out.println(b);
		meth(42);
	}
}
