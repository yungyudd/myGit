package ch07;

public class BoxTest {
	public static void main(String[] args) {
		Box b; //객체형데이터 타입 참조변수
		b = new Box();
		b.height = 30;
		b.length = 80;
		b.width = 50;
		System.out.println("박스의 가로, 세로, 높이는 "+b.width+","+b.length+","+b.height+"입니다.");
	}

}
