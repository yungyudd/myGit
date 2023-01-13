package ch10;

public class PloyEx {
	public static void main(String[] args) {
		int a=10;
		double b=20.1;
		char c= 'A';
		String d = "hello";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
		//최상위클래스인 Object는 모든타입을 다룰 수 있다.
		//그대로 사용하면 프로그램이 무거워지며 속도저하
		//1개의 자료형으로 다양한 형태의 자료형을 처리할 수 있는 능력을 다형성이라 한다.
		
		Object o = 21;
		System.out.println(o);
		
		Object o1 = 2.24;
		System.out.println(o1);
		
		Object o2 = 'a';
		System.out.println(o2);
		
		Object o3 = "dsdkd";
		System.out.println(o3);
	}

}
