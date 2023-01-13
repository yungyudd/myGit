package ch09;

public class ScholarUse {
	public static void main(String[] args) {
		Scholar s1 = new Scholar();
		// 1. 부모클래스인 Student 객체가 생성
		// 2. Student 생성자 호출
		// 3. Scholar 객체가 생성
		// 4. Scholar 생성자 호출
		s1.input("김철수", "2017", "컴공", 4, "1종", 25000000);
		s1.print();
		
		s1.input("김정수", "2022", "전자", 1); //자식클래스에게 가서 없으면 부모클래스로 찾아감
		s1.print2();

	}

}
