package ch10;

class Pa{
	String name = "홍길동";
	public void print() {
		System.out.println("이름: "+name);
	}
}

class Ch extends Pa{
	int age = 30;

	@Override
	public void print() {
		super.print();
		System.out.println("나이: " +age);
	}
	
}
public class Ploy2 {
	public static void main(String[] args) {
		String tel = "010-2222-2222";
		Pa c = new Ch();
		c.print();
		System.out.println("전화번호: " +tel);

	}

}
