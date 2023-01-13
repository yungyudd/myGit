package ch11;

public class StudentUse extends Slnfo{

	public static void main(String[] args) {
		StudentUse s = new StudentUse();
		s.address("홍길동", "서울 강남구", "hong@gmail.com");
		s.point(90, 85, 79);
		s.print();
	}

}
