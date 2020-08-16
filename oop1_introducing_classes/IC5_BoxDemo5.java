package oop1_introducing_classes;

//This program includes a method inside the box class.
public class IC5_BoxDemo5 {
	public static void main(String[] args) {
		Box box1 = new Box();
		Box box2 = new Box();

		box1.setDim(1, 2, 3);
		box2.setDim(10, 20, 30);

		System.out.println("Volume is: " + box1.volume2());
		System.out.println("Volume is: " + box2.volume2());
	}
}
