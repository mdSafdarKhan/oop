package oop2_closer_look_at_methods_and_classes;

class Outer{
	int outer_x = 10;
	
	void test() {
		Inner inner = new Inner();
		inner.display();
	}
	
	//this is an inner class
	class Inner{
		
		int inner_y = 90; //inner_y is local to Inner
		
		void display() {
			System.out.println(outer_x);
		}
	}
	
	void showy() {
		//System.out.println(inner_y); //error, inner_y not know here
	}
}

public class P9_InnerClassDemo {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.test();
	}
}
