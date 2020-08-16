package oop2_closer_look_at_methods_and_classes;

//Demostrate method overloading
class Overload{
	void test() {
		System.out.println("no parameters.");
	}
	
	void test(int i) {
		System.out.println("i: " + i);
	}
	
	void test(int a, int b) {
		System.out.println("a: " + a + ", b: " + b);
	}
	
	double test(double a) {
		System.out.println("double a : " + a);
		return a*a;
	}
}

public class P1_Overload {
	
	public static void main(String[] args) {
		Overload ob = new Overload();
		double result;
		// call all versions of test()
		ob.test();
		ob.test(10);
		ob.test(10, 20);
		result = ob.test(123.25);
		System.out.println("Result of ob.test(123.25): " + result);
	}
}
