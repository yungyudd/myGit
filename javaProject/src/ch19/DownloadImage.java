package ch19;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadImage {
	public static void main(String[] args) throws MalformedURLException {
		String website = "https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[168013]_20210415155746379.jpg";
		System.out.println("다운로드를 시작합니다.");
		URL url = new URL(website);
		//byte 배열
		byte[] buffer = new byte[2048];
		//파일로 저장 <== 프로그램 <== 서버의 이미지 파일
		//try~ with문 (Java 1.7부터 도입)
		//try(리소스 선언부) { } 
		//finally가 없어도 리소스를 자동으로 종료시킴
		try(InputStream in=url.openStream(); OutputStream out = new FileOutputStream("c:\\test\\test.jpg")) {
			int length=0;
			while((length=in.read(buffer)) != -1) { //읽을 내용이 있으면
				System.out.println(length+"바이트 읽음");
				//출력스트림.write(버퍼, 시작인덱스, 길이)
				out.write(buffer, 0, length);
			}
			System.out.println("다운이 완료되었습니다.");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
