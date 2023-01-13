package ch13;

public class StrBuilder {
	public static void main(String[] args) {
		//String 불변성
		//StringBuilder 가변성
		
		StringBuilder str1 = new StringBuilder();
		//StirngBuilder는 일반객체이기 때문에 String과는 달리 new해서 사용
		str1.append("java"); //append()는 문자열 내용 추가, 메모리 절약
		System.out.println(str1.toString());
		str1.append(" programming");
		System.out.println(str1);
		
		str1.replace(0, 4, "jsp");
		//참고 replace() 메소드는 주로 String객체의 replace()를 많이 쓰는 편이다.
		System.out.println(str1);
		String str2 = str1.substring(3);
		System.out.println(str1);
		System.out.println(str2);
		
		//StringBuilder를 String으로 바꿀 때는 toString()을 사용해야 한다.
		String str3 = str1.toString();
		System.out.println("StringBuilder(str1) -> String(str3)에 저장: " +str3);
		
		//String을 StringBuilder에 저장할 때
		str1 = new StringBuilder(str3);
		System.out.println("StringBuilder(str3) -> StringBuilder(str1)에 저장: " +str3);
	}

}
