package oop2_closer_look_at_methods_and_classes;

//A simple example of recursion.
class Factorial{
	//int i=0;
	//This is a recursive function.
	int fact(int n) {
		//i++;
		//System.out.println(i);
		int result;
		
		if(n==1)
			return 1;
		
		result = fact(n-1) * n;
		//i=0;
		return result;
	}
}

public class P6_Recursion {

	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println("Factorial of 3 is " + f.fact(3));
		System.out.println("Factorial of 4 is " + f.fact(4));
		System.out.println("Factorial of 5 is " + f.fact(5));
	}

}
