package oop3_inheritence;

class Animal {

	int x = 1;

	void show() {
		System.out.println("Animal show()");
	}
}

class Bufallo extends Animal {

	int x = 100;

	void show() {
		System.out.println("Bufallo show()");
	}
}

class Cow extends Animal {

	int x = 1000;

	void show() {
		System.out.println("Cow show()");
	}
}

public class P5_Dispatch {

	public static void main(String[] args) {
		Animal obj1 = new Animal();
		Bufallo obj2 = new Bufallo();
		Cow obj3 = new Cow();
		
		Animal ref; //obtain a reference of type Animal
		
		ref = obj1;	//ref refers to an Animal object
		ref.show();	//call Animal's version of show()
		System.out.println(ref.x);
		
		ref = obj2; //ref refers to Bufallo object
		ref.show();	//call Bufallo's version of show()
		System.out.println(ref.x);
		
		ref=obj3;	//ref refers to Cow object
		ref.show();	//call Cow's version of show()
		System.out.println(ref.x);
	}

}
