package ch08;

class Circle {
	double radius;
	String color;
	public Circle(double r, String c) {
		radius = r;
		color = c;
	}
	public Circle(double r) {
		radius = r;
		color = "파랑";
	}
	public Circle(String c) {
		radius = 21.0;
		color = c;
	}
	public Circle() {
		radius = 3.4;
		color = "빨강";
	}
	public void print() {
		System.out.println("반지름: " +radius);
		System.out.println("색깔: "+color );
	}
}

public class CircleDemo {
	public static void main(String[] args) {
		Circle c1 = new Circle(10.0, "주황");
		c1.print();
		
		Circle c2 = new Circle(5.0);
		c2.print();
		
		Circle c3 = new Circle();
		c3.print();
		
		Circle c4 = new Circle("녹색");
		c4.print();
	}

}
