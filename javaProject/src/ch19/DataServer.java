package ch19;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataServer {
	public static void main(String[] args) throws Exception {
		//try~with
		try(ServerSocket ss = new ServerSocket(8000)){
			System.out.println("서비스가 시작되었습니다.");
			while(true) {
				//accept(): 클라이언트가 접속할때까지 대기 상태, 접속하면 소켓연결(논리적인 회선 연결)	
				Socket soc = ss.accept();
				PrintWriter out = new  PrintWriter(soc.getOutputStream(), true);
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
				//날짜포맷 yyyy, MM, dd, HH, mm, ss
				String str = sdf.format(new Date());
				out.println(str); //클라이언트에게 데이터 전송
				soc.close();	
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
