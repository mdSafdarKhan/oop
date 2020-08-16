package oop1_introducing_classes;

//This class declares an object of type Box.
public class ic1_BoxDemo {
	public static void main(String[] args) {
		Box box = new Box();
		double vol;
		
		box.width = 10;
		box.height = 20;
		box.depth = 30;
		
		vol = box.width * box.height * box.depth;
		System.out.println("Volume is: " + vol);
	}
}
