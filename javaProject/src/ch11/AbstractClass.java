package ch11;

public abstract class AbstractClass { //하나라도 abstract 메소드가 있으면 클래스도 abstract해야 한다.
	
	void method2() {
		System.out.println("완성된 method");
	}
	abstract void method1(); //추상메소드

}
