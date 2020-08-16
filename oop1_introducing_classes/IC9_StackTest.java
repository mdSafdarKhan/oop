package oop1_introducing_classes;

//This program includes a method inside the box class.
public class IC9_StackTest {
	
	public static void main(String[] args) {
		IC8_Stack stack1 = new IC8_Stack();
		IC8_Stack stack2 = new IC8_Stack();
		
		//Push some data into stack.
		for(int i=0; i<10; i++)
			stack1.push(i);
		for(int i=0; i<20; i++)
			stack2.push(i);
		
		//Pop the number from stacks.
		System.out.println("Stack1");
		for(int i=0; i<10; i++)
			System.out.println(stack1.pop());
		for(int i=0; i<10; i++)
			System.out.println(stack2.pop());
	}
}
