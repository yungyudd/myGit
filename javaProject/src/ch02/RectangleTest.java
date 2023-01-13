package ch02;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		int width, height;
		double area;
		Scanner scan = new Scanner(System.in);
		System.out.print("직사각형의 가로 길이는?");
		width = scan.nextInt();
		System.out.print("직사각형의 세로 길이는?");
		height = scan.nextInt();
		scan.close();
		
		area = width*height;
		
		System.out.println("=================================");
		System.out.println("직사각형의 가로 길이를 입력하세요: " + width);
		System.out.println("직사각형의 가로 길이를 입력하세요: " + height);
		System.out.println("직사각형의 넓이는 "+area+ "입니다.");
		System.out.println("=================================");
	}

}
