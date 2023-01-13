package ch12;

public class MemberOuter {
	private static int num = 1;
	private static String name = "홍길동";
	private static String email = "hong@gmail.com";
	
	class TestInner {
		void print() {
			System.out.println("-----------------------------------");
			System.out.println("고객번호: "+num);
			System.out.println("이름: "+name);
			System.out.println("이메일: "+email);
			System.out.println("-----------------------------------");
		}
	}
	
	public static void main(String[] args) {
		MemberOuter m = new MemberOuter();
		MemberOuter.TestInner te = m.new TestInner();
		te.print();
	}

}
