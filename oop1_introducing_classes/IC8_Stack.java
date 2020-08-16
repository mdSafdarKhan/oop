package oop1_introducing_classes;

//This program includes a method inside the box class.
public class IC8_Stack {
	
	int[] items = new int[10];
	int top = -1;
	
	void push(int item) {
		if(top == 9) {
			System.err.println("Stack is full.");
		}
		else {
			items[++top] = item;
		}
	}
	
	int pop() {
		if(top < 0) {
			System.out.println("Stack is empty.");
			return 0;
		}
		else {
			return items[top--];
		}
	}
}
