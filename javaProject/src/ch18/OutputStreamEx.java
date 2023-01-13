package ch18;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		OutputStream os = ps; //PrintStream객체를 부모타입인 OutputStream으로 받아 처리
		//OutputStream도 1byte여서 한글은 안됨
		try {
			os.write(97);
			os.write(100);
			os.flush(); //flush()메소드를 써야 출력까지 된다.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
