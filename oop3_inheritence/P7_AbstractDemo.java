package oop3_inheritence;

abstract class Parent{
	abstract void callme();
	
	void callmetoo() {
		System.out.println("this is a concrete method");
	}
}
class Child extends Parent{

	@Override
	void callme() {
		System.out.println("child's implementation of callme");
	}
	
}

public class P7_AbstractDemo {

	public static void main(String[] args) {
		Child c=new Child();
		c.callme();
		c.callmetoo();
		
		//child class object can referenced to parent adbstract class too.
		Parent p;
		p = c;
		p.callme();
		p.callmetoo();
	}

}
