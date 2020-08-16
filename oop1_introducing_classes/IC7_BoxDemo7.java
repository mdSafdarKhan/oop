package oop1_introducing_classes;

//This program includes a method inside the box class.
public class IC7_BoxDemo7 {
	public static void main(String[] args) {
		Box box1 = new Box(1.1, 2.2, 3.3);
		Box box2 = new Box(1, 2, 3);

		System.out.println("Volume is: " + box1.volume2());
		System.out.println("Volume is: " + box2.volume2());
	}
}
