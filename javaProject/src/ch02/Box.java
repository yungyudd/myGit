package ch02;

public class Box {

	public static void main(String[] args) {
		double width = 10.0;
		double height = 5.0;
		double area;
		double perimeter;
		
		
		area = width * height;
		perimeter = (width+height)*2;
		
		System.out.println("사각형의 넓이: " + area);
		System.out.println("사각형의 둘레: " + perimeter);
	}
}
