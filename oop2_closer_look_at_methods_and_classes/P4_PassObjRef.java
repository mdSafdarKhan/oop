package oop2_closer_look_at_methods_and_classes;

//Objects are passed through their references.
public class P4_PassObjRef {

	int x, y;
	
	public P4_PassObjRef(int a, int b) {
		x = a;
		y = b;
	}
	
	void test(P4_PassObjRef obj) {
		obj.x *= 22;
		obj.y *=9;
	}
	
	public static void main(String[] args) {
		P4_PassObjRef obj = new P4_PassObjRef(10, 20);
		
		System.out.println("Before x " + obj.x + ", y " + obj.y);
		obj.test(obj);
		System.out.println("After x " + obj.x + ", y " + obj.y);
	}

}
