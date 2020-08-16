package oop2_closer_look_at_methods_and_classes;

//Another example that uses recursion
class RecTest{
	int values[];
	
	RecTest(int i){
		values = new int[i];
	}
	
	//display array --recursively
	void printArray(int i) {
		if(i==0)
			return;
		else
			printArray(i-1);
		System.out.println("[" + (i-1) + "] " + values[i-1]);
	}
}

public class P7_Recursion2 {
	public static void main(String[] args) {
		RecTest obj = new RecTest(10);
		for(int i=0; i<10; i++) {
			obj.values[i] = i+1;
		}
		obj.printArray(10);
	}
}
