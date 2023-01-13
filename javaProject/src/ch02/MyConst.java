package ch02;

public class MyConst {

	public static void main(String[] args) {
		final double PI = 3.14;
		double radius = 10.0;
		double area;
		area = radius * radius * PI;
		
		System.out.println("출력:\n원의 면적 = " + area);
	}
}
