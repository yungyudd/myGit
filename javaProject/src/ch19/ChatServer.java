package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
	public static void main(String[] args) throws Exception {
		ServerSocket ser = null;
		try {
			//서비스를 위한 포트 개방
			ser = new ServerSocket(5555);
			System.out.println("서비스가 시작되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("서비스를 시작할 수 없습니다.");
			System.exit(1);//비정상 종료
		}
		Socket clso = null;
		try {
			//클라이언트의 접속을 기다리다가 접속하면 소켓연결
			clso = ser.accept();
			System.out.println("클라이언트의 ip: "+clso.getInetAddress().getHostAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
		//발신용 스트림
		PrintWriter pw = new PrintWriter(clso.getOutputStream(), true);
		//수신용 스트림
		BufferedReader re = new BufferedReader(new InputStreamReader(clso.getInputStream()));
		String receive="";
		String send="Welcome!!";
		
		pw.println(send);
		Scanner sc = new Scanner(System.in);
		while(true) {
			receive = re.readLine(); //한라인 읽기
			if(re == null || re.equals("quit")) {
				break;
			}
			System.out.println("[client]"+receive);
			System.out.println("서버 입력(종료:quit):");
			send = sc.nextLine();
			pw.println(send);
			if(send.equals("quit")) break;
		}
		//리소스 정리
		sc.close();
		pw.close();
		re.close();
		clso.close();
		ser.close();
	}

}
