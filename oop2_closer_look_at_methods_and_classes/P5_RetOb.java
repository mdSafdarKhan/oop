package oop2_closer_look_at_methods_and_classes;

//Returning an object.
class Test {
	int a;

	Test(int a) {
		this.a = a;
	}

	Test incrByTen() {
		Test temp = new Test(a + 10);
		return temp;
	}
}

public class P5_RetOb {
	public static void main(String[] args) {
		Test obj1 = new Test(2);
		Test obj2;

		obj2 = obj1.incrByTen();

		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		obj2 = obj2.incrByTen();
		System.out.println(obj2.a);
	}
}
