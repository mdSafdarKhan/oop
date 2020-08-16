package oop1_introducing_classes;

/* A program that uses the Box class.
Call this file BoxDemo.java
*/
public class Box {
	double width;
	double height;
	double depth;

	// This is the constructor for Box.
	Box() {
		System.out.println("Constructing Box");
		width = 10;
		height = 10;
		depth = 10;
	}

	// This is the constructor for Box.
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// display volume of the box.
	void volume() {
		System.out.println("Volume is: " + (width * height * depth));
	}

	// compute and return volume
	double volume2() {
		return width * height * depth;
	}

	// set dimensions of box.
	void setDim(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
}
