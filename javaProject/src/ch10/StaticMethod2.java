package ch10;

public class StaticMethod2 {
	static int num = 10;
	static String name = "홍길동";
	String email = "hong@gmail.com";
	String hp = "010-1234-5678";
	String addr = "서울 강남구 역삼동";
	
	public static void printA() {
		System.out.println("====printA()====");
		System.out.println("사번: "+num);
		System.out.println("이름: "+name);
		StaticMethod2 s1 = new StaticMethod2();
		System.out.println("이메일: "+s1.email);
		System.out.println("전화: "+s1.hp);
		System.out.println("주소: "+s1.addr);
	}
	public void printB() {
		System.out.println("====printB()====");
		System.out.println("사번: "+num);
		System.out.println("이름: "+name);
		System.out.println("이메일: "+email);
		System.out.println("전화: "+hp);
		System.out.println("주소: "+addr);
	}
	public static void main(String[] args) {
		StaticMethod2 s2 = new StaticMethod2();
		printA();
		s2.printB();
	}

}
