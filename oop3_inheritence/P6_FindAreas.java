package oop3_inheritence;

class Figure{
	double dim1, dim2;
	Figure(double d1, double d2){
		dim1=d1;
		dim2=d2;
	}
	
	double area() {
		System.out.println("area for figure is undefined!");
		return 0;
	}
}
class Rectangle extends Figure{
	Rectangle(double d1, double d2){
		super(d1, d2);
	}
	@Override
	double area() {
		System.out.println("inside area for rectangle");
		return dim1*dim2;
	}
}
class Triangle extends Figure{
	Triangle(double d1, double d2){
		super(d1,d2);
	}
	@Override
	double area() {
		System.out.println("inside area of triangle");
		return dim1*dim2;
	}
}

public class P6_FindAreas {

	public static void main(String[] args) {
		Figure figure = new Figure(1,2);
		Rectangle rect = new Rectangle(2, 2);
		Triangle tri = new Triangle(2, 11111);
		
		Figure f;
		
		f = figure;
		System.out.println("area for figure " + f.area());
		
		f = rect;
		System.out.println("area for rectangle " + f.area());
		
		f = tri;
		System.out.println("area for triangle " + f.area());
	}

}
