package ch18;

import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class RandomFile {
	public static void main(String[] args) {
		String str = null;
		try {
			RandomAccessFile file = new RandomAccessFile("c:\\test\\rand.txt", "rw");
			System.out.println(file.getFilePointer());
			//getFilePointer() 파일포인터(파일을 어디까지 읽었는지 가리킴)
			file.seek(8);//8번째 인덱스부터
			System.out.println(file.getFilePointer());
			file.write("Hi".getBytes()); //Hi로 기존내용을 덮어씀
			System.out.println(file.length());//문자길이 한글은 3byte
			System.out.println(file.getFilePointer());
			while(file.getFilePointer()< file.length()) {
				//파일의 내용보다 파일포인터의 위치값이 적으면 반복
				str=file.readLine();
				//String(문자열, 캐릭터셋) 인코딩방식 변환
				//iso-8859-1, 8859_1:서유렵 인코딩 방식
				//utf-8: 3바이트
				str = new String(str.getBytes("8859_1"),"utf-8");//한글처리
			}
			System.out.println(file.length());
			System.out.println(file.getFilePointer());
			file.close();//파일 저장시점
			System.out.println("파일이 저장됨");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
