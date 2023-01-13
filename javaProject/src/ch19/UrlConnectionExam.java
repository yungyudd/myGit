package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlConnectionExam {
	public static void main(String[] args) {
		URL url=null;
		try {
			url = new URL("http://google.com");
			//url 접속시도 ==> 성공하면 접속정보를 conn에 저장
			//실패하면 conn의 값이 null이 됨
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			if(conn != null) {
				//서버에서 일정 시간 응답이 없으면 연결을 종료시킴
				conn.setConnectTimeout(3000); 
				StringBuilder sb = new StringBuilder();
				if(conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
					//스트림을 사용해서 html 소스코드를 읽어옴
					//버퍼사용
					BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
					while(true) {
						String line = br.readLine();
						if(line == null) break;
						sb.append(line+"\r\n"); //줄바꿈 문자 추가
					}
					br.close();
				}
				conn.disconnect(); //http 연결 종료
				System.out.println(sb);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
