package oop3_inheritence;

public class P4_RefDemo {

	public static void main(String[] args) {
		BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
		Box plainbox = new Box();

		double vol;

		vol = weightbox.volume();
		System.out.println("volume of weigtbox is " + vol);
		System.out.println("weight of weightbox is " + weightbox.weight);

		// assign weightbox reference to plainbox
		plainbox = weightbox;

		vol = plainbox.volume();
		System.out.println("volume of plainbox is " + vol);

		// the following statement is invalid because plainbox does not define a weight
		// member
		//System.out.println("weight of plainbox is " + plainbox.weight);
	}

}
