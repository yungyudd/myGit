package ch10;

class K{//부모클래스
	int a=10;
	public void print() {
		System.out.println(a);
	}
}

class V extends K {
	int a=20;

	@Override
	public void print() {
		System.out.println(a);
	}
	
}


public class Ploy {
	public static void main(String[] args) {
		V a = new V();
		a.print();
		K b = new K();
		b.print();
		
		K c = new V(); //다형성
		c.print();
		//다형성을 쓸 때 실제 참조변수가 가리키는 객체가 사용하고자 하는 객체가 맞는지 검사할때 instanceof 연산자를 쓸수 있다.
		System.out.println("c instanceof V ? : " + (c instanceof K));
	}

}
