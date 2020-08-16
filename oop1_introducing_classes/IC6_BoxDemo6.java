package oop1_introducing_classes;

//This program includes a method inside the box class.
public class IC6_BoxDemo6 {
	public static void main(String[] args) {
		Box box1 = new Box();
		Box box2 = new Box();

		System.out.println("Volume is: " + box1.volume2());
		System.out.println("Volume is: " + box2.volume2());
	}
}
