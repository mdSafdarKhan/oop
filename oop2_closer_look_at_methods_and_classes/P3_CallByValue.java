package oop2_closer_look_at_methods_and_classes;

//Primitive types are passed by value.
public class P3_CallByValue {

	void test(int a, int b) {
		a *= 10;
		b *=3;
	}
	
	public static void main(String[] args) {
		P3_CallByValue obj = new P3_CallByValue();
		int a=10;
		int b=20;
		System.out.println("Before a " + a + ", b " + b);
		obj.test(a, b);
		System.out.println("After a " + a + ", b " + b);
	}
}
