package ch18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {
	public static void main(String[] args) {
		//복사본 = OutputStream객체사용 [프로그램] <== (InputStream객체 사용)원본
		String str="";
		BufferedReader re = null;
		BufferedWriter we = null;
		
		String file1 = "C:\\test\\aa.txt";
		String file2 = "C:\\test\\b.txt";
		
		try {
			re = new BufferedReader(new FileReader(new File(file1)));
			we = new BufferedWriter(new FileWriter(new File(file2)));
			while(true) {
				str = re.readLine();
				if(str == null) break;
				//파일을 기록할 때는 \r\n을 다써줘야 줄바꿈 처리됨
				we.write(str+"\r\n");
			}
			System.out.println("파일 복사가 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(re != null) re.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(we != null) we.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
