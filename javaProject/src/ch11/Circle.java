package ch11;

public class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("원을 그리기 중심 x좌표값: " +x);
		System.out.println("원을 그리기 중심 y좌표값: " +y);
	}

}
