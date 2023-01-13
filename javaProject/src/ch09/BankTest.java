package ch09;

class Bank{
	double getInterestRate() { //Bank의 멤버메소드
		return 0.0;
	}
}
class BadBank extends Bank{
	//@: 어노테이션(Annotation)이라고 하며 컴파일러에게 추가적인 정보를 제공하는 메타데이터로
	//주석으로 활용하거나 또는 프로그램에게 특정기능을 정의하거나 실행하도록 정보 제공용으로 사용한다.
	//스프링에서는 본격적으로 활용한다.
	@Override
	double getInterestRate() {//메소드 오버라이딩(재정의)
		return 10.0;
	}
}

class NormalBank extends Bank{
	@Override
	double getInterestRate() {
		return 5.0;
	}
}

class GoodBank extends Bank{
	@Override
	double getInterestRate() {	
		return 3.0;
	}
}

public class BankTest {

	public static void main(String[] args) {
		BadBank b = new BadBank();
		NormalBank n = new NormalBank();
		GoodBank g = new GoodBank();
		System.out.println("Badbank의 이자율 :" +b.getInterestRate());
		System.out.println("Normalbank의 이자율 :" +n.getInterestRate());
		System.out.println("Goodbank의 이자율 :" +g.getInterestRate());

	}

}
