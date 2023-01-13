package ch18;

import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderWhile {
	public static void main(String[] args) {
		int var = 0;
		InputStream in = System.in;
		InputStreamReader inr = new InputStreamReader(in);
		System.out.println("한글을 입력하세요:");
		try {
			int code = inr.read();
			while(var != 13) {
				System.out.println("code="+code);
				char ch = (char)code;
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}