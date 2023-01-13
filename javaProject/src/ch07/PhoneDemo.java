package ch07;

//한개의 파일에 2개 이상의 class를 작성할때는 main메소드가 있는 public class를 클래스이름으로 저장해야함
//다른 파일은 접근제어지정자가 default로 처리되어야 함.
class Phone{
	String model;
	int value;
	void print() {
		System.out.println(value + "만원 짜리" +model+ "스마트폰 입니다.");
	}
}




public class PhoneDemo { //실행파일
	public static void main(String[] args) {
		Phone p = new Phone(); //객체생성
		p.model = "갤럭시 s21";
		p.value = 100;
		p.print();
		
		Phone ph = new Phone(); //객체생성
		ph.model = "아이폰 11";
		ph.value = 150;
		ph.print();
	}

}
