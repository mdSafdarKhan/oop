package oop2_closer_look_at_methods_and_classes;

class Outer1{
	int outer_x = 100;
	
	void test() {
		for(int i=0; i<10; i++) {
			class Inner{
				void display() {
					System.out.println(outer_x);
				}
			}
			Inner inner = new Inner();
			inner.display();
		}
	}

}

public class P10_InnerClassDemo2 {
	public static void main(String[] args) {
		Outer1 outer = new Outer1();
		outer.test();
	}
}
