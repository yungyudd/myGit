package ch07;

public class StudentUse {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("김윤규");
		s.setMajor("컴퓨터");
		s.setYear(4);
		s.setNum("1234");
		s.setPoint(3.6);
		s.setMoney(400);
		s.print();
	}

}
