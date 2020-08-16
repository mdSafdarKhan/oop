package oop1_introducing_classes;

//This program includes a method inside the box class.
public class IC4_BoxDemo4 {
	public static void main(String[] args) {
		Box box1 = new Box();
		Box box2 = new Box();

		// assign values to mybox1's instance variables
		box1.width = 11;
		box1.height = 21;
		box1.depth = 310;

		/* assign different values to mybox2's
		instance variables */
		box2.width = 11;
		box2.height = 12;
		box2.depth = 13;

		System.out.println("Volume is: " + box1.volume2());
		System.out.println("Volume is: " + box2.volume2());
	}
}
