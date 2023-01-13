package ch13;

public class StringExam {
	public static void main(String[] args) {
		String st1 = new String("Hello ");
		String st2 = new String("Hello ");
		
		System.out.println(System.identityHashCode(st1));
		System.out.println(System.identityHashCode(st2));
		System.out.println("======= (==) 사용 ======");
		if(st1 == st2) {//주소값 비교
			System.out.println("st1과 st2는 같은 인스턴스를 참조");
		}else {
			System.out.println("st1과 st2는 다른 인스턴스를 참조");
		}
		
		System.out.println("======= equals() 사용 ======");
		if(st1.equals(st2)) {//내용 비교
			System.out.println("st1과 st2는 같은 값을 참조");
		}else {
			System.out.println("st1과 st2는 다른 값을 참조");
		}
	}

}
