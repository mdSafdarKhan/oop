package oop3_inheritence;

class Box {
	double width;
	double height;
	double depth;

	// construct clone of an object
	Box(Box b) {
		width = b.width;
		height = b.height;
		depth = b.depth;
	}

	// constructor used when all dimensions specified
	Box(double w, double h, double d) {
		// use -1 to indicate an uninitialized box
		width = w;
		height = h;
		depth = d;
	}

	// constructor used when no dimensions specified
	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}

	// constructor used when cube is created
	Box(double len) {
		width = height = depth = len;
	}

	// compute and return volume
	double volume() {
		return width * height * depth;
	}
}

//Here, Box is extended to include weight
class BoxWeight extends Box {

	double weight;

	// constructor for BoXWeight
	BoxWeight(double w, double h, double d, double m) {
		width = w;
		height = h;
		depth = d;
		weight = m;
	}

	// construct clone of an object
	BoxWeight(BoxWeight bw) {
		super(bw); // call super class constructor
		weight = bw.weight;
	}
}

public class P3_DemoBoxWeight {

	public static void main(String[] args) {
		BoxWeight mybox1 = new BoxWeight(1, 2, 3, 4);
		BoxWeight mybox2 = new BoxWeight(10, 20, 30, 40);
		double volume;
		volume = mybox1.volume();
		System.out.println("volume of mybox1 " + volume);
		System.out.println("weight of mybox1 " + mybox1.weight);

		volume = mybox2.volume();
		System.out.println("volume of mybox2 " + volume);
		System.out.println("weight of mybox2 " + mybox2.weight);
	}

}
