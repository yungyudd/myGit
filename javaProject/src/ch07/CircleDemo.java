package ch07;

public class CircleDemo {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.radius = 10.0;
		c.show(c.radius, c.findArea());  //10.0, 3.14*10.0*10.0
	}
}


class Circle	{
	//멤버 변수
	double radius;
	
	//멤버 메소드
	double findArea() {
		return 3.14 * radius * radius;
	}
	void show(double x, double y) {
		System.out.println("반지름 = %.1f, 넓이 = %.1f\n");
	}
}