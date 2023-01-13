package ch06;

public class CallEx {
	//메소드의 위치는 메인 메소드 위아래 상관 없다.
		public static void test(int b) {
			System.out.println("test Method 호출");
			System.out.println(b);
		}
		public static void main(String[] args) {
			System.out.println("시작"); //1
			int a = 10; 
			test(a); //2
			test2(a); //3
			System.out.println("끝"); //4

	}
		private static void test2(int a) {
			System.out.println(a);
		}

}
