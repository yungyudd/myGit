package ch18;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

public class RandomFile2 {
	public static void main(String[] args) {
		OutputStream os = null;
		String str = null;
		try {
			os = new FileOutputStream("C:\\test\\rand2.txt");
			RandomAccessFile file = new RandomAccessFile("C:\\test\\rand2.txt", "rw");		
			System.out.println("문자 입력: ");
			while(true) {
				int ch = System.in.read();
				if(ch==13) break;
				os.write(ch);
			}
			System.out.println("저장되었습니다.");
			file.seek(9);
			file.write("park".getBytes());	
			while(file.getFilePointer()<file.length()) {
				str = file.readLine();
			}
			
			System.out.println("변경되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
