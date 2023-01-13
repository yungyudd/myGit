package ch14;

public class Type3<T> {//자료형이 미정인 상태 <아무문자>  =>  <>: 제너릭 기호
	T t; //변수도 자료형 미정
	public Type3() { //만약 생성자처리를 하고자한다면 <T>를 빼고 처리한다.
		
	}
	public Type3(T a) {//생성자 매개변수를 쓴다면 타입은 위에서 정한 T로 처리해야한다.
		t=a;
	}
	public void setT(T t) {//메소드도 생성자 매개변수처리와 같다.
		this.t = t;
	}
	public T getT() {
		return t;
	}
	public static void main(String[] args) {
		//인스턴스를 생성할 때 자료형을 결정함. => 제너릭(일반화)이라 함.
		Type3<String> t = new Type3<String>();
		t.setT("Hello");
		System.out.println(t.getT());
		Type3<Integer> t2 = new Type3<Integer>();
		t2.setT(100);
		System.out.println(t2.getT());
		Type3<Double> t3 = new Type3<Double>(200.5);
		System.out.println(t3.getT());
		
		//<>자료형을 주지 않고 일반적으로 처리시 실행은 됨
		//내부적으로 모두 object로 처리하게 되어 메모리 낭비가 심해짐
		Type3 t4 = new Type3();
		t4.setT(1.55);
		System.out.println(t4.getT());
		t4.setT("sert");
		System.out.println(t4.getT());
	}

}
