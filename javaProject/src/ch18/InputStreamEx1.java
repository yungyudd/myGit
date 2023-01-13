package ch18;

import java.io.InputStream;

//stream 객체들은 1byte단위로 스트림 처리하며, 영문,대소문자,숫자,특수문자만 처리할 수 있다.(한글처리불가 2byte)
public class InputStreamEx1 {
	public static void main(String[] args) {
		InputStream is = System.in;//대표적으로 System.in은 InputStream이다.
		System.out.print("문자를 입력하세요:");
		try {//입출력, 네트워크, DB는 필수적 예외처리
			int code = is.read();//키보드로부터 1byte를 읽음, 
			System.out.println(code);
			char ch = (char)code;//모든 문자에는 고유한 숫자코드가 있다.
			System.out.println("char: "+ch);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
