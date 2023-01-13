package ch11;

public class Rectangle extends Shape{

	@Override
	public void draw() {
		System.out.println("사각형 그리기 시작 x좌표값:  " +x);
		System.out.println("사각형 그리기 시작 y좌표값:  " +y);
	}

}
