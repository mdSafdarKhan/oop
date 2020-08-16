package oop3_inheritence;

class A {
	int i, j;

	void showij() {
		System.out.println("i " + i + ", j " + j);
	}
}

class B extends A {
	int k;

	void showk() {
		System.out.println("k " + k);
	}

	void sum() {
		System.out.println("i+j+k " + (i + j + k));
	}
}

public class P1_SimpleInheritance {
	public static void main(String[] args) {
		A superObj = new A();
		B subObj = new B();

		// the superclass may be used by itself
		superObj.i = 1000;
		superObj.j = 2000;
		System.out.println("contents of superObj");
		superObj.showij();

		// the subclass has access to all public members of its superclass
		subObj.i = 1;
		subObj.j = 2;
		subObj.k = 3;
		System.out.println("contents of subObj");
		subObj.showij();
		subObj.showk();

		System.out.println("sum if i,j,k in subObj");
		subObj.sum();
	}
}
