package ch18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class F3 {
	public static void main(String[] args) {
		OutputStream os = null;
		String str = "";
		BufferedReader re = null;
		BufferedWriter we = null;
		try {
			os = new FileOutputStream("C:\\test\\abc.txt");
			System.out.println("입력하세요: ");
			while(true) {
				int ch = System.in.read();
				if(ch == 13) break;
				os.write(ch);
			}
			System.out.println("파일 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		String file1 = "C:\\test\\abc.txt";
		String file2 = "C:\\test\\abcCopy.txt";
		try {
			re = new BufferedReader(new FileReader(new File(file1)));
			we = new BufferedWriter(new FileWriter(new File(file2)));
			while(true) {
				str = re.readLine();
				if(str==null) break;
				we.write(str+"\r\n");
			}
			System.out.println("파일이 복사되었습니다.");

		} catch (Exception e2) {
			e2.printStackTrace();
		}finally {
				try {
					if(re != null)re.close();
				} catch (IOException e) {
					e.printStackTrace();
				}try {
					if(we != null) we.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
	}

}
