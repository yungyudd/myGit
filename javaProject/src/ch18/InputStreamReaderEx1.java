package ch18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//InputStream: 1바이트 단위로 읽음
//InputStreamReader: 문자(2byte)단위로 읽음
public class InputStreamReaderEx1 {
	public static void main(String[] args) {
		InputStream is = System.in;
		//new InputStreamReader(InputStream) 처리해야함
		InputStreamReader isr = new InputStreamReader(is);
		System.out.println("한글자를 입력:");
		try {
			int code = isr.read(); //글자의 코드값
			System.out.println("code: "+code);
			char ch =(char)code; //문자
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
