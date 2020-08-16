package oop1_introducing_classes;

//This program declares two Box objects.
public class IC2_BoxDemo2 {
	public static void main(String[] args) {
		Box box1 = new Box();
		Box box2 = new Box();
		double vol;

		// assign values to mybox1's instance variables
		box1.width = 10;
		box1.height = 20;
		box1.depth = 30;

		/* assign different values to mybox2's
		instance variables */
		box2.width = 1;
		box2.height = 2;
		box2.depth = 3;

		vol = box1.width * box1.height * box1.depth;
		System.out.println("Volume is: " + vol);

		vol = box2.width * box2.height * box2.depth;
		System.out.println("Volume is: " + vol);
	}
}
