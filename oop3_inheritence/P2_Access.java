package oop3_inheritence;

/* In a class hierarchy, private members remain
private to their class.
This program contains an error and will not
compile.
*/

class A1{
	int i;
	private int j;
	
	void setj(int i, int j){
		this.i=i;
		this.j=j;
	}
}

class B1 extends A1{
	void sum() {
		//System.out.println(i+j); //error, j is not accessible here
	}
}
public class P2_Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
