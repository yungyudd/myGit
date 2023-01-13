package ch18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamEx {
	public static void main(String[] args) {
		try {
			//DataOutputStream은 이진파일(binary file)처리하는 객체
			DataOutputStream da = new DataOutputStream(new FileOutputStream("C:\\test\\test.dat"));
			da.writeInt(123); //숫자 형식의 자료를 파일에 저장
			da.writeChar('A');//문자 형식의 자료를 파일에 저장
			da.writeDouble(3.5);
			da.close(); //스트림 닫기(파일이 완성됨)
			System.out.println("저장되었습니다.");
			//DataInputStream은 이진파일 읽기위한 객체
			DataInputStream dain = new DataInputStream(new FileInputStream("c:\\test\\test.dat"));
			System.out.println(dain.readInt());
			System.out.println(dain.readChar());
			System.out.println(dain.readDouble());
			dain.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
