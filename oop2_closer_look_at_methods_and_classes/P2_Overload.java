package oop2_closer_look_at_methods_and_classes;

//Demostrate method overloading

public class P2_Overload {

	void test() {
		System.out.println("No parameters");
	}

	// Overload test for two integer parameters.
	void test(int a, int b) {
		System.out.println("a and b: " + a + " " + b);
	}

	// Overload test for a double parameter
	void test(double a) {
		System.out.println("Inside test(double) a: " + a);
	}
	
	/*
	void test(int a) {
		System.out.println("Inside test(int) a: " + a);
	}*/

	public static void main(String[] args) {
		P2_Overload ob = new P2_Overload();
		int i = 88;
		ob.test(i);
		ob.test(123.25);
	}
}
