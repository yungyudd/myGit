package ch06;

public class CallStackTest2 {

	public static void main(String[] args) {
		System.out.println("main(String[] args이 시작되었음.");
		firstMethod();
		System.out.println("main(String[] args이 끝.");

	}

	static void firstMethod() {
		System.out.println("firstMethod 시작되었음.");
		secondMethod();
		System.out.println("firstMethod 끝.");
	}

	static void secondMethod() {
		System.out.println("secondMthod 시작");
		System.out.println("secondMthod 끝");
	}

}
