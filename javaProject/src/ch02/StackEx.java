package ch02;

public class StackEx {

	public static void main(String[] args) {
		int a=5; a=4; a=3; //지연변수 초기화 
		System.out.println(a);
		//stack은 LIFO(last in first out) 후입선출
		// 마지막에 들어간 값만 남는다.
	}

}
