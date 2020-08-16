package oop1_introducing_classes;

//This program includes a method inside the box class.
public class IC3_BoxDemo3 {
	public static void main(String[] args) {
		Box box1 = new Box();
		Box box2 = new Box();

		// assign values to mybox1's instance variables
		box1.width = 10111;
		box1.height = 2011;
		box1.depth = 3110;

		/* assign different values to mybox2's
		instance variables */
		box2.width = 11;
		box2.height = 12;
		box2.depth = 13;

		box1.volume();
		box2.volume();
	}
}
